-- Crea una tabla temporal donde se almacenaran los datos de las ubicaciones
declare @ubicaciones as table(
	name varchar(16),
	almacen varchar(2),
	area varchar(2),
	calle varchar(2),
	modulo varchar(2),
	nivel varchar(2),
	fila varchar(2),
	columna varchar(2),
	profundidad varchar(2)
)

--Consulta ubicaciones activas en LISA con sus respectivos campos y los agrega a la tabla temporal
insert into @ubicaciones
select name as ubicacion
     , SUBSTRING(name,1,2) almacen
	 , SUBSTRING(name,3,2) area
	 , SUBSTRING(name,5,2) calle
	 , SUBSTRING(name,7,2) modulo
	 , SUBSTRING(name,9,2) nivel
	 , SUBSTRING(name,11,2) fila
	 , SUBSTRING(name,13,2) columna
	 , SUBSTRING(name,15,2) profundidad
from locations
where active = 1
and idwarehouse = 1
and len(name) = 16
and SUBSTRING(name,1,1) <> '.'
and SUBSTRING(name,1,2) <> '00'
order by name

select 'Code,AbsEntry,Warehouse,Sublevel1,Sublevel2,Sublevel3,Sublevel4,BinCode,Inactive,Description,AlternativeSortCode,BarCode,Attribute1,Attribute2,Attribute3,Attribute4,Attribute5,Attribute6,Attribute7,Attribute8,Attribute9,Attribute10,RestrictedItemType,SpecificItem,SpecificItemGroup,BatchRestrictions,RestrictedTransType,RestrictionReason,DateRestrictionChanged,MinimumQty,MaximumQty,IsSystemBin,ReceivingBinLocation'
union all
select 'Code,AbsEntry,Warehouse,Sublevel1,Sublevel2,Sublevel3,Sublevel4,BinCode,Inactive,Description,AlternativeSortCode,BarCode,Attribute1,Attribute2,Attribute3,Attribute4,Attribute5,Attribute6,Attribute7,Attribute8,Attribute9,Attribute10,RestrictedItemType,SpecificItem,SpecificItemGroup,BatchRestrictions,RestrictedTransType,RestrictionReason,DateRestrictionChanged,MinimumQty,MaximumQty,IsSystemBin,ReceivingBinLocation'
union all
select ',,' + almacen + ',' + area + calle + ',' + modulo + nivel + ',' + fila + columna + ',' + profundidad + ',' + name + ',tNO,,,' + (case when nivel = '00' then 'PICKING' else 'STORAGE' end) + ',,,,,,,,,,,briNone,,,,brtNoRestrictions,,,,,tNO,tNO'
from @ubicaciones
