--Obtiene encabezados y valores para OWTR
select 'DocEntry,Series,Printed,DocDate,CardCode,CardName,Address,Reference1,Reference2,Comments,JournalMemo,PriceList,SalesPersonCode,FromWarehouse,TaxDate,ContactPerson,FolioPrefixString,FolioNumber,DocObjectCode' as 'OWTR'
union all
select 'DocEntry,Series,Printed,DocDate,CardCode,CardName,Address,Ref1,Ref2,Comments,JrnlMemo,GroupNum,SlpCode,Filler,TaxDate,CntctCode,FolioPref,FolioNum,ObjType'
union all
select cast(ROW_NUMBER ()  OVER(order by pro.InternIDProduct) as varchar(5)) + ',24,tNO,' + concat(datepart(year,getdate()), datepart(month,getdate()),datepart(day,getdate())) + ',P811011909,,,,,CONFIGURACION DE SALDOS EN UBICACIONES SAP,CONFIGURACION DE SALDOS EN UBICACIONES SAP,,,01,,,,,'
from inventory inv
inner join Product pro on pro.IDProduct = inv.IDProduct
inner join Locations loc on loc.idLocation = inv.idLocation and loc.IdWarehouse = 1
where len(loc.name) = 16

--Obtiene encabezados y valores para WTR1
select 'ParentKey,LineNum,ItemCode,ItemDescription,Quantity,Price,Currency,Rate,DiscountPercent,VendorNum,SerialNumber,WarehouseCode,ProjectCode,Factor,Factor2,Factor3,Factor4,DistributionRule,UseBaseUnits,MeasureUnit,UnitsOfMeasurment' as 'WTR1'
union all
select 'DocNum,LineNum,ItemCode,Dscription,Quantity,Price,Currency,Rate,DiscPrcnt,VendorNum,SerialNum,WhsCode,Project,Factor1,Factor2,Factor3,Factor4,OcrCode,UseBaseUn,unitMsr,NumPerMsr'
union all
select cast(ROW_NUMBER ()  OVER(order by pro.InternIDProduct) as varchar(5)) + ',0,' + pro.InternIDProduct + ',,' + cast(cast(inv.quantity as int) as varchar(6)) + ',,,,,,,01,,,,,,,tNO,,'
from inventory inv
inner join Product pro on pro.IDProduct = inv.IDProduct
inner join Locations loc on loc.idLocation = inv.idLocation and loc.IdWarehouse = 1
where len(loc.name) = 16

--Obtiene encabezados y valores para WTR19
select 'ParentKey,LineNum,BinAbsEntry,Quantity,AllowNegativeQuantity,SerialAndBatchNumbersBaseLine,BinActionType,BaseLineNumber' as 'WTR19'
union all
select 'DocNum,LineNum,BinAbs,Quantity,AllowNeg,SnBMDAbs,BinActTyp,LineNum' as 'WTR19'
union all
--Movimientos de salida de ubicacion por defecto
select cast(ROW_NUMBER ()  OVER(order by pro.InternIDProduct) as varchar(5)) + --docnum
       ',0,1,' +  --linenum, binabs
	   cast(cast(inv.quantity as int) as varchar(6)) + --quantity
	   ',tNO,,2,0' as 'WTR19' --AllowNeg,SnBMDAbs,BinActTyp,LineNum
from inventory inv
inner join Product pro on pro.IDProduct = inv.IDProduct
inner join Locations loc on loc.idLocation = inv.idLocation and loc.IdWarehouse = 1
where len(loc.name) = 16
union all
--Movimientos de entrada a ubicacion de destino
-- cast((select AbsEntry from PRUEBAS_IGB_WMS.dbo.OBIN where bincode collate database_default = loc.name) as varchar(10))
select cast(ROW_NUMBER ()  OVER(order by pro.InternIDProduct) as varchar(5)) + --docnum
       ',1,' + --linenum
	   cast((select AbsEntry from PRUEBAS_IGB_WMS.dbo.OBIN where bincode collate database_default = loc.name) as varchar(10)) + ',' + --binabs
	   cast(cast(inv.quantity as int) as varchar(6)) + --quantity
	   ',tNO,,1,0' as 'WTR19' --AllowNeg,SnBMDAbs,BinActTyp,LineNum
from inventory inv
inner join Product pro on pro.IDProduct = inv.IDProduct
inner join Locations loc on loc.idLocation = inv.idLocation and loc.IdWarehouse = 1
where len(loc.name) = 16
