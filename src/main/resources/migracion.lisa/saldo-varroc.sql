
select 'DocEntry,Series,Printed,DocDate,CardCode,CardName,Address,Reference1,Reference2,Comments,JournalMemo,PriceList,SalesPersonCode,FromWarehouse,TaxDate,ContactPerson,FolioPrefixString,FolioNumber,DocObjectCode' as 'OWTR'
union all
select 'DocEntry,Series,Printed,DocDate,CardCode,CardName,Address,Ref1,Ref2,Comments,JrnlMemo,GroupNum,SlpCode,Filler,TaxDate,CntctCode,FolioPref,FolioNum,ObjType'
union all
select '1,24,tNO,' + concat(datepart(year,getdate()), right('0'+cast(datepart(month,getdate()) as varchar(2)),2),datepart(day,getdate())) + ',C900255414,,,,,TRASLADO SALDO A UB DE INVENTARIO,TRASLADO SALDO A UB DE INVENTARIO,,,09,,,,,'

select 'ParentKey,LineNum,ItemCode,ItemDescription,Quantity,Price,Currency,Rate,DiscountPercent,VendorNum,SerialNumber,WarehouseCode,ProjectCode,Factor,Factor2,Factor3,Factor4,DistributionRule,UseBaseUnits,MeasureUnit,UnitsOfMeasurment' as 'WTR1'
union all
select 'DocNum,LineNum,ItemCode,Dscription,Quantity,Price,Currency,Rate,DiscPrcnt,VendorNum,SerialNum,WhsCode,Project,Factor1,Factor2,Factor3,Factor4,OcrCode,UseBaseUn,unitMsr,NumPerMsr'
union all
select '1,' + cast(ROW_NUMBER ()  OVER(order by binQty.itemcode)-1 as varchar(5)) + ',' + binQty.itemcode + ',,' + cast(cast(binQty.onhandqty as int) as varchar(6)) + ',,,,,,,09,,,,,,,tNO,,'
from oibq binQty

--Obtiene encabezados y valores para WTR19
declare @inventoryBinAbs as int
declare @items as int
select @inventoryBinAbs = absentry from obin where sl1code = 'INVENTARIO'
select @items = count(1) from oibq
select 'ParentKey,LineNum,BinAbsEntry,Quantity,AllowNegativeQuantity,SerialAndBatchNumbersBaseLine,BinActionType,BaseLineNumber' as 'WTR19'
union all
select 'DocNum,LineNum,BinAbs,Quantity,AllowNeg,SnBMDAbs,BinActTyp,LineNum' as 'WTR19'
union all
--Movimientos de salida de ubicacion de sistema
select '1,' + --docnum
       cast((ROW_NUMBER ()  OVER(order by binQty.itemcode))-1 as varchar(5)) + --linenum
       ',1,' +  --binabs
	   cast(cast(binQty.onhandqty as int) as varchar(6)) + --quantity
	   ',tNO,,2,' + 
	   cast((ROW_NUMBER ()  OVER(order by binQty.itemcode))-1 as varchar(5)) as 'WTR19' --AllowNeg,SnBMDAbs,BinActTyp,LineNum
from oibq binQty
union all
--Movimiento de entrada a ubicacion de inventario
select '1,' + --docnum
       cast((ROW_NUMBER ()  OVER(order by binQty.itemcode))+@items-1 as varchar(5)) + ',' + --linenum
	   cast(@inventoryBinAbs as varchar(6)) + ',' + --binabs
	   cast(cast(binQty.onhandqty as int) as varchar(6)) + --quantity
	   ',tNO,,1,0' + --AllowNeg,SnBMDAbs,BinActTyp
	   cast((ROW_NUMBER ()  OVER(order by binQty.itemcode))-1 as varchar(5))  as 'WTR19' --linenum 
from oibq binQty
