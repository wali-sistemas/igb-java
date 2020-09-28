
package co.igb.b1ws.client.item;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForeignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemsGroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomsGroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesVATGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VatLiable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PurchaseItem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SalesItem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InventoryItem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IncomeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExemptIncomeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpanseAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mainsupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierCatalogNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DesiredInventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinInventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="User_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CommissionSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CommissionGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TreeType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="iNotATree"/&gt;
 *               &lt;enumeration value="iAssemblyTree"/&gt;
 *               &lt;enumeration value="iSalesTree"/&gt;
 *               &lt;enumeration value="iProductionTree"/&gt;
 *               &lt;enumeration value="iTemplateTree"/&gt;
 *               &lt;enumeration value="iIngredient"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AssetItem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DataExportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOnStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOrderedFromVendors" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOrderedByCustomers" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ManageSerialNumbers" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ManageBatchNumbers" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Valid" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ValidRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frozen" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FrozenFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FrozenTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FrozenRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesItemsPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesPackagingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesQtyPerPackUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesLengthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesWidthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesHeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesWeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseItemsPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchasePackagingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseQtyPerPackUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseLengthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseWidthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseHeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseWeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseVATGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesFactor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesFactor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesFactor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesFactor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseFactor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseFactor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseFactor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseFactor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MovingAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ForeignRevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECRevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForeignExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvgStdPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DefaultWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GLMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="glm_WH"/&gt;
 *               &lt;enumeration value="glm_ItemClass"/&gt;
 *               &lt;enumeration value="glm_ItemLevel"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tt_Yes"/&gt;
 *               &lt;enumeration value="tt_No"/&gt;
 *               &lt;enumeration value="tt_UseTax"/&gt;
 *               &lt;enumeration value="tt_OffsetTax"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaxInventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ManageStockByWarehouse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PurchaseHeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitHeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseLengthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitLength1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseWeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitWeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseWidthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseUnitWidth1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesHeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitHeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesLengthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitLength1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesWeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitWeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SalesWidthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitWidth1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ForceSelectionOfSerialNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ManageSerialNumbersOnReleaseOnly" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTLiable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CostAccountingMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="bis_MovingAverage"/&gt;
 *               &lt;enumeration value="bis_Standard"/&gt;
 *               &lt;enumeration value="bis_FIFO"/&gt;
 *               &lt;enumeration value="bis_SNB"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarrantyTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndirectTax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ArTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemCountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="im_Backflush"/&gt;
 *               &lt;enumeration value="im_Manual"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRIAndBatchManageMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="bomm_OnEveryTransaction"/&gt;
 *               &lt;enumeration value="bomm_OnReleaseOnly"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsPhantom" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InventoryUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanningSystem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="bop_MRP"/&gt;
 *               &lt;enumeration value="bop_None"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProcurementMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="bom_Buy"/&gt;
 *               &lt;enumeration value="bom_Make"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComponentWarehouse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="bomcw_BOM"/&gt;
 *               &lt;enumeration value="bomcw_Parent"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderIntervals" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderMultiple" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MinOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ItemType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="itItems"/&gt;
 *               &lt;enumeration value="itLabor"/&gt;
 *               &lt;enumeration value="itTravel"/&gt;
 *               &lt;enumeration value="itFixedAssets"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemClass" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="itcService"/&gt;
 *               &lt;enumeration value="itcMaterial"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OutgoingServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IncomingServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NCMCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaterialType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="mt_GoodsForReseller"/&gt;
 *               &lt;enumeration value="mt_FinishedGoods"/&gt;
 *               &lt;enumeration value="mt_GoodsInProcess"/&gt;
 *               &lt;enumeration value="mt_RawMaterial"/&gt;
 *               &lt;enumeration value="mt_Package"/&gt;
 *               &lt;enumeration value="mt_SubProduct"/&gt;
 *               &lt;enumeration value="mt_IntermediateMaterial"/&gt;
 *               &lt;enumeration value="mt_ConsumerMaterial"/&gt;
 *               &lt;enumeration value="mt_FixedAsset"/&gt;
 *               &lt;enumeration value="mt_Service"/&gt;
 *               &lt;enumeration value="mt_OtherInput"/&gt;
 *               &lt;enumeration value="mt_Other"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaterialGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ProductSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Properties1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties41" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties42" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties43" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties44" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties45" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties46" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties47" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties48" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties49" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties51" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties52" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties53" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties54" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties55" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties56" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties57" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties58" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties59" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties61" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties62" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties63" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties64" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AutoCreateSerialNumbersOnRelease" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DNFEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GTSItemSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GTSItemTaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FuelID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BeverageTableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeverageGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeverageCommercialBrandCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ToleranceDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfAdvancedRules" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="toarGeneral"/&gt;
 *               &lt;enumeration value="toarWarehouse"/&gt;
 *               &lt;enumeration value="toarItemGroup"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IssuePrimarilyBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ipbSerialAndBatchNumbers"/&gt;
 *               &lt;enumeration value="ipbBinLocations"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NoDiscounts" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventoryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Technician" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Employee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AssetStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="New"/&gt;
 *               &lt;enumeration value="Active"/&gt;
 *               &lt;enumeration value="Inactive"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CapitalizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="StatisticalAsset" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cession" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeactivateAfterUsefulLife" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ManageByQuantity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UoMGroupEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InventoryUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultSalesUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultPurchasingUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DepreciationGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventoryWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="InventoryWeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InventoryWeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="InventoryWeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultCountingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountingItemsPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DefaultCountingUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Excisable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="tNO"/&gt;
 *               &lt;enumeration value="tYES"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChapterID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ScsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpProdType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="sptMT"/&gt;
 *               &lt;enumeration value="sptIO"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="U_Subgrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Procedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Cod_Anterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_COSTOIMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_FEC_CREA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="U_UNI_PRO_VTAS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="U_VLGX_VIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_VLGX_ORD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="U_VLGX_BOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_VLGX_PLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_VLGX_SUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Varroc_Item_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_WMS_Velocity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Aplicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_NWR_SCRP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="U_NWRWOPO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="U_NWR_MATRIX" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="U_NWR_AutoShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Tipo_Inventario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_Responsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="U_VLGX_CA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemPrices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemPrice" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BasePriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="UoMPrices" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Auto" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="tNO"/&gt;
 *                                                       &lt;enumeration value="tYES"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemWarehouseInfoCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemWarehouseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="MinimalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="MaximalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="MinimalOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="StandardAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Locked" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="tNO"/&gt;
 *                                   &lt;enumeration value="tYES"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="InventoryAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CostAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VarienceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DecreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IncreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ReturningAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EURevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EUExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ForeignRevenueAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ForeignExpensAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ExemptIncomeAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PriceDifferenceAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="InStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="WasCounted" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="tNO"/&gt;
 *                                   &lt;enumeration value="tYES"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UserSignature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Counted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="ExpenseClearingAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EUPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ForeignPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SalesCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SalesCreditEUAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ExemptedCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SalesCreditForeignAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ExpenseOffsettingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WipAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ExchangeRateDifferencesAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GoodsClearingAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NegativeInventoryAdjustmentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CostInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GLDecreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GLIncreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAReturnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PurchaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PurchaseOffsetAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ShippedGoodsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="StockInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="StockInflationAdjustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VATInRevenueAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WipVarianceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CostInflationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WHIncomingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WHOutgoingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="StockInTransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WipOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="InventoryOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DefaultBin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="DefaultBinEnforced" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="tNO"/&gt;
 *                                   &lt;enumeration value="tYES"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PurchaseBalanceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_UBIC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_UBIC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_UBIC3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_UBIC4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_UBIC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_VLGX_RHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_VLGX_NSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="U_VLGX_POL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ItemCycleCounts" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Alert" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="tNO"/&gt;
 *                                                       &lt;enumeration value="tYES"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *                                                 &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemPreferredVendors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemPreferredVendor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="BPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemLocalizationInfos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemLocalizationInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IncomeNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemProjects" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemProject" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemDistributionRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemDistributionRule" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemAttributeGroups" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemAttributeGroups" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute33" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute34" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute35" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute37" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute38" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute39" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute40" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute41" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute42" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute43" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute44" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute45" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute46" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute47" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute48" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute49" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute50" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute51" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute52" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute53" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute54" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute55" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute57" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute58" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute59" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute60" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute61" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute62" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute63" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Attribute64" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemDepreciationParameters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemDepreciationParameter" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="DepreciationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="UsefulLife" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="RemainingLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="DepreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemPeriodControls" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemPeriodControl" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="DepreciationStatus" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="tNO"/&gt;
 *                                   &lt;enumeration value="tYES"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemUnitOfMeasurementCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemUnitOfMeasurement" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="UoMType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="iutPurchasing"/&gt;
 *                                   &lt;enumeration value="iutSales"/&gt;
 *                                   &lt;enumeration value="iutInventory"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="DefaultBarcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="DefaultPackage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="ItemUoMPackageCollection" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="UoMType" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="iutPurchasing"/&gt;
 *                                                       &lt;enumeration value="iutSales"/&gt;
 *                                                       &lt;enumeration value="iutInventory"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemBarCodeCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemBarCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="AbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemIntrastatExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="SupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="FactorOfSupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="ImportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ExportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ImportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ExportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ImportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ExportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="Type" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="dDocument_Items"/&gt;
 *                         &lt;enumeration value="dDocument_Service"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ServiceSupplyMethod" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="ssmImmediate"/&gt;
 *                         &lt;enumeration value="ssmToMoreResumptions"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ServicePaymentMethod" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="spmAccreditedToBankAccount"/&gt;
 *                         &lt;enumeration value="spmBankTransfer"/&gt;
 *                         &lt;enumeration value="spmOther"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ImportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UseWeightInCalculation" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="tNO"/&gt;
 *                         &lt;enumeration value="tYES"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IntrastatRelevant" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="tNO"/&gt;
 *                         &lt;enumeration value="tYES"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="StatisticalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Item")
public class Item {

    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ForeignName")
    protected String foreignName;
    @XmlElement(name = "ItemsGroupCode")
    protected Long itemsGroupCode;
    @XmlElement(name = "CustomsGroupCode")
    protected Long customsGroupCode;
    @XmlElement(name = "SalesVATGroup")
    protected String salesVATGroup;
    @XmlElement(name = "BarCode")
    protected String barCode;
    @XmlElement(name = "VatLiable")
    protected String vatLiable;
    @XmlElement(name = "PurchaseItem")
    protected String purchaseItem;
    @XmlElement(name = "SalesItem")
    protected String salesItem;
    @XmlElement(name = "InventoryItem")
    protected String inventoryItem;
    @XmlElement(name = "IncomeAccount")
    protected String incomeAccount;
    @XmlElement(name = "ExemptIncomeAccount")
    protected String exemptIncomeAccount;
    @XmlElement(name = "ExpanseAccount")
    protected String expanseAccount;
    @XmlElement(name = "Mainsupplier")
    protected String mainsupplier;
    @XmlElement(name = "SupplierCatalogNo")
    protected String supplierCatalogNo;
    @XmlElement(name = "DesiredInventory")
    protected Double desiredInventory;
    @XmlElement(name = "MinInventory")
    protected Double minInventory;
    @XmlElement(name = "Picture")
    protected String picture;
    @XmlElement(name = "User_Text")
    protected String userText;
    @XmlElement(name = "SerialNum")
    protected String serialNum;
    @XmlElement(name = "CommissionPercent")
    protected Double commissionPercent;
    @XmlElement(name = "CommissionSum")
    protected Double commissionSum;
    @XmlElement(name = "CommissionGroup")
    protected Long commissionGroup;
    @XmlElement(name = "TreeType")
    protected String treeType;
    @XmlElement(name = "AssetItem")
    protected String assetItem;
    @XmlElement(name = "DataExportCode")
    protected String dataExportCode;
    @XmlElement(name = "Manufacturer")
    protected Long manufacturer;
    @XmlElement(name = "QuantityOnStock")
    protected Double quantityOnStock;
    @XmlElement(name = "QuantityOrderedFromVendors")
    protected Double quantityOrderedFromVendors;
    @XmlElement(name = "QuantityOrderedByCustomers")
    protected Double quantityOrderedByCustomers;
    @XmlElement(name = "ManageSerialNumbers")
    protected String manageSerialNumbers;
    @XmlElement(name = "ManageBatchNumbers")
    protected String manageBatchNumbers;
    @XmlElement(name = "Valid")
    protected String valid;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
    @XmlElement(name = "ValidRemarks")
    protected String validRemarks;
    @XmlElement(name = "Frozen")
    protected String frozen;
    @XmlElement(name = "FrozenFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frozenFrom;
    @XmlElement(name = "FrozenTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frozenTo;
    @XmlElement(name = "FrozenRemarks")
    protected String frozenRemarks;
    @XmlElement(name = "SalesUnit")
    protected String salesUnit;
    @XmlElement(name = "SalesItemsPerUnit")
    protected Double salesItemsPerUnit;
    @XmlElement(name = "SalesPackagingUnit")
    protected String salesPackagingUnit;
    @XmlElement(name = "SalesQtyPerPackUnit")
    protected Double salesQtyPerPackUnit;
    @XmlElement(name = "SalesUnitLength")
    protected Double salesUnitLength;
    @XmlElement(name = "SalesLengthUnit")
    protected Long salesLengthUnit;
    @XmlElement(name = "SalesUnitWidth")
    protected Double salesUnitWidth;
    @XmlElement(name = "SalesWidthUnit")
    protected Long salesWidthUnit;
    @XmlElement(name = "SalesUnitHeight")
    protected Double salesUnitHeight;
    @XmlElement(name = "SalesHeightUnit")
    protected Long salesHeightUnit;
    @XmlElement(name = "SalesUnitVolume")
    protected Double salesUnitVolume;
    @XmlElement(name = "SalesVolumeUnit")
    protected Long salesVolumeUnit;
    @XmlElement(name = "SalesUnitWeight")
    protected Double salesUnitWeight;
    @XmlElement(name = "SalesWeightUnit")
    protected Long salesWeightUnit;
    @XmlElement(name = "PurchaseUnit")
    protected String purchaseUnit;
    @XmlElement(name = "PurchaseItemsPerUnit")
    protected Double purchaseItemsPerUnit;
    @XmlElement(name = "PurchasePackagingUnit")
    protected String purchasePackagingUnit;
    @XmlElement(name = "PurchaseQtyPerPackUnit")
    protected Double purchaseQtyPerPackUnit;
    @XmlElement(name = "PurchaseUnitLength")
    protected Double purchaseUnitLength;
    @XmlElement(name = "PurchaseLengthUnit")
    protected Long purchaseLengthUnit;
    @XmlElement(name = "PurchaseUnitWidth")
    protected Double purchaseUnitWidth;
    @XmlElement(name = "PurchaseWidthUnit")
    protected Long purchaseWidthUnit;
    @XmlElement(name = "PurchaseUnitHeight")
    protected Double purchaseUnitHeight;
    @XmlElement(name = "PurchaseHeightUnit")
    protected Long purchaseHeightUnit;
    @XmlElement(name = "PurchaseUnitVolume")
    protected Double purchaseUnitVolume;
    @XmlElement(name = "PurchaseVolumeUnit")
    protected Long purchaseVolumeUnit;
    @XmlElement(name = "PurchaseUnitWeight")
    protected Double purchaseUnitWeight;
    @XmlElement(name = "PurchaseWeightUnit")
    protected Long purchaseWeightUnit;
    @XmlElement(name = "PurchaseVATGroup")
    protected String purchaseVATGroup;
    @XmlElement(name = "SalesFactor1")
    protected Double salesFactor1;
    @XmlElement(name = "SalesFactor2")
    protected Double salesFactor2;
    @XmlElement(name = "SalesFactor3")
    protected Double salesFactor3;
    @XmlElement(name = "SalesFactor4")
    protected Double salesFactor4;
    @XmlElement(name = "PurchaseFactor1")
    protected Double purchaseFactor1;
    @XmlElement(name = "PurchaseFactor2")
    protected Double purchaseFactor2;
    @XmlElement(name = "PurchaseFactor3")
    protected Double purchaseFactor3;
    @XmlElement(name = "PurchaseFactor4")
    protected Double purchaseFactor4;
    @XmlElement(name = "MovingAveragePrice")
    protected Double movingAveragePrice;
    @XmlElement(name = "ForeignRevenuesAccount")
    protected String foreignRevenuesAccount;
    @XmlElement(name = "ECRevenuesAccount")
    protected String ecRevenuesAccount;
    @XmlElement(name = "ForeignExpensesAccount")
    protected String foreignExpensesAccount;
    @XmlElement(name = "ECExpensesAccount")
    protected String ecExpensesAccount;
    @XmlElement(name = "AvgStdPrice")
    protected Double avgStdPrice;
    @XmlElement(name = "DefaultWarehouse")
    protected String defaultWarehouse;
    @XmlElement(name = "ShipType")
    protected Long shipType;
    @XmlElement(name = "GLMethod")
    protected String glMethod;
    @XmlElement(name = "TaxType")
    protected String taxType;
    @XmlElement(name = "MaxInventory")
    protected Double maxInventory;
    @XmlElement(name = "ManageStockByWarehouse")
    protected String manageStockByWarehouse;
    @XmlElement(name = "PurchaseHeightUnit1")
    protected Long purchaseHeightUnit1;
    @XmlElement(name = "PurchaseUnitHeight1")
    protected Double purchaseUnitHeight1;
    @XmlElement(name = "PurchaseLengthUnit1")
    protected Long purchaseLengthUnit1;
    @XmlElement(name = "PurchaseUnitLength1")
    protected Double purchaseUnitLength1;
    @XmlElement(name = "PurchaseWeightUnit1")
    protected Long purchaseWeightUnit1;
    @XmlElement(name = "PurchaseUnitWeight1")
    protected Double purchaseUnitWeight1;
    @XmlElement(name = "PurchaseWidthUnit1")
    protected Long purchaseWidthUnit1;
    @XmlElement(name = "PurchaseUnitWidth1")
    protected Double purchaseUnitWidth1;
    @XmlElement(name = "SalesHeightUnit1")
    protected Long salesHeightUnit1;
    @XmlElement(name = "SalesUnitHeight1")
    protected Double salesUnitHeight1;
    @XmlElement(name = "SalesLengthUnit1")
    protected Long salesLengthUnit1;
    @XmlElement(name = "SalesUnitLength1")
    protected Double salesUnitLength1;
    @XmlElement(name = "SalesWeightUnit1")
    protected Long salesWeightUnit1;
    @XmlElement(name = "SalesUnitWeight1")
    protected Double salesUnitWeight1;
    @XmlElement(name = "SalesWidthUnit1")
    protected Long salesWidthUnit1;
    @XmlElement(name = "SalesUnitWidth1")
    protected Double salesUnitWidth1;
    @XmlElement(name = "ForceSelectionOfSerialNumber")
    protected String forceSelectionOfSerialNumber;
    @XmlElement(name = "ManageSerialNumbersOnReleaseOnly")
    protected String manageSerialNumbersOnReleaseOnly;
    @XmlElement(name = "WTLiable")
    protected String wtLiable;
    @XmlElement(name = "CostAccountingMethod")
    protected String costAccountingMethod;
    @XmlElement(name = "SWW")
    protected String sww;
    @XmlElement(name = "WarrantyTemplate")
    protected String warrantyTemplate;
    @XmlElement(name = "IndirectTax")
    protected String indirectTax;
    @XmlElement(name = "ArTaxCode")
    protected String arTaxCode;
    @XmlElement(name = "ApTaxCode")
    protected String apTaxCode;
    @XmlElement(name = "BaseUnitName")
    protected String baseUnitName;
    @XmlElement(name = "ItemCountryOrg")
    protected String itemCountryOrg;
    @XmlElement(name = "IssueMethod")
    protected String issueMethod;
    @XmlElement(name = "SRIAndBatchManageMethod")
    protected String sriAndBatchManageMethod;
    @XmlElement(name = "IsPhantom")
    protected String isPhantom;
    @XmlElement(name = "InventoryUOM")
    protected String inventoryUOM;
    @XmlElement(name = "PlanningSystem")
    protected String planningSystem;
    @XmlElement(name = "ProcurementMethod")
    protected String procurementMethod;
    @XmlElement(name = "ComponentWarehouse")
    protected String componentWarehouse;
    @XmlElement(name = "OrderIntervals")
    protected Long orderIntervals;
    @XmlElement(name = "OrderMultiple")
    protected Double orderMultiple;
    @XmlElement(name = "LeadTime")
    protected Long leadTime;
    @XmlElement(name = "MinOrderQuantity")
    protected Double minOrderQuantity;
    @XmlElement(name = "ItemType")
    protected String itemType;
    @XmlElement(name = "ItemClass")
    protected String itemClass;
    @XmlElement(name = "OutgoingServiceCode")
    protected Long outgoingServiceCode;
    @XmlElement(name = "IncomingServiceCode")
    protected Long incomingServiceCode;
    @XmlElement(name = "ServiceGroup")
    protected Long serviceGroup;
    @XmlElement(name = "NCMCode")
    protected Long ncmCode;
    @XmlElement(name = "MaterialType")
    protected String materialType;
    @XmlElement(name = "MaterialGroup")
    protected Long materialGroup;
    @XmlElement(name = "ProductSource")
    protected String productSource;
    @XmlElement(name = "Properties1")
    protected String properties1;
    @XmlElement(name = "Properties2")
    protected String properties2;
    @XmlElement(name = "Properties3")
    protected String properties3;
    @XmlElement(name = "Properties4")
    protected String properties4;
    @XmlElement(name = "Properties5")
    protected String properties5;
    @XmlElement(name = "Properties6")
    protected String properties6;
    @XmlElement(name = "Properties7")
    protected String properties7;
    @XmlElement(name = "Properties8")
    protected String properties8;
    @XmlElement(name = "Properties9")
    protected String properties9;
    @XmlElement(name = "Properties10")
    protected String properties10;
    @XmlElement(name = "Properties11")
    protected String properties11;
    @XmlElement(name = "Properties12")
    protected String properties12;
    @XmlElement(name = "Properties13")
    protected String properties13;
    @XmlElement(name = "Properties14")
    protected String properties14;
    @XmlElement(name = "Properties15")
    protected String properties15;
    @XmlElement(name = "Properties16")
    protected String properties16;
    @XmlElement(name = "Properties17")
    protected String properties17;
    @XmlElement(name = "Properties18")
    protected String properties18;
    @XmlElement(name = "Properties19")
    protected String properties19;
    @XmlElement(name = "Properties20")
    protected String properties20;
    @XmlElement(name = "Properties21")
    protected String properties21;
    @XmlElement(name = "Properties22")
    protected String properties22;
    @XmlElement(name = "Properties23")
    protected String properties23;
    @XmlElement(name = "Properties24")
    protected String properties24;
    @XmlElement(name = "Properties25")
    protected String properties25;
    @XmlElement(name = "Properties26")
    protected String properties26;
    @XmlElement(name = "Properties27")
    protected String properties27;
    @XmlElement(name = "Properties28")
    protected String properties28;
    @XmlElement(name = "Properties29")
    protected String properties29;
    @XmlElement(name = "Properties30")
    protected String properties30;
    @XmlElement(name = "Properties31")
    protected String properties31;
    @XmlElement(name = "Properties32")
    protected String properties32;
    @XmlElement(name = "Properties33")
    protected String properties33;
    @XmlElement(name = "Properties34")
    protected String properties34;
    @XmlElement(name = "Properties35")
    protected String properties35;
    @XmlElement(name = "Properties36")
    protected String properties36;
    @XmlElement(name = "Properties37")
    protected String properties37;
    @XmlElement(name = "Properties38")
    protected String properties38;
    @XmlElement(name = "Properties39")
    protected String properties39;
    @XmlElement(name = "Properties40")
    protected String properties40;
    @XmlElement(name = "Properties41")
    protected String properties41;
    @XmlElement(name = "Properties42")
    protected String properties42;
    @XmlElement(name = "Properties43")
    protected String properties43;
    @XmlElement(name = "Properties44")
    protected String properties44;
    @XmlElement(name = "Properties45")
    protected String properties45;
    @XmlElement(name = "Properties46")
    protected String properties46;
    @XmlElement(name = "Properties47")
    protected String properties47;
    @XmlElement(name = "Properties48")
    protected String properties48;
    @XmlElement(name = "Properties49")
    protected String properties49;
    @XmlElement(name = "Properties50")
    protected String properties50;
    @XmlElement(name = "Properties51")
    protected String properties51;
    @XmlElement(name = "Properties52")
    protected String properties52;
    @XmlElement(name = "Properties53")
    protected String properties53;
    @XmlElement(name = "Properties54")
    protected String properties54;
    @XmlElement(name = "Properties55")
    protected String properties55;
    @XmlElement(name = "Properties56")
    protected String properties56;
    @XmlElement(name = "Properties57")
    protected String properties57;
    @XmlElement(name = "Properties58")
    protected String properties58;
    @XmlElement(name = "Properties59")
    protected String properties59;
    @XmlElement(name = "Properties60")
    protected String properties60;
    @XmlElement(name = "Properties61")
    protected String properties61;
    @XmlElement(name = "Properties62")
    protected String properties62;
    @XmlElement(name = "Properties63")
    protected String properties63;
    @XmlElement(name = "Properties64")
    protected String properties64;
    @XmlElement(name = "AutoCreateSerialNumbersOnRelease")
    protected String autoCreateSerialNumbersOnRelease;
    @XmlElement(name = "DNFEntry")
    protected Long dnfEntry;
    @XmlElement(name = "GTSItemSpec")
    protected String gtsItemSpec;
    @XmlElement(name = "GTSItemTaxCategory")
    protected String gtsItemTaxCategory;
    @XmlElement(name = "FuelID")
    protected Long fuelID;
    @XmlElement(name = "BeverageTableCode")
    protected String beverageTableCode;
    @XmlElement(name = "BeverageGroupCode")
    protected String beverageGroupCode;
    @XmlElement(name = "BeverageCommercialBrandCode")
    protected Long beverageCommercialBrandCode;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "ToleranceDays")
    protected Long toleranceDays;
    @XmlElement(name = "TypeOfAdvancedRules")
    protected String typeOfAdvancedRules;
    @XmlElement(name = "IssuePrimarilyBy")
    protected String issuePrimarilyBy;
    @XmlElement(name = "NoDiscounts")
    protected String noDiscounts;
    @XmlElement(name = "AssetClass")
    protected String assetClass;
    @XmlElement(name = "AssetGroup")
    protected String assetGroup;
    @XmlElement(name = "InventoryNumber")
    protected String inventoryNumber;
    @XmlElement(name = "Technician")
    protected Long technician;
    @XmlElement(name = "Employee")
    protected Long employee;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElement(name = "AssetStatus")
    protected String assetStatus;
    @XmlElement(name = "CapitalizationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar capitalizationDate;
    @XmlElement(name = "StatisticalAsset")
    protected String statisticalAsset;
    @XmlElement(name = "Cession")
    protected String cession;
    @XmlElement(name = "DeactivateAfterUsefulLife")
    protected String deactivateAfterUsefulLife;
    @XmlElement(name = "ManageByQuantity")
    protected String manageByQuantity;
    @XmlElement(name = "UoMGroupEntry")
    protected Long uoMGroupEntry;
    @XmlElement(name = "InventoryUoMEntry")
    protected Long inventoryUoMEntry;
    @XmlElement(name = "DefaultSalesUoMEntry")
    protected Long defaultSalesUoMEntry;
    @XmlElement(name = "DefaultPurchasingUoMEntry")
    protected Long defaultPurchasingUoMEntry;
    @XmlElement(name = "DepreciationGroup")
    protected String depreciationGroup;
    @XmlElement(name = "AssetSerialNumber")
    protected String assetSerialNumber;
    @XmlElement(name = "InventoryWeight")
    protected Double inventoryWeight;
    @XmlElement(name = "InventoryWeightUnit")
    protected Long inventoryWeightUnit;
    @XmlElement(name = "InventoryWeight1")
    protected Double inventoryWeight1;
    @XmlElement(name = "InventoryWeightUnit1")
    protected Long inventoryWeightUnit1;
    @XmlElement(name = "DefaultCountingUnit")
    protected String defaultCountingUnit;
    @XmlElement(name = "CountingItemsPerUnit")
    protected Double countingItemsPerUnit;
    @XmlElement(name = "DefaultCountingUoMEntry")
    protected Long defaultCountingUoMEntry;
    @XmlElement(name = "Excisable")
    protected String excisable;
    @XmlElement(name = "ChapterID")
    protected Long chapterID;
    @XmlElement(name = "ScsCode")
    protected String scsCode;
    @XmlElement(name = "SpProdType")
    protected String spProdType;
    @XmlElement(name = "InCostRollup")
    protected String inCostRoll;
    @XmlElement(name = "VirtualAssetItem")
    protected String virtAstItm;
    @XmlElement(name = "EnforceAssetSerialNumbers")
    protected String enAstSeri;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "UpdateTime")
    protected String updateTime;
    @XmlElement(name = "GSTRelevnt")
    protected String gstRelevnt;
    @XmlElement(name = "SACEntry")
    protected Long sacEntry;
    @XmlElement(name = "GSTTaxCategory")
    protected String gstTaxCtg;
    @XmlElement(name = "ServiceCategoryEntry")
    protected Long serviceCtg;
    @XmlElement(name = "AssessableValue")
    protected Double assblValue;
    @XmlElement(name = "AssVal4WTR")
    protected Double assVal4WTR;
    @XmlElement(name = "SOIExcisable")
    protected String soiExc;
    @XmlElement(name = "ImportedItem")
    protected String imported;
    @XmlElement(name = "PricingPrc")
    protected Double pricingPrc;
    @XmlElement(name = "PricingUnit")
    protected Long priceUnit;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "CreateTime")
    protected String createTime;
    @XmlElement(name = "ItemAttributeGroups")
    protected String itmsGrpCod;
    @XmlElement(name = "U_Marcas_info")
    protected String uMarcasInfo;
    @XmlElement(name = "U_Grupo")
    protected String uGrupo;
    @XmlElement(name = "U_Subgrupo")
    protected String uSubgrupo;
    @XmlElement(name = "U_Marca")
    protected String uMarca;
    @XmlElement(name = "U_Procedencia")
    protected String uProcedencia;
    @XmlElement(name = "U_Modelo")
    protected String uModelo;
    @XmlElement(name = "U_Cod_Anterior")
    protected String uCodAnterior;
    @XmlElement(name = "U_COSTOIMP")
    protected String ucostoimp;
    @XmlElement(name = "U_FEC_CREA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufeccrea;
    @XmlSchemaType(name = "date")
    @XmlElement(name = "U_UNI_PRO_VTAS")
    protected Double uuniprovtas;
    @XmlElement(name = "U_VLGX_VIV")
    protected String uvlgxviv;
    @XmlElement(name = "U_VLGX_ORD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uvlgxord;
    @XmlSchemaType(name = "date")
    @XmlElement(name = "U_VLGX_BOM")
    protected String uvlgxbom;
    @XmlElement(name = "U_VLGX_PLN")
    protected String uvlgxpln;
    @XmlElement(name = "U_VLGX_SUP")
    protected String uvlgxsup;
    @XmlElement(name = "U_Varroc_Item_Code")
    protected String uVarrocItemCode;
    @XmlElement(name = "U_WMS_Velocity")
    protected String uwmsVelocity;
    @XmlElement(name = "U_Aplicacion")
    protected String uAplicacion;
    @XmlElement(name = "U_Type")
    protected String uType;
    @XmlElement(name = "U_NWR_SCRP")
    protected Double unwrscrp;
    @XmlElement(name = "U_NWRWOPO")
    protected Long unwrwopo;
    @XmlElement(name = "U_NWR_MATRIX")
    protected Long unwrmatrix;
    @XmlElement(name = "U_NWR_AutoShipment")
    protected String unwrAutoShipment;
    @XmlElement(name = "U_Tipo_Inventario")
    protected String uTipoInventario;
    @XmlElement(name = "U_Responsable")
    protected String uResponsable;
    @XmlElement(name = "U_VLGX_CA")
    protected String uvlgxca;
    @XmlElement(name = "U_CATEGORIA")
    protected String uCategoria;
    @XmlElement(name = "U_CATALOGO")
    protected String uCatalogo;
    @XmlElement(name = "U_TIPO")
    protected String uTipo;
    @XmlElement(name = "ItemPrices")
    protected Item.ItemPrices itemPrices;
    @XmlElement(name = "ItemWarehouseInfoCollection")
    protected Item.ItemWarehouseInfoCollection itemWarehouseInfoCollection;
    @XmlElement(name = "ItemPreferredVendors")
    protected Item.ItemPreferredVendors itemPreferredVendors;
    @XmlElement(name = "ItemLocalizationInfos")
    protected Item.ItemLocalizationInfos itemLocalizationInfos;
    @XmlElement(name = "ItemProjects")
    protected Item.ItemProjects itemProjects;
    @XmlElement(name = "ItemDistributionRules")
    protected Item.ItemDistributionRules itemDistributionRules;
    @XmlElement(name = "ItemBarCodeCollection")
    protected Item.ItemBarCodeCollection itemBarCodeCollection;
    @XmlElement(name = "ItemDepreciationParameters")
    protected Item.ItemDepreciationParameters itemDepreciationParameters;
    @XmlElement(name = "ItemIntrastatExtension")
    protected Item.ItemIntrastatExtension itemIntrastatExtension;
    @XmlElement(name = "ItemPeriodControls")
    protected Item.ItemPeriodControls itemPeriodControls;
    @XmlElement(name = "ItemUnitOfMeasurementCollection")
    protected Item.ItemUnitOfMeasurementCollection itemUnitOfMeasurementCollection;

    /**
     * Obtiene el valor de la propiedad itemCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Define el valor de la propiedad itemCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Obtiene el valor de la propiedad itemName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Define el valor de la propiedad itemName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getForeignName() {
        return foreignName;
    }

    /**
     * Define el valor de la propiedad foreignName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setForeignName(String value) {
        this.foreignName = value;
    }

    /**
     * Obtiene el valor de la propiedad itemsGroupCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getItemsGroupCode() {
        return itemsGroupCode;
    }

    /**
     * Define el valor de la propiedad itemsGroupCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setItemsGroupCode(Long value) {
        this.itemsGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customsGroupCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCustomsGroupCode() {
        return customsGroupCode;
    }

    /**
     * Define el valor de la propiedad customsGroupCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCustomsGroupCode(Long value) {
        this.customsGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad salesVATGroup.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesVATGroup() {
        return salesVATGroup;
    }

    /**
     * Define el valor de la propiedad salesVATGroup.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesVATGroup(String value) {
        this.salesVATGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad barCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Define el valor de la propiedad barCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Obtiene el valor de la propiedad vatLiable.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVatLiable() {
        return vatLiable;
    }

    /**
     * Define el valor de la propiedad vatLiable.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVatLiable(String value) {
        this.vatLiable = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseItem.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPurchaseItem() {
        return purchaseItem;
    }

    /**
     * Define el valor de la propiedad purchaseItem.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPurchaseItem(String value) {
        this.purchaseItem = value;
    }

    /**
     * Obtiene el valor de la propiedad salesItem.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesItem() {
        return salesItem;
    }

    /**
     * Define el valor de la propiedad salesItem.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesItem(String value) {
        this.salesItem = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryItem.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInventoryItem() {
        return inventoryItem;
    }

    /**
     * Define el valor de la propiedad inventoryItem.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInventoryItem(String value) {
        this.inventoryItem = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIncomeAccount() {
        return incomeAccount;
    }

    /**
     * Define el valor de la propiedad incomeAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIncomeAccount(String value) {
        this.incomeAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptIncomeAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExemptIncomeAccount() {
        return exemptIncomeAccount;
    }

    /**
     * Define el valor de la propiedad exemptIncomeAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExemptIncomeAccount(String value) {
        this.exemptIncomeAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad expanseAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpanseAccount() {
        return expanseAccount;
    }

    /**
     * Define el valor de la propiedad expanseAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpanseAccount(String value) {
        this.expanseAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad mainsupplier.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMainsupplier() {
        return mainsupplier;
    }

    /**
     * Define el valor de la propiedad mainsupplier.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMainsupplier(String value) {
        this.mainsupplier = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierCatalogNo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplierCatalogNo() {
        return supplierCatalogNo;
    }

    /**
     * Define el valor de la propiedad supplierCatalogNo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplierCatalogNo(String value) {
        this.supplierCatalogNo = value;
    }

    /**
     * Obtiene el valor de la propiedad desiredInventory.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getDesiredInventory() {
        return desiredInventory;
    }

    /**
     * Define el valor de la propiedad desiredInventory.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setDesiredInventory(Double value) {
        this.desiredInventory = value;
    }

    /**
     * Obtiene el valor de la propiedad minInventory.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getMinInventory() {
        return minInventory;
    }

    /**
     * Define el valor de la propiedad minInventory.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMinInventory(Double value) {
        this.minInventory = value;
    }

    /**
     * Obtiene el valor de la propiedad picture.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad userText.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserText() {
        return userText;
    }

    /**
     * Define el valor de la propiedad userText.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserText(String value) {
        this.userText = value;
    }

    /**
     * Obtiene el valor de la propiedad serialNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * Define el valor de la propiedad serialNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSerialNum(String value) {
        this.serialNum = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionPercent.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * Define el valor de la propiedad commissionPercent.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setCommissionPercent(Double value) {
        this.commissionPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionSum.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getCommissionSum() {
        return commissionSum;
    }

    /**
     * Define el valor de la propiedad commissionSum.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setCommissionSum(Double value) {
        this.commissionSum = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionGroup.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCommissionGroup() {
        return commissionGroup;
    }

    /**
     * Define el valor de la propiedad commissionGroup.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCommissionGroup(Long value) {
        this.commissionGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad treeType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTreeType() {
        return treeType;
    }

    /**
     * Define el valor de la propiedad treeType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTreeType(String value) {
        this.treeType = value;
    }

    /**
     * Obtiene el valor de la propiedad assetItem.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetItem() {
        return assetItem;
    }

    /**
     * Define el valor de la propiedad assetItem.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetItem(String value) {
        this.assetItem = value;
    }

    /**
     * Obtiene el valor de la propiedad dataExportCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataExportCode() {
        return dataExportCode;
    }

    /**
     * Define el valor de la propiedad dataExportCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataExportCode(String value) {
        this.dataExportCode = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setManufacturer(Long value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOnStock.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getQuantityOnStock() {
        return quantityOnStock;
    }

    /**
     * Define el valor de la propiedad quantityOnStock.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setQuantityOnStock(Double value) {
        this.quantityOnStock = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOrderedFromVendors.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getQuantityOrderedFromVendors() {
        return quantityOrderedFromVendors;
    }

    /**
     * Define el valor de la propiedad quantityOrderedFromVendors.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setQuantityOrderedFromVendors(Double value) {
        this.quantityOrderedFromVendors = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOrderedByCustomers.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getQuantityOrderedByCustomers() {
        return quantityOrderedByCustomers;
    }

    /**
     * Define el valor de la propiedad quantityOrderedByCustomers.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setQuantityOrderedByCustomers(Double value) {
        this.quantityOrderedByCustomers = value;
    }

    /**
     * Obtiene el valor de la propiedad manageSerialNumbers.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageSerialNumbers() {
        return manageSerialNumbers;
    }

    /**
     * Define el valor de la propiedad manageSerialNumbers.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageSerialNumbers(String value) {
        this.manageSerialNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad manageBatchNumbers.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageBatchNumbers() {
        return manageBatchNumbers;
    }

    /**
     * Define el valor de la propiedad manageBatchNumbers.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageBatchNumbers(String value) {
        this.manageBatchNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad valid.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValid() {
        return valid;
    }

    /**
     * Define el valor de la propiedad valid.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Obtiene el valor de la propiedad validFrom.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Define el valor de la propiedad validFrom.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad validTo.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Define el valor de la propiedad validTo.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Obtiene el valor de la propiedad validRemarks.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValidRemarks() {
        return validRemarks;
    }

    /**
     * Define el valor de la propiedad validRemarks.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValidRemarks(String value) {
        this.validRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad frozen.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrozen() {
        return frozen;
    }

    /**
     * Define el valor de la propiedad frozen.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrozen(String value) {
        this.frozen = value;
    }

    /**
     * Obtiene el valor de la propiedad frozenFrom.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFrozenFrom() {
        return frozenFrom;
    }

    /**
     * Define el valor de la propiedad frozenFrom.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFrozenFrom(XMLGregorianCalendar value) {
        this.frozenFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad frozenTo.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFrozenTo() {
        return frozenTo;
    }

    /**
     * Define el valor de la propiedad frozenTo.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFrozenTo(XMLGregorianCalendar value) {
        this.frozenTo = value;
    }

    /**
     * Obtiene el valor de la propiedad frozenRemarks.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrozenRemarks() {
        return frozenRemarks;
    }

    /**
     * Define el valor de la propiedad frozenRemarks.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrozenRemarks(String value) {
        this.frozenRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnit.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesUnit() {
        return salesUnit;
    }

    /**
     * Define el valor de la propiedad salesUnit.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesUnit(String value) {
        this.salesUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesItemsPerUnit.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesItemsPerUnit() {
        return salesItemsPerUnit;
    }

    /**
     * Define el valor de la propiedad salesItemsPerUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesItemsPerUnit(Double value) {
        this.salesItemsPerUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesPackagingUnit.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesPackagingUnit() {
        return salesPackagingUnit;
    }

    /**
     * Define el valor de la propiedad salesPackagingUnit.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesPackagingUnit(String value) {
        this.salesPackagingUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesQtyPerPackUnit.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesQtyPerPackUnit() {
        return salesQtyPerPackUnit;
    }

    /**
     * Define el valor de la propiedad salesQtyPerPackUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesQtyPerPackUnit(Double value) {
        this.salesQtyPerPackUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitLength.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitLength() {
        return salesUnitLength;
    }

    /**
     * Define el valor de la propiedad salesUnitLength.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitLength(Double value) {
        this.salesUnitLength = value;
    }

    /**
     * Obtiene el valor de la propiedad salesLengthUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesLengthUnit() {
        return salesLengthUnit;
    }

    /**
     * Define el valor de la propiedad salesLengthUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesLengthUnit(Long value) {
        this.salesLengthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWidth.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitWidth() {
        return salesUnitWidth;
    }

    /**
     * Define el valor de la propiedad salesUnitWidth.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitWidth(Double value) {
        this.salesUnitWidth = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWidthUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesWidthUnit() {
        return salesWidthUnit;
    }

    /**
     * Define el valor de la propiedad salesWidthUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesWidthUnit(Long value) {
        this.salesWidthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitHeight.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitHeight() {
        return salesUnitHeight;
    }

    /**
     * Define el valor de la propiedad salesUnitHeight.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitHeight(Double value) {
        this.salesUnitHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad salesHeightUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesHeightUnit() {
        return salesHeightUnit;
    }

    /**
     * Define el valor de la propiedad salesHeightUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesHeightUnit(Long value) {
        this.salesHeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitVolume.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitVolume() {
        return salesUnitVolume;
    }

    /**
     * Define el valor de la propiedad salesUnitVolume.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitVolume(Double value) {
        this.salesUnitVolume = value;
    }

    /**
     * Obtiene el valor de la propiedad salesVolumeUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesVolumeUnit() {
        return salesVolumeUnit;
    }

    /**
     * Define el valor de la propiedad salesVolumeUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesVolumeUnit(Long value) {
        this.salesVolumeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWeight.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitWeight() {
        return salesUnitWeight;
    }

    /**
     * Define el valor de la propiedad salesUnitWeight.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitWeight(Double value) {
        this.salesUnitWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWeightUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesWeightUnit() {
        return salesWeightUnit;
    }

    /**
     * Define el valor de la propiedad salesWeightUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesWeightUnit(Long value) {
        this.salesWeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnit.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPurchaseUnit() {
        return purchaseUnit;
    }

    /**
     * Define el valor de la propiedad purchaseUnit.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPurchaseUnit(String value) {
        this.purchaseUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseItemsPerUnit.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseItemsPerUnit() {
        return purchaseItemsPerUnit;
    }

    /**
     * Define el valor de la propiedad purchaseItemsPerUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseItemsPerUnit(Double value) {
        this.purchaseItemsPerUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchasePackagingUnit.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPurchasePackagingUnit() {
        return purchasePackagingUnit;
    }

    /**
     * Define el valor de la propiedad purchasePackagingUnit.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPurchasePackagingUnit(String value) {
        this.purchasePackagingUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseQtyPerPackUnit.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseQtyPerPackUnit() {
        return purchaseQtyPerPackUnit;
    }

    /**
     * Define el valor de la propiedad purchaseQtyPerPackUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseQtyPerPackUnit(Double value) {
        this.purchaseQtyPerPackUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitLength.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitLength() {
        return purchaseUnitLength;
    }

    /**
     * Define el valor de la propiedad purchaseUnitLength.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitLength(Double value) {
        this.purchaseUnitLength = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseLengthUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseLengthUnit() {
        return purchaseLengthUnit;
    }

    /**
     * Define el valor de la propiedad purchaseLengthUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseLengthUnit(Long value) {
        this.purchaseLengthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWidth.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitWidth() {
        return purchaseUnitWidth;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWidth.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitWidth(Double value) {
        this.purchaseUnitWidth = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWidthUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseWidthUnit() {
        return purchaseWidthUnit;
    }

    /**
     * Define el valor de la propiedad purchaseWidthUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseWidthUnit(Long value) {
        this.purchaseWidthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitHeight.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitHeight() {
        return purchaseUnitHeight;
    }

    /**
     * Define el valor de la propiedad purchaseUnitHeight.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitHeight(Double value) {
        this.purchaseUnitHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseHeightUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseHeightUnit() {
        return purchaseHeightUnit;
    }

    /**
     * Define el valor de la propiedad purchaseHeightUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseHeightUnit(Long value) {
        this.purchaseHeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitVolume.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitVolume() {
        return purchaseUnitVolume;
    }

    /**
     * Define el valor de la propiedad purchaseUnitVolume.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitVolume(Double value) {
        this.purchaseUnitVolume = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseVolumeUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseVolumeUnit() {
        return purchaseVolumeUnit;
    }

    /**
     * Define el valor de la propiedad purchaseVolumeUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseVolumeUnit(Long value) {
        this.purchaseVolumeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWeight.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitWeight() {
        return purchaseUnitWeight;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWeight.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitWeight(Double value) {
        this.purchaseUnitWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWeightUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseWeightUnit() {
        return purchaseWeightUnit;
    }

    /**
     * Define el valor de la propiedad purchaseWeightUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseWeightUnit(Long value) {
        this.purchaseWeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseVATGroup.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPurchaseVATGroup() {
        return purchaseVATGroup;
    }

    /**
     * Define el valor de la propiedad purchaseVATGroup.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPurchaseVATGroup(String value) {
        this.purchaseVATGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesFactor1() {
        return salesFactor1;
    }

    /**
     * Define el valor de la propiedad salesFactor1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesFactor1(Double value) {
        this.salesFactor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor2.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesFactor2() {
        return salesFactor2;
    }

    /**
     * Define el valor de la propiedad salesFactor2.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesFactor2(Double value) {
        this.salesFactor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor3.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesFactor3() {
        return salesFactor3;
    }

    /**
     * Define el valor de la propiedad salesFactor3.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesFactor3(Double value) {
        this.salesFactor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor4.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesFactor4() {
        return salesFactor4;
    }

    /**
     * Define el valor de la propiedad salesFactor4.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesFactor4(Double value) {
        this.salesFactor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseFactor1() {
        return purchaseFactor1;
    }

    /**
     * Define el valor de la propiedad purchaseFactor1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseFactor1(Double value) {
        this.purchaseFactor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor2.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseFactor2() {
        return purchaseFactor2;
    }

    /**
     * Define el valor de la propiedad purchaseFactor2.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseFactor2(Double value) {
        this.purchaseFactor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor3.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseFactor3() {
        return purchaseFactor3;
    }

    /**
     * Define el valor de la propiedad purchaseFactor3.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseFactor3(Double value) {
        this.purchaseFactor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor4.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseFactor4() {
        return purchaseFactor4;
    }

    /**
     * Define el valor de la propiedad purchaseFactor4.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseFactor4(Double value) {
        this.purchaseFactor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad movingAveragePrice.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getMovingAveragePrice() {
        return movingAveragePrice;
    }

    /**
     * Define el valor de la propiedad movingAveragePrice.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMovingAveragePrice(Double value) {
        this.movingAveragePrice = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignRevenuesAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getForeignRevenuesAccount() {
        return foreignRevenuesAccount;
    }

    /**
     * Define el valor de la propiedad foreignRevenuesAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setForeignRevenuesAccount(String value) {
        this.foreignRevenuesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad ecRevenuesAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getECRevenuesAccount() {
        return ecRevenuesAccount;
    }

    /**
     * Define el valor de la propiedad ecRevenuesAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setECRevenuesAccount(String value) {
        this.ecRevenuesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignExpensesAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getForeignExpensesAccount() {
        return foreignExpensesAccount;
    }

    /**
     * Define el valor de la propiedad foreignExpensesAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setForeignExpensesAccount(String value) {
        this.foreignExpensesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad ecExpensesAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getECExpensesAccount() {
        return ecExpensesAccount;
    }

    /**
     * Define el valor de la propiedad ecExpensesAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setECExpensesAccount(String value) {
        this.ecExpensesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad avgStdPrice.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getAvgStdPrice() {
        return avgStdPrice;
    }

    /**
     * Define el valor de la propiedad avgStdPrice.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setAvgStdPrice(Double value) {
        this.avgStdPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultWarehouse.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultWarehouse() {
        return defaultWarehouse;
    }

    /**
     * Define el valor de la propiedad defaultWarehouse.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultWarehouse(String value) {
        this.defaultWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad shipType.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getShipType() {
        return shipType;
    }

    /**
     * Define el valor de la propiedad shipType.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setShipType(Long value) {
        this.shipType = value;
    }

    /**
     * Obtiene el valor de la propiedad glMethod.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGLMethod() {
        return glMethod;
    }

    /**
     * Define el valor de la propiedad glMethod.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGLMethod(String value) {
        this.glMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad taxType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Define el valor de la propiedad taxType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Obtiene el valor de la propiedad maxInventory.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getMaxInventory() {
        return maxInventory;
    }

    /**
     * Define el valor de la propiedad maxInventory.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMaxInventory(Double value) {
        this.maxInventory = value;
    }

    /**
     * Obtiene el valor de la propiedad manageStockByWarehouse.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageStockByWarehouse() {
        return manageStockByWarehouse;
    }

    /**
     * Define el valor de la propiedad manageStockByWarehouse.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageStockByWarehouse(String value) {
        this.manageStockByWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseHeightUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseHeightUnit1() {
        return purchaseHeightUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseHeightUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseHeightUnit1(Long value) {
        this.purchaseHeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitHeight1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitHeight1() {
        return purchaseUnitHeight1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitHeight1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitHeight1(Double value) {
        this.purchaseUnitHeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseLengthUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseLengthUnit1() {
        return purchaseLengthUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseLengthUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseLengthUnit1(Long value) {
        this.purchaseLengthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitLength1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitLength1() {
        return purchaseUnitLength1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitLength1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitLength1(Double value) {
        this.purchaseUnitLength1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWeightUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseWeightUnit1() {
        return purchaseWeightUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseWeightUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseWeightUnit1(Long value) {
        this.purchaseWeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWeight1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitWeight1() {
        return purchaseUnitWeight1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWeight1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitWeight1(Double value) {
        this.purchaseUnitWeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWidthUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPurchaseWidthUnit1() {
        return purchaseWidthUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseWidthUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPurchaseWidthUnit1(Long value) {
        this.purchaseWidthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWidth1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getPurchaseUnitWidth1() {
        return purchaseUnitWidth1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWidth1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setPurchaseUnitWidth1(Double value) {
        this.purchaseUnitWidth1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesHeightUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesHeightUnit1() {
        return salesHeightUnit1;
    }

    /**
     * Define el valor de la propiedad salesHeightUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesHeightUnit1(Long value) {
        this.salesHeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitHeight1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitHeight1() {
        return salesUnitHeight1;
    }

    /**
     * Define el valor de la propiedad salesUnitHeight1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitHeight1(Double value) {
        this.salesUnitHeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesLengthUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesLengthUnit1() {
        return salesLengthUnit1;
    }

    /**
     * Define el valor de la propiedad salesLengthUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesLengthUnit1(Long value) {
        this.salesLengthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitLength1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitLength1() {
        return salesUnitLength1;
    }

    /**
     * Define el valor de la propiedad salesUnitLength1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitLength1(Double value) {
        this.salesUnitLength1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWeightUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesWeightUnit1() {
        return salesWeightUnit1;
    }

    /**
     * Define el valor de la propiedad salesWeightUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesWeightUnit1(Long value) {
        this.salesWeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWeight1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitWeight1() {
        return salesUnitWeight1;
    }

    /**
     * Define el valor de la propiedad salesUnitWeight1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitWeight1(Double value) {
        this.salesUnitWeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWidthUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesWidthUnit1() {
        return salesWidthUnit1;
    }

    /**
     * Define el valor de la propiedad salesWidthUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesWidthUnit1(Long value) {
        this.salesWidthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWidth1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSalesUnitWidth1() {
        return salesUnitWidth1;
    }

    /**
     * Define el valor de la propiedad salesUnitWidth1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSalesUnitWidth1(Double value) {
        this.salesUnitWidth1 = value;
    }

    /**
     * Obtiene el valor de la propiedad forceSelectionOfSerialNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getForceSelectionOfSerialNumber() {
        return forceSelectionOfSerialNumber;
    }

    /**
     * Define el valor de la propiedad forceSelectionOfSerialNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setForceSelectionOfSerialNumber(String value) {
        this.forceSelectionOfSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad manageSerialNumbersOnReleaseOnly.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageSerialNumbersOnReleaseOnly() {
        return manageSerialNumbersOnReleaseOnly;
    }

    /**
     * Define el valor de la propiedad manageSerialNumbersOnReleaseOnly.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageSerialNumbersOnReleaseOnly(String value) {
        this.manageSerialNumbersOnReleaseOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad wtLiable.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWTLiable() {
        return wtLiable;
    }

    /**
     * Define el valor de la propiedad wtLiable.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWTLiable(String value) {
        this.wtLiable = value;
    }

    /**
     * Obtiene el valor de la propiedad costAccountingMethod.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCostAccountingMethod() {
        return costAccountingMethod;
    }

    /**
     * Define el valor de la propiedad costAccountingMethod.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCostAccountingMethod(String value) {
        this.costAccountingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad sww.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSWW() {
        return sww;
    }

    /**
     * Define el valor de la propiedad sww.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSWW(String value) {
        this.sww = value;
    }

    /**
     * Obtiene el valor de la propiedad warrantyTemplate.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWarrantyTemplate() {
        return warrantyTemplate;
    }

    /**
     * Define el valor de la propiedad warrantyTemplate.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWarrantyTemplate(String value) {
        this.warrantyTemplate = value;
    }

    /**
     * Obtiene el valor de la propiedad indirectTax.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndirectTax() {
        return indirectTax;
    }

    /**
     * Define el valor de la propiedad indirectTax.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndirectTax(String value) {
        this.indirectTax = value;
    }

    /**
     * Obtiene el valor de la propiedad arTaxCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArTaxCode() {
        return arTaxCode;
    }

    /**
     * Define el valor de la propiedad arTaxCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArTaxCode(String value) {
        this.arTaxCode = value;
    }

    /**
     * Obtiene el valor de la propiedad apTaxCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApTaxCode() {
        return apTaxCode;
    }

    /**
     * Define el valor de la propiedad apTaxCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApTaxCode(String value) {
        this.apTaxCode = value;
    }

    /**
     * Obtiene el valor de la propiedad baseUnitName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBaseUnitName() {
        return baseUnitName;
    }

    /**
     * Define el valor de la propiedad baseUnitName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBaseUnitName(String value) {
        this.baseUnitName = value;
    }

    /**
     * Obtiene el valor de la propiedad itemCountryOrg.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemCountryOrg() {
        return itemCountryOrg;
    }

    /**
     * Define el valor de la propiedad itemCountryOrg.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemCountryOrg(String value) {
        this.itemCountryOrg = value;
    }

    /**
     * Obtiene el valor de la propiedad issueMethod.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssueMethod() {
        return issueMethod;
    }

    /**
     * Define el valor de la propiedad issueMethod.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssueMethod(String value) {
        this.issueMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad sriAndBatchManageMethod.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRIAndBatchManageMethod() {
        return sriAndBatchManageMethod;
    }

    /**
     * Define el valor de la propiedad sriAndBatchManageMethod.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRIAndBatchManageMethod(String value) {
        this.sriAndBatchManageMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad isPhantom.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsPhantom() {
        return isPhantom;
    }

    /**
     * Define el valor de la propiedad isPhantom.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsPhantom(String value) {
        this.isPhantom = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryUOM.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInventoryUOM() {
        return inventoryUOM;
    }

    /**
     * Define el valor de la propiedad inventoryUOM.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInventoryUOM(String value) {
        this.inventoryUOM = value;
    }

    /**
     * Obtiene el valor de la propiedad planningSystem.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlanningSystem() {
        return planningSystem;
    }

    /**
     * Define el valor de la propiedad planningSystem.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlanningSystem(String value) {
        this.planningSystem = value;
    }

    /**
     * Obtiene el valor de la propiedad procurementMethod.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProcurementMethod() {
        return procurementMethod;
    }

    /**
     * Define el valor de la propiedad procurementMethod.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProcurementMethod(String value) {
        this.procurementMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad componentWarehouse.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComponentWarehouse() {
        return componentWarehouse;
    }

    /**
     * Define el valor de la propiedad componentWarehouse.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComponentWarehouse(String value) {
        this.componentWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad orderIntervals.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOrderIntervals() {
        return orderIntervals;
    }

    /**
     * Define el valor de la propiedad orderIntervals.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOrderIntervals(Long value) {
        this.orderIntervals = value;
    }

    /**
     * Obtiene el valor de la propiedad orderMultiple.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getOrderMultiple() {
        return orderMultiple;
    }

    /**
     * Define el valor de la propiedad orderMultiple.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setOrderMultiple(Double value) {
        this.orderMultiple = value;
    }

    /**
     * Obtiene el valor de la propiedad leadTime.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getLeadTime() {
        return leadTime;
    }

    /**
     * Define el valor de la propiedad leadTime.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setLeadTime(Long value) {
        this.leadTime = value;
    }

    /**
     * Obtiene el valor de la propiedad minOrderQuantity.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * Define el valor de la propiedad minOrderQuantity.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMinOrderQuantity(Double value) {
        this.minOrderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad itemType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Define el valor de la propiedad itemType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Obtiene el valor de la propiedad itemClass.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * Define el valor de la propiedad itemClass.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemClass(String value) {
        this.itemClass = value;
    }

    /**
     * Obtiene el valor de la propiedad outgoingServiceCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOutgoingServiceCode() {
        return outgoingServiceCode;
    }

    /**
     * Define el valor de la propiedad outgoingServiceCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOutgoingServiceCode(Long value) {
        this.outgoingServiceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad incomingServiceCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getIncomingServiceCode() {
        return incomingServiceCode;
    }

    /**
     * Define el valor de la propiedad incomingServiceCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setIncomingServiceCode(Long value) {
        this.incomingServiceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceGroup.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Define el valor de la propiedad serviceGroup.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setServiceGroup(Long value) {
        this.serviceGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad ncmCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getNCMCode() {
        return ncmCode;
    }

    /**
     * Define el valor de la propiedad ncmCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setNCMCode(Long value) {
        this.ncmCode = value;
    }

    /**
     * Obtiene el valor de la propiedad materialType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Define el valor de la propiedad materialType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Obtiene el valor de la propiedad materialGroup.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getMaterialGroup() {
        return materialGroup;
    }

    /**
     * Define el valor de la propiedad materialGroup.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setMaterialGroup(Long value) {
        this.materialGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad productSource.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductSource() {
        return productSource;
    }

    /**
     * Define el valor de la propiedad productSource.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductSource(String value) {
        this.productSource = value;
    }

    /**
     * Obtiene el valor de la propiedad properties1.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties1() {
        return properties1;
    }

    /**
     * Define el valor de la propiedad properties1.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties1(String value) {
        this.properties1 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties2() {
        return properties2;
    }

    /**
     * Define el valor de la propiedad properties2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties2(String value) {
        this.properties2 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties3.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties3() {
        return properties3;
    }

    /**
     * Define el valor de la propiedad properties3.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties3(String value) {
        this.properties3 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties4.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties4() {
        return properties4;
    }

    /**
     * Define el valor de la propiedad properties4.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties4(String value) {
        this.properties4 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties5.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties5() {
        return properties5;
    }

    /**
     * Define el valor de la propiedad properties5.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties5(String value) {
        this.properties5 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties6.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties6() {
        return properties6;
    }

    /**
     * Define el valor de la propiedad properties6.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties6(String value) {
        this.properties6 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties7.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties7() {
        return properties7;
    }

    /**
     * Define el valor de la propiedad properties7.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties7(String value) {
        this.properties7 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties8.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties8() {
        return properties8;
    }

    /**
     * Define el valor de la propiedad properties8.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties8(String value) {
        this.properties8 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties9.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties9() {
        return properties9;
    }

    /**
     * Define el valor de la propiedad properties9.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties9(String value) {
        this.properties9 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties10.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties10() {
        return properties10;
    }

    /**
     * Define el valor de la propiedad properties10.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties10(String value) {
        this.properties10 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties11.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties11() {
        return properties11;
    }

    /**
     * Define el valor de la propiedad properties11.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties11(String value) {
        this.properties11 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties12.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties12() {
        return properties12;
    }

    /**
     * Define el valor de la propiedad properties12.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties12(String value) {
        this.properties12 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties13.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties13() {
        return properties13;
    }

    /**
     * Define el valor de la propiedad properties13.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties13(String value) {
        this.properties13 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties14.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties14() {
        return properties14;
    }

    /**
     * Define el valor de la propiedad properties14.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties14(String value) {
        this.properties14 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties15.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties15() {
        return properties15;
    }

    /**
     * Define el valor de la propiedad properties15.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties15(String value) {
        this.properties15 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties16.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties16() {
        return properties16;
    }

    /**
     * Define el valor de la propiedad properties16.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties16(String value) {
        this.properties16 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties17.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties17() {
        return properties17;
    }

    /**
     * Define el valor de la propiedad properties17.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties17(String value) {
        this.properties17 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties18.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties18() {
        return properties18;
    }

    /**
     * Define el valor de la propiedad properties18.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties18(String value) {
        this.properties18 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties19.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties19() {
        return properties19;
    }

    /**
     * Define el valor de la propiedad properties19.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties19(String value) {
        this.properties19 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties20.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties20() {
        return properties20;
    }

    /**
     * Define el valor de la propiedad properties20.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties20(String value) {
        this.properties20 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties21.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties21() {
        return properties21;
    }

    /**
     * Define el valor de la propiedad properties21.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties21(String value) {
        this.properties21 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties22.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties22() {
        return properties22;
    }

    /**
     * Define el valor de la propiedad properties22.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties22(String value) {
        this.properties22 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties23.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties23() {
        return properties23;
    }

    /**
     * Define el valor de la propiedad properties23.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties23(String value) {
        this.properties23 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties24.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties24() {
        return properties24;
    }

    /**
     * Define el valor de la propiedad properties24.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties24(String value) {
        this.properties24 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties25.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties25() {
        return properties25;
    }

    /**
     * Define el valor de la propiedad properties25.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties25(String value) {
        this.properties25 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties26.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties26() {
        return properties26;
    }

    /**
     * Define el valor de la propiedad properties26.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties26(String value) {
        this.properties26 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties27.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties27() {
        return properties27;
    }

    /**
     * Define el valor de la propiedad properties27.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties27(String value) {
        this.properties27 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties28.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties28() {
        return properties28;
    }

    /**
     * Define el valor de la propiedad properties28.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties28(String value) {
        this.properties28 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties29.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties29() {
        return properties29;
    }

    /**
     * Define el valor de la propiedad properties29.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties29(String value) {
        this.properties29 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties30.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties30() {
        return properties30;
    }

    /**
     * Define el valor de la propiedad properties30.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties30(String value) {
        this.properties30 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties31.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties31() {
        return properties31;
    }

    /**
     * Define el valor de la propiedad properties31.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties31(String value) {
        this.properties31 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties32.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties32() {
        return properties32;
    }

    /**
     * Define el valor de la propiedad properties32.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties32(String value) {
        this.properties32 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties33.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties33() {
        return properties33;
    }

    /**
     * Define el valor de la propiedad properties33.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties33(String value) {
        this.properties33 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties34.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties34() {
        return properties34;
    }

    /**
     * Define el valor de la propiedad properties34.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties34(String value) {
        this.properties34 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties35.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties35() {
        return properties35;
    }

    /**
     * Define el valor de la propiedad properties35.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties35(String value) {
        this.properties35 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties36.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties36() {
        return properties36;
    }

    /**
     * Define el valor de la propiedad properties36.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties36(String value) {
        this.properties36 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties37.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties37() {
        return properties37;
    }

    /**
     * Define el valor de la propiedad properties37.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties37(String value) {
        this.properties37 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties38.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties38() {
        return properties38;
    }

    /**
     * Define el valor de la propiedad properties38.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties38(String value) {
        this.properties38 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties39.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties39() {
        return properties39;
    }

    /**
     * Define el valor de la propiedad properties39.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties39(String value) {
        this.properties39 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties40.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties40() {
        return properties40;
    }

    /**
     * Define el valor de la propiedad properties40.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties40(String value) {
        this.properties40 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties41.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties41() {
        return properties41;
    }

    /**
     * Define el valor de la propiedad properties41.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties41(String value) {
        this.properties41 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties42.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties42() {
        return properties42;
    }

    /**
     * Define el valor de la propiedad properties42.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties42(String value) {
        this.properties42 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties43.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties43() {
        return properties43;
    }

    /**
     * Define el valor de la propiedad properties43.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties43(String value) {
        this.properties43 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties44.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties44() {
        return properties44;
    }

    /**
     * Define el valor de la propiedad properties44.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties44(String value) {
        this.properties44 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties45.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties45() {
        return properties45;
    }

    /**
     * Define el valor de la propiedad properties45.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties45(String value) {
        this.properties45 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties46.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties46() {
        return properties46;
    }

    /**
     * Define el valor de la propiedad properties46.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties46(String value) {
        this.properties46 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties47.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties47() {
        return properties47;
    }

    /**
     * Define el valor de la propiedad properties47.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties47(String value) {
        this.properties47 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties48.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties48() {
        return properties48;
    }

    /**
     * Define el valor de la propiedad properties48.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties48(String value) {
        this.properties48 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties49.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties49() {
        return properties49;
    }

    /**
     * Define el valor de la propiedad properties49.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties49(String value) {
        this.properties49 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties50.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties50() {
        return properties50;
    }

    /**
     * Define el valor de la propiedad properties50.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties50(String value) {
        this.properties50 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties51.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties51() {
        return properties51;
    }

    /**
     * Define el valor de la propiedad properties51.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties51(String value) {
        this.properties51 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties52.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties52() {
        return properties52;
    }

    /**
     * Define el valor de la propiedad properties52.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties52(String value) {
        this.properties52 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties53.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties53() {
        return properties53;
    }

    /**
     * Define el valor de la propiedad properties53.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties53(String value) {
        this.properties53 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties54.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties54() {
        return properties54;
    }

    /**
     * Define el valor de la propiedad properties54.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties54(String value) {
        this.properties54 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties55.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties55() {
        return properties55;
    }

    /**
     * Define el valor de la propiedad properties55.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties55(String value) {
        this.properties55 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties56.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties56() {
        return properties56;
    }

    /**
     * Define el valor de la propiedad properties56.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties56(String value) {
        this.properties56 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties57.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties57() {
        return properties57;
    }

    /**
     * Define el valor de la propiedad properties57.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties57(String value) {
        this.properties57 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties58.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties58() {
        return properties58;
    }

    /**
     * Define el valor de la propiedad properties58.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties58(String value) {
        this.properties58 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties59.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties59() {
        return properties59;
    }

    /**
     * Define el valor de la propiedad properties59.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties59(String value) {
        this.properties59 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties60.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties60() {
        return properties60;
    }

    /**
     * Define el valor de la propiedad properties60.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties60(String value) {
        this.properties60 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties61.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties61() {
        return properties61;
    }

    /**
     * Define el valor de la propiedad properties61.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties61(String value) {
        this.properties61 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties62.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties62() {
        return properties62;
    }

    /**
     * Define el valor de la propiedad properties62.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties62(String value) {
        this.properties62 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties63.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties63() {
        return properties63;
    }

    /**
     * Define el valor de la propiedad properties63.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties63(String value) {
        this.properties63 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties64.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperties64() {
        return properties64;
    }

    /**
     * Define el valor de la propiedad properties64.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperties64(String value) {
        this.properties64 = value;
    }

    /**
     * Obtiene el valor de la propiedad autoCreateSerialNumbersOnRelease.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAutoCreateSerialNumbersOnRelease() {
        return autoCreateSerialNumbersOnRelease;
    }

    /**
     * Define el valor de la propiedad autoCreateSerialNumbersOnRelease.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAutoCreateSerialNumbersOnRelease(String value) {
        this.autoCreateSerialNumbersOnRelease = value;
    }

    /**
     * Obtiene el valor de la propiedad dnfEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDNFEntry() {
        return dnfEntry;
    }

    /**
     * Define el valor de la propiedad dnfEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDNFEntry(Long value) {
        this.dnfEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsItemSpec.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGTSItemSpec() {
        return gtsItemSpec;
    }

    /**
     * Define el valor de la propiedad gtsItemSpec.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGTSItemSpec(String value) {
        this.gtsItemSpec = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsItemTaxCategory.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGTSItemTaxCategory() {
        return gtsItemTaxCategory;
    }

    /**
     * Define el valor de la propiedad gtsItemTaxCategory.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGTSItemTaxCategory(String value) {
        this.gtsItemTaxCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad fuelID.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFuelID() {
        return fuelID;
    }

    /**
     * Define el valor de la propiedad fuelID.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFuelID(Long value) {
        this.fuelID = value;
    }

    /**
     * Obtiene el valor de la propiedad beverageTableCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeverageTableCode() {
        return beverageTableCode;
    }

    /**
     * Define el valor de la propiedad beverageTableCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeverageTableCode(String value) {
        this.beverageTableCode = value;
    }

    /**
     * Obtiene el valor de la propiedad beverageGroupCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeverageGroupCode() {
        return beverageGroupCode;
    }

    /**
     * Define el valor de la propiedad beverageGroupCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeverageGroupCode(String value) {
        this.beverageGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad beverageCommercialBrandCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBeverageCommercialBrandCode() {
        return beverageCommercialBrandCode;
    }

    /**
     * Define el valor de la propiedad beverageCommercialBrandCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBeverageCommercialBrandCode(Long value) {
        this.beverageCommercialBrandCode = value;
    }

    /**
     * Obtiene el valor de la propiedad series.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSeries() {
        return series;
    }

    /**
     * Define el valor de la propiedad series.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSeries(Long value) {
        this.series = value;
    }

    /**
     * Obtiene el valor de la propiedad toleranceDays.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getToleranceDays() {
        return toleranceDays;
    }

    /**
     * Define el valor de la propiedad toleranceDays.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setToleranceDays(Long value) {
        this.toleranceDays = value;
    }

    /**
     * Obtiene el valor de la propiedad typeOfAdvancedRules.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeOfAdvancedRules() {
        return typeOfAdvancedRules;
    }

    /**
     * Define el valor de la propiedad typeOfAdvancedRules.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeOfAdvancedRules(String value) {
        this.typeOfAdvancedRules = value;
    }

    /**
     * Obtiene el valor de la propiedad issuePrimarilyBy.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssuePrimarilyBy() {
        return issuePrimarilyBy;
    }

    /**
     * Define el valor de la propiedad issuePrimarilyBy.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssuePrimarilyBy(String value) {
        this.issuePrimarilyBy = value;
    }

    /**
     * Obtiene el valor de la propiedad noDiscounts.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoDiscounts() {
        return noDiscounts;
    }

    /**
     * Define el valor de la propiedad noDiscounts.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoDiscounts(String value) {
        this.noDiscounts = value;
    }

    /**
     * Obtiene el valor de la propiedad assetClass.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetClass() {
        return assetClass;
    }

    /**
     * Define el valor de la propiedad assetClass.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetClass(String value) {
        this.assetClass = value;
    }

    /**
     * Obtiene el valor de la propiedad assetGroup.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetGroup() {
        return assetGroup;
    }

    /**
     * Define el valor de la propiedad assetGroup.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetGroup(String value) {
        this.assetGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    /**
     * Define el valor de la propiedad inventoryNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInventoryNumber(String value) {
        this.inventoryNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad technician.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTechnician() {
        return technician;
    }

    /**
     * Define el valor de la propiedad technician.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTechnician(Long value) {
        this.technician = value;
    }

    /**
     * Obtiene el valor de la propiedad employee.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getEmployee() {
        return employee;
    }

    /**
     * Define el valor de la propiedad employee.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setEmployee(Long value) {
        this.employee = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setLocation(Long value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad assetStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * Define el valor de la propiedad assetStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetStatus(String value) {
        this.assetStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalizationDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCapitalizationDate() {
        return capitalizationDate;
    }

    /**
     * Define el valor de la propiedad capitalizationDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCapitalizationDate(XMLGregorianCalendar value) {
        this.capitalizationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad statisticalAsset.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatisticalAsset() {
        return statisticalAsset;
    }

    /**
     * Define el valor de la propiedad statisticalAsset.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatisticalAsset(String value) {
        this.statisticalAsset = value;
    }

    /**
     * Obtiene el valor de la propiedad cession.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCession() {
        return cession;
    }

    /**
     * Define el valor de la propiedad cession.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCession(String value) {
        this.cession = value;
    }

    /**
     * Obtiene el valor de la propiedad deactivateAfterUsefulLife.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeactivateAfterUsefulLife() {
        return deactivateAfterUsefulLife;
    }

    /**
     * Define el valor de la propiedad deactivateAfterUsefulLife.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeactivateAfterUsefulLife(String value) {
        this.deactivateAfterUsefulLife = value;
    }

    /**
     * Obtiene el valor de la propiedad manageByQuantity.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManageByQuantity() {
        return manageByQuantity;
    }

    /**
     * Define el valor de la propiedad manageByQuantity.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManageByQuantity(String value) {
        this.manageByQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad uoMGroupEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUoMGroupEntry() {
        return uoMGroupEntry;
    }

    /**
     * Define el valor de la propiedad uoMGroupEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUoMGroupEntry(Long value) {
        this.uoMGroupEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryUoMEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getInventoryUoMEntry() {
        return inventoryUoMEntry;
    }

    /**
     * Define el valor de la propiedad inventoryUoMEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setInventoryUoMEntry(Long value) {
        this.inventoryUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultSalesUoMEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDefaultSalesUoMEntry() {
        return defaultSalesUoMEntry;
    }

    /**
     * Define el valor de la propiedad defaultSalesUoMEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDefaultSalesUoMEntry(Long value) {
        this.defaultSalesUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultPurchasingUoMEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDefaultPurchasingUoMEntry() {
        return defaultPurchasingUoMEntry;
    }

    /**
     * Define el valor de la propiedad defaultPurchasingUoMEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDefaultPurchasingUoMEntry(Long value) {
        this.defaultPurchasingUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad depreciationGroup.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDepreciationGroup() {
        return depreciationGroup;
    }

    /**
     * Define el valor de la propiedad depreciationGroup.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDepreciationGroup(String value) {
        this.depreciationGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad assetSerialNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetSerialNumber() {
        return assetSerialNumber;
    }

    /**
     * Define el valor de la propiedad assetSerialNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetSerialNumber(String value) {
        this.assetSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryWeight.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getInventoryWeight() {
        return inventoryWeight;
    }

    /**
     * Define el valor de la propiedad inventoryWeight.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setInventoryWeight(Double value) {
        this.inventoryWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryWeightUnit.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getInventoryWeightUnit() {
        return inventoryWeightUnit;
    }

    /**
     * Define el valor de la propiedad inventoryWeightUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setInventoryWeightUnit(Long value) {
        this.inventoryWeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryWeight1.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getInventoryWeight1() {
        return inventoryWeight1;
    }

    /**
     * Define el valor de la propiedad inventoryWeight1.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setInventoryWeight1(Double value) {
        this.inventoryWeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryWeightUnit1.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getInventoryWeightUnit1() {
        return inventoryWeightUnit1;
    }

    /**
     * Define el valor de la propiedad inventoryWeightUnit1.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setInventoryWeightUnit1(Long value) {
        this.inventoryWeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultCountingUnit.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultCountingUnit() {
        return defaultCountingUnit;
    }

    /**
     * Define el valor de la propiedad defaultCountingUnit.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultCountingUnit(String value) {
        this.defaultCountingUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad countingItemsPerUnit.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getCountingItemsPerUnit() {
        return countingItemsPerUnit;
    }

    /**
     * Define el valor de la propiedad countingItemsPerUnit.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setCountingItemsPerUnit(Double value) {
        this.countingItemsPerUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultCountingUoMEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDefaultCountingUoMEntry() {
        return defaultCountingUoMEntry;
    }

    /**
     * Define el valor de la propiedad defaultCountingUoMEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDefaultCountingUoMEntry(Long value) {
        this.defaultCountingUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad excisable.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExcisable() {
        return excisable;
    }

    /**
     * Define el valor de la propiedad excisable.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExcisable(String value) {
        this.excisable = value;
    }

    /**
     * Obtiene el valor de la propiedad chapterID.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getChapterID() {
        return chapterID;
    }

    /**
     * Define el valor de la propiedad chapterID.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setChapterID(Long value) {
        this.chapterID = value;
    }

    /**
     * Obtiene el valor de la propiedad scsCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScsCode() {
        return scsCode;
    }

    /**
     * Define el valor de la propiedad scsCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScsCode(String value) {
        this.scsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad spProdType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpProdType() {
        return spProdType;
    }

    /**
     * Define el valor de la propiedad spProdType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpProdType(String value) {
        this.spProdType = value;
    }

    public String getInCostRoll() {
        return inCostRoll;
    }

    public void setInCostRoll(String inCostRoll) {
        this.inCostRoll = inCostRoll;
    }

    public String getVirtAstItm() {
        return virtAstItm;
    }

    public void setVirtAstItm(String virtAstItm) {
        this.virtAstItm = virtAstItm;
    }

    public String getEnAstSeri() {
        return enAstSeri;
    }

    public void setEnAstSeri(String enAstSeri) {
        this.enAstSeri = enAstSeri;
    }

    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(XMLGregorianCalendar updateDate) {
        this.updateDate = updateDate;
    }

    public void setCreateDate(XMLGregorianCalendar createDate) {
        this.createDate = createDate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getgSTRelevnt() {
        return gstRelevnt;
    }

    public void setgSTRelevnt(String gSTRelevnt) {
        this.gstRelevnt = gSTRelevnt;
    }

    public Long getsACEntry() {
        return sacEntry;
    }

    public void setsACEntry(Long sACEntry) {
        this.sacEntry = sACEntry;
    }

    public String getGstTaxCtg() {
        return gstTaxCtg;
    }

    public void setGstTaxCtg(String gstTaxCtg) {
        this.gstTaxCtg = gstTaxCtg;
    }

    public Long getServiceCtg() {
        return serviceCtg;
    }

    public void setServiceCtg(Long serviceCtg) {
        this.serviceCtg = serviceCtg;
    }

    public Double getAssblValue() {
        return assblValue;
    }

    public void setAssblValue(Double assblValue) {
        this.assblValue = assblValue;
    }

    public Double getAssVal4WTR() {
        return assVal4WTR;
    }

    public void setAssVal4WTR(Double assVal4WTR) {
        this.assVal4WTR = assVal4WTR;
    }

    public String getSoiExc() {
        return soiExc;
    }

    public void setSoiExc(String soiExc) {
        this.soiExc = soiExc;
    }

    public String getImported() {
        return imported;
    }

    public void setImported(String imported) {
        this.imported = imported;
    }

    public Double getPricingPrc() {
        return pricingPrc;
    }

    public void setPricingPrc(Double pricingPrc) {
        this.pricingPrc = pricingPrc;
    }

    public Long getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Long priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getuMarcasInfo() {
        return uMarcasInfo;
    }

    public void setuMarcasInfo(String uMarcasInfo) {
        this.uMarcasInfo = uMarcasInfo;
    }

    public String getuGrupo() {
        return uGrupo;
    }

    public void setuGrupo(String uGrupo) {
        this.uGrupo = uGrupo;
    }

    public String getuCategoria() {
        return uCategoria;
    }

    public void setuCategoria(String uCategoria) {
        this.uCategoria = uCategoria;
    }

    public String getuCatalogo() {
        return uCatalogo;
    }

    public void setuCatalogo(String uCatalogo) {
        this.uCatalogo = uCatalogo;
    }

    public String getuTipo() {
        return uTipo;
    }

    public void setuTipo(String uTipo) {
        this.uTipo = uTipo;
    }

    public ItemPrices getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(ItemPrices itemPrices) {
        this.itemPrices = itemPrices;
    }

    public ItemWarehouseInfoCollection getItemWarehouseInfoCollection() {
        return itemWarehouseInfoCollection;
    }

    public void setItemWarehouseInfoCollection(ItemWarehouseInfoCollection itemWarehouseInfoCollection) {
        this.itemWarehouseInfoCollection = itemWarehouseInfoCollection;
    }

    public ItemPreferredVendors getItemPreferredVendors() {
        return itemPreferredVendors;
    }

    public void setItemPreferredVendors(ItemPreferredVendors itemPreferredVendors) {
        this.itemPreferredVendors = itemPreferredVendors;
    }

    public ItemLocalizationInfos getItemLocalizationInfos() {
        return itemLocalizationInfos;
    }

    public void setItemLocalizationInfos(ItemLocalizationInfos itemLocalizationInfos) {
        this.itemLocalizationInfos = itemLocalizationInfos;
    }

    public ItemProjects getItemProjects() {
        return itemProjects;
    }

    public void setItemProjects(ItemProjects itemProjects) {
        this.itemProjects = itemProjects;
    }

    public ItemDistributionRules getItemDistributionRules() {
        return itemDistributionRules;
    }

    public void setItemDistributionRules(ItemDistributionRules itemDistributionRules) {
        this.itemDistributionRules = itemDistributionRules;
    }

    public ItemBarCodeCollection getItemBarCodeCollection() {
        return itemBarCodeCollection;
    }

    public void setItemBarCodeCollection(ItemBarCodeCollection itemBarCodeCollection) {
        this.itemBarCodeCollection = itemBarCodeCollection;
    }

    public ItemDepreciationParameters getItemDepreciationParameters() {
        return itemDepreciationParameters;
    }

    public void setItemDepreciationParameters(ItemDepreciationParameters itemDepreciationParameters) {
        this.itemDepreciationParameters = itemDepreciationParameters;
    }

    public ItemIntrastatExtension getItemIntrastatExtension() {
        return itemIntrastatExtension;
    }

    public void setItemIntrastatExtension(ItemIntrastatExtension itemIntrastatExtension) {
        this.itemIntrastatExtension = itemIntrastatExtension;
    }

    public ItemPeriodControls getItemPeriodControls() {
        return itemPeriodControls;
    }

    public void setItemPeriodControls(ItemPeriodControls itemPeriodControls) {
        this.itemPeriodControls = itemPeriodControls;
    }

    public ItemUnitOfMeasurementCollection getItemUnitOfMeasurementCollection() {
        return itemUnitOfMeasurementCollection;
    }

    public void setItemUnitOfMeasurementCollection(ItemUnitOfMeasurementCollection itemUnitOfMeasurementCollection) {
        this.itemUnitOfMeasurementCollection = itemUnitOfMeasurementCollection;
    }

    public String getItmsGrpCod() {
        return itmsGrpCod;
    }

    public void setItmsGrpCod(String itmsGrpCod) {
        this.itmsGrpCod = itmsGrpCod;
    }

    /**
     * Obtiene el valor de la propiedad uSubgrupo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSubgrupo() {
        return uSubgrupo;
    }

    /**
     * Define el valor de la propiedad uSubgrupo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSubgrupo(String value) {
        this.uSubgrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad uMarca.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUMarca() {
        return uMarca;
    }

    /**
     * Define el valor de la propiedad uMarca.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUMarca(String value) {
        this.uMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad uProcedencia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUProcedencia() {
        return uProcedencia;
    }

    /**
     * Define el valor de la propiedad uProcedencia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUProcedencia(String value) {
        this.uProcedencia = value;
    }

    /**
     * Obtiene el valor de la propiedad uModelo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUModelo() {
        return uModelo;
    }

    /**
     * Define el valor de la propiedad uModelo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUModelo(String value) {
        this.uModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad uCodAnterior.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCodAnterior() {
        return uCodAnterior;
    }

    /**
     * Define el valor de la propiedad uCodAnterior.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCodAnterior(String value) {
        this.uCodAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad ucostoimp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCOSTOIMP() {
        return ucostoimp;
    }

    /**
     * Define el valor de la propiedad ucostoimp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCOSTOIMP(String value) {
        this.ucostoimp = value;
    }

    /**
     * Obtiene el valor de la propiedad ufeccrea.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECCREA() {
        return ufeccrea;
    }

    /**
     * Define el valor de la propiedad ufeccrea.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECCREA(XMLGregorianCalendar value) {
        this.ufeccrea = value;
    }

    /**
     * Obtiene el valor de la propiedad uuniprovtas.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getUUNIPROVTAS() {
        return uuniprovtas;
    }

    /**
     * Define el valor de la propiedad uuniprovtas.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setUUNIPROVTAS(Double value) {
        this.uuniprovtas = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlgxviv.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVLGXVIV() {
        return uvlgxviv;
    }

    /**
     * Define el valor de la propiedad uvlgxviv.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVLGXVIV(String value) {
        this.uvlgxviv = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlgxord.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUVLGXORD() {
        return uvlgxord;
    }

    /**
     * Define el valor de la propiedad uvlgxord.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUVLGXORD(XMLGregorianCalendar value) {
        this.uvlgxord = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlgxbom.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVLGXBOM() {
        return uvlgxbom;
    }

    /**
     * Define el valor de la propiedad uvlgxbom.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVLGXBOM(String value) {
        this.uvlgxbom = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlgxpln.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVLGXPLN() {
        return uvlgxpln;
    }

    /**
     * Define el valor de la propiedad uvlgxpln.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVLGXPLN(String value) {
        this.uvlgxpln = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlgxsup.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVLGXSUP() {
        return uvlgxsup;
    }

    /**
     * Define el valor de la propiedad uvlgxsup.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVLGXSUP(String value) {
        this.uvlgxsup = value;
    }

    /**
     * Obtiene el valor de la propiedad uVarrocItemCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVarrocItemCode() {
        return uVarrocItemCode;
    }

    /**
     * Define el valor de la propiedad uVarrocItemCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVarrocItemCode(String value) {
        this.uVarrocItemCode = value;
    }

    /**
     * Obtiene el valor de la propiedad uwmsVelocity.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUWMSVelocity() {
        return uwmsVelocity;
    }

    /**
     * Define el valor de la propiedad uwmsVelocity.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUWMSVelocity(String value) {
        this.uwmsVelocity = value;
    }

    /**
     * Obtiene el valor de la propiedad uAplicacion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUAplicacion() {
        return uAplicacion;
    }

    /**
     * Define el valor de la propiedad uAplicacion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUAplicacion(String value) {
        this.uAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad uType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUType() {
        return uType;
    }

    /**
     * Define el valor de la propiedad uType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUType(String value) {
        this.uType = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrscrp.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getUNWRSCRP() {
        return unwrscrp;
    }

    /**
     * Define el valor de la propiedad unwrscrp.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setUNWRSCRP(Double value) {
        this.unwrscrp = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrwopo.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUNWRWOPO() {
        return unwrwopo;
    }

    /**
     * Define el valor de la propiedad unwrwopo.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUNWRWOPO(Long value) {
        this.unwrwopo = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrmatrix.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUNWRMATRIX() {
        return unwrmatrix;
    }

    /**
     * Define el valor de la propiedad unwrmatrix.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUNWRMATRIX(Long value) {
        this.unwrmatrix = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrAutoShipment.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNWRAutoShipment() {
        return unwrAutoShipment;
    }

    /**
     * Define el valor de la propiedad unwrAutoShipment.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNWRAutoShipment(String value) {
        this.unwrAutoShipment = value;
    }

    /**
     * Obtiene el valor de la propiedad uTipoInventario.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTipoInventario() {
        return uTipoInventario;
    }

    /**
     * Define el valor de la propiedad uTipoInventario.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTipoInventario(String value) {
        this.uTipoInventario = value;
    }

    /**
     * Obtiene el valor de la propiedad uResponsable.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUResponsable() {
        return uResponsable;
    }

    /**
     * Define el valor de la propiedad uResponsable.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUResponsable(String value) {
        this.uResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlgxca.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVLGXCA() {
        return uvlgxca;
    }

    /**
     * Define el valor de la propiedad uvlgxca.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVLGXCA(String value) {
        this.uvlgxca = value;
    }

    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemAttributeGroups" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute33" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute34" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute35" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute37" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute38" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute39" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute40" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute41" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute42" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute43" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute44" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute45" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute46" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute47" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute48" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute49" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute50" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute51" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute52" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute53" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute54" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute55" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute57" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute58" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute59" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute60" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute61" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute62" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute63" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Attribute64" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */

    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemBarCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="AbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemBarCode"
    })
    public static class ItemBarCodeCollection {

        @XmlElement(name = "ItemBarCode")
        protected List<ItemBarCode> itemBarCode;

        /**
         * Gets the value of the itemBarCode property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemBarCode property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemBarCode().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemBarCodeCollection.ItemBarCode }
         *
         *
         */
        public List<ItemBarCode> getItemBarCode() {
            if (itemBarCode == null) {
                itemBarCode = new ArrayList<ItemBarCode>();
            }
            return this.itemBarCode;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="AbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemBarCode {

            @XmlElement(name = "AbsEntry")
            protected Long absEntry;
            @XmlElement(name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(name = "Barcode")
            protected String barcode;
            @XmlElement(name = "FreeText")
            protected String freeText;

            /**
             * Obtiene el valor de la propiedad absEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getAbsEntry() {
                return absEntry;
            }

            /**
             * Define el valor de la propiedad absEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setAbsEntry(Long value) {
                this.absEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUoMEntry() {
                return uoMEntry;
            }

            /**
             * Define el valor de la propiedad uoMEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUoMEntry(Long value) {
                this.uoMEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad barcode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBarcode() {
                return barcode;
            }

            /**
             * Define el valor de la propiedad barcode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBarcode(String value) {
                this.barcode = value;
            }

            /**
             * Obtiene el valor de la propiedad freeText.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFreeText() {
                return freeText;
            }

            /**
             * Define el valor de la propiedad freeText.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFreeText(String value) {
                this.freeText = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemDepreciationParameter" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="DepreciationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="UsefulLife" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="RemainingLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="DepreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemDepreciationParameter"
    })
    public static class ItemDepreciationParameters {

        @XmlElement(name = "ItemDepreciationParameter")
        protected List<ItemDepreciationParameter> itemDepreciationParameter;

        /**
         * Gets the value of the itemDepreciationParameter property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemDepreciationParameter property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemDepreciationParameter().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemDepreciationParameters.ItemDepreciationParameter }
         *
         *
         */
        public List<ItemDepreciationParameter> getItemDepreciationParameter() {
            if (itemDepreciationParameter == null) {
                itemDepreciationParameter = new ArrayList<ItemDepreciationParameter>();
            }
            return this.itemDepreciationParameter;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="DepreciationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="UsefulLife" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="RemainingLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="DepreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemDepreciationParameter {

            @XmlElement(name = "FiscalYear")
            protected String fiscalYear;
            @XmlElement(name = "DepreciationArea")
            protected String depreciationArea;
            @XmlElement(name = "DepreciationStartDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar depreciationStartDate;
            @XmlElement(name = "DepreciationEndDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar depreciationEndDate;
            @XmlElement(name = "UsefulLife")
            protected Long usefulLife;
            @XmlElement(name = "RemainingLife")
            protected Double remainingLife;
            @XmlElement(name = "DepreciationType")
            protected String depreciationType;

            /**
             * Obtiene el valor de la propiedad fiscalYear.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFiscalYear() {
                return fiscalYear;
            }

            /**
             * Define el valor de la propiedad fiscalYear.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFiscalYear(String value) {
                this.fiscalYear = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationArea.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDepreciationArea() {
                return depreciationArea;
            }

            /**
             * Define el valor de la propiedad depreciationArea.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDepreciationArea(String value) {
                this.depreciationArea = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationStartDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDepreciationStartDate() {
                return depreciationStartDate;
            }

            /**
             * Define el valor de la propiedad depreciationStartDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDepreciationStartDate(XMLGregorianCalendar value) {
                this.depreciationStartDate = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationEndDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDepreciationEndDate() {
                return depreciationEndDate;
            }

            /**
             * Define el valor de la propiedad depreciationEndDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDepreciationEndDate(XMLGregorianCalendar value) {
                this.depreciationEndDate = value;
            }

            /**
             * Obtiene el valor de la propiedad usefulLife.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUsefulLife() {
                return usefulLife;
            }

            /**
             * Define el valor de la propiedad usefulLife.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUsefulLife(Long value) {
                this.usefulLife = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingLife.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getRemainingLife() {
                return remainingLife;
            }

            /**
             * Define el valor de la propiedad remainingLife.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setRemainingLife(Double value) {
                this.remainingLife = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDepreciationType() {
                return depreciationType;
            }

            /**
             * Define el valor de la propiedad depreciationType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDepreciationType(String value) {
                this.depreciationType = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemDistributionRule" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemDistributionRule"
    })
    public static class ItemDistributionRules {

        @XmlElement(name = "ItemDistributionRule")
        protected List<ItemDistributionRule> itemDistributionRule;

        /**
         * Gets the value of the itemDistributionRule property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemDistributionRule property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemDistributionRule().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemDistributionRules.ItemDistributionRule }
         *
         *
         */
        public List<ItemDistributionRule> getItemDistributionRule() {
            if (itemDistributionRule == null) {
                itemDistributionRule = new ArrayList<ItemDistributionRule>();
            }
            return this.itemDistributionRule;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemDistributionRule {

            @XmlElement(name = "LineNumber")
            protected String lineNumber;
            @XmlElement(name = "ValidFrom")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validFrom;
            @XmlElement(name = "ValidTo")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validTo;
            @XmlElement(name = "DistributionRule")
            protected String distributionRule;
            @XmlElement(name = "DistributionRule2")
            protected String distributionRule2;
            @XmlElement(name = "DistributionRule3")
            protected String distributionRule3;
            @XmlElement(name = "DistributionRule4")
            protected String distributionRule4;
            @XmlElement(name = "DistributionRule5")
            protected String distributionRule5;

            /**
             * Obtiene el valor de la propiedad lineNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLineNumber() {
                return lineNumber;
            }

            /**
             * Define el valor de la propiedad lineNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLineNumber(String value) {
                this.lineNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad validFrom.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getValidFrom() {
                return validFrom;
            }

            /**
             * Define el valor de la propiedad validFrom.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setValidFrom(XMLGregorianCalendar value) {
                this.validFrom = value;
            }

            /**
             * Obtiene el valor de la propiedad validTo.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getValidTo() {
                return validTo;
            }

            /**
             * Define el valor de la propiedad validTo.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setValidTo(XMLGregorianCalendar value) {
                this.validTo = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule() {
                return distributionRule;
            }

            /**
             * Define el valor de la propiedad distributionRule.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule(String value) {
                this.distributionRule = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule2() {
                return distributionRule2;
            }

            /**
             * Define el valor de la propiedad distributionRule2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule2(String value) {
                this.distributionRule2 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule3.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule3() {
                return distributionRule3;
            }

            /**
             * Define el valor de la propiedad distributionRule3.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule3(String value) {
                this.distributionRule3 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule4() {
                return distributionRule4;
            }

            /**
             * Define el valor de la propiedad distributionRule4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule4(String value) {
                this.distributionRule4 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule5() {
                return distributionRule5;
            }

            /**
             * Define el valor de la propiedad distributionRule5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule5(String value) {
                this.distributionRule5 = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="SupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="FactorOfSupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="ImportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ExportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ImportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ExportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ImportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ExportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="Type" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="dDocument_Items"/&gt;
     *               &lt;enumeration value="dDocument_Service"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ServiceSupplyMethod" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="ssmImmediate"/&gt;
     *               &lt;enumeration value="ssmToMoreResumptions"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ServicePaymentMethod" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="spmAccreditedToBankAccount"/&gt;
     *               &lt;enumeration value="spmBankTransfer"/&gt;
     *               &lt;enumeration value="spmOther"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ImportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UseWeightInCalculation" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="tNO"/&gt;
     *               &lt;enumeration value="tYES"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IntrastatRelevant" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="tNO"/&gt;
     *               &lt;enumeration value="tYES"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="StatisticalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ItemIntrastatExtension {

        @XmlElement(name = "ItemCode")
        protected String itemCode;
        @XmlElement(name = "CommodityCode")
        protected Long commodityCode;
        @XmlElement(name = "SupplementaryUnit")
        protected Long supplementaryUnit;
        @XmlElement(name = "FactorOfSupplementaryUnit")
        protected Double factorOfSupplementaryUnit;
        @XmlElement(name = "ImportRegionState")
        protected Long importRegionState;
        @XmlElement(name = "ExportRegionState")
        protected Long exportRegionState;
        @XmlElement(name = "ImportNatureOfTransaction")
        protected Long importNatureOfTransaction;
        @XmlElement(name = "ExportNatureOfTransaction")
        protected Long exportNatureOfTransaction;
        @XmlElement(name = "ImportStatisticalProcedure")
        protected Long importStatisticalProcedure;
        @XmlElement(name = "ExportStatisticalProcedure")
        protected Long exportStatisticalProcedure;
        @XmlElement(name = "CountryOfOrigin")
        protected String countryOfOrigin;
        @XmlElement(name = "ServiceCode")
        protected Long serviceCode;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "ServiceSupplyMethod")
        protected String serviceSupplyMethod;
        @XmlElement(name = "ServicePaymentMethod")
        protected String servicePaymentMethod;
        @XmlElement(name = "ImportRegionCountry")
        protected String importRegionCountry;
        @XmlElement(name = "ExportRegionCountry")
        protected String exportRegionCountry;
        @XmlElement(name = "UseWeightInCalculation")
        protected String useWeightInCalculation;
        @XmlElement(name = "IntrastatRelevant")
        protected String intrastatRelevant;
        @XmlElement(name = "StatisticalCode")
        protected String statisticalCode;

        /**
         * Obtiene el valor de la propiedad itemCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getItemCode() {
            return itemCode;
        }

        /**
         * Define el valor de la propiedad itemCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setItemCode(String value) {
            this.itemCode = value;
        }

        /**
         * Obtiene el valor de la propiedad commodityCode.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getCommodityCode() {
            return commodityCode;
        }

        /**
         * Define el valor de la propiedad commodityCode.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setCommodityCode(Long value) {
            this.commodityCode = value;
        }

        /**
         * Obtiene el valor de la propiedad supplementaryUnit.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getSupplementaryUnit() {
            return supplementaryUnit;
        }

        /**
         * Define el valor de la propiedad supplementaryUnit.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setSupplementaryUnit(Long value) {
            this.supplementaryUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad factorOfSupplementaryUnit.
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        public Double getFactorOfSupplementaryUnit() {
            return factorOfSupplementaryUnit;
        }

        /**
         * Define el valor de la propiedad factorOfSupplementaryUnit.
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setFactorOfSupplementaryUnit(Double value) {
            this.factorOfSupplementaryUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad importRegionState.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getImportRegionState() {
            return importRegionState;
        }

        /**
         * Define el valor de la propiedad importRegionState.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setImportRegionState(Long value) {
            this.importRegionState = value;
        }

        /**
         * Obtiene el valor de la propiedad exportRegionState.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getExportRegionState() {
            return exportRegionState;
        }

        /**
         * Define el valor de la propiedad exportRegionState.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setExportRegionState(Long value) {
            this.exportRegionState = value;
        }

        /**
         * Obtiene el valor de la propiedad importNatureOfTransaction.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getImportNatureOfTransaction() {
            return importNatureOfTransaction;
        }

        /**
         * Define el valor de la propiedad importNatureOfTransaction.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setImportNatureOfTransaction(Long value) {
            this.importNatureOfTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad exportNatureOfTransaction.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getExportNatureOfTransaction() {
            return exportNatureOfTransaction;
        }

        /**
         * Define el valor de la propiedad exportNatureOfTransaction.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setExportNatureOfTransaction(Long value) {
            this.exportNatureOfTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad importStatisticalProcedure.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getImportStatisticalProcedure() {
            return importStatisticalProcedure;
        }

        /**
         * Define el valor de la propiedad importStatisticalProcedure.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setImportStatisticalProcedure(Long value) {
            this.importStatisticalProcedure = value;
        }

        /**
         * Obtiene el valor de la propiedad exportStatisticalProcedure.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getExportStatisticalProcedure() {
            return exportStatisticalProcedure;
        }

        /**
         * Define el valor de la propiedad exportStatisticalProcedure.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setExportStatisticalProcedure(Long value) {
            this.exportStatisticalProcedure = value;
        }

        /**
         * Obtiene el valor de la propiedad countryOfOrigin.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountryOfOrigin() {
            return countryOfOrigin;
        }

        /**
         * Define el valor de la propiedad countryOfOrigin.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountryOfOrigin(String value) {
            this.countryOfOrigin = value;
        }

        /**
         * Obtiene el valor de la propiedad serviceCode.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getServiceCode() {
            return serviceCode;
        }

        /**
         * Define el valor de la propiedad serviceCode.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setServiceCode(Long value) {
            this.serviceCode = value;
        }

        /**
         * Obtiene el valor de la propiedad type.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getType() {
            return type;
        }

        /**
         * Define el valor de la propiedad type.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtiene el valor de la propiedad serviceSupplyMethod.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServiceSupplyMethod() {
            return serviceSupplyMethod;
        }

        /**
         * Define el valor de la propiedad serviceSupplyMethod.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServiceSupplyMethod(String value) {
            this.serviceSupplyMethod = value;
        }

        /**
         * Obtiene el valor de la propiedad servicePaymentMethod.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServicePaymentMethod() {
            return servicePaymentMethod;
        }

        /**
         * Define el valor de la propiedad servicePaymentMethod.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServicePaymentMethod(String value) {
            this.servicePaymentMethod = value;
        }

        /**
         * Obtiene el valor de la propiedad importRegionCountry.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getImportRegionCountry() {
            return importRegionCountry;
        }

        /**
         * Define el valor de la propiedad importRegionCountry.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setImportRegionCountry(String value) {
            this.importRegionCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad exportRegionCountry.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getExportRegionCountry() {
            return exportRegionCountry;
        }

        /**
         * Define el valor de la propiedad exportRegionCountry.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setExportRegionCountry(String value) {
            this.exportRegionCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad useWeightInCalculation.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUseWeightInCalculation() {
            return useWeightInCalculation;
        }

        /**
         * Define el valor de la propiedad useWeightInCalculation.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUseWeightInCalculation(String value) {
            this.useWeightInCalculation = value;
        }

        /**
         * Obtiene el valor de la propiedad intrastatRelevant.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIntrastatRelevant() {
            return intrastatRelevant;
        }

        /**
         * Define el valor de la propiedad intrastatRelevant.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIntrastatRelevant(String value) {
            this.intrastatRelevant = value;
        }

        /**
         * Obtiene el valor de la propiedad statisticalCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStatisticalCode() {
            return statisticalCode;
        }

        /**
         * Define el valor de la propiedad statisticalCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStatisticalCode(String value) {
            this.statisticalCode = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemLocalizationInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IncomeNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemLocalizationInfo"
    })
    public static class ItemLocalizationInfos {

        @XmlElement(name = "ItemLocalizationInfo")
        protected List<ItemLocalizationInfo> itemLocalizationInfo;

        /**
         * Gets the value of the itemLocalizationInfo property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemLocalizationInfo property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemLocalizationInfo().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemLocalizationInfos.ItemLocalizationInfo }
         *
         *
         */
        public List<ItemLocalizationInfo> getItemLocalizationInfo() {
            if (itemLocalizationInfo == null) {
                itemLocalizationInfo = new ArrayList<ItemLocalizationInfo>();
            }
            return this.itemLocalizationInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IncomeNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemLocalizationInfo {

            @XmlElement(name = "ItemCode")
            protected String itemCode;
            @XmlElement(name = "IncomeNature")
            protected String incomeNature;

            /**
             * Obtiene el valor de la propiedad itemCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * Define el valor de la propiedad itemCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setItemCode(String value) {
                this.itemCode = value;
            }

            /**
             * Obtiene el valor de la propiedad incomeNature.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIncomeNature() {
                return incomeNature;
            }

            /**
             * Define el valor de la propiedad incomeNature.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIncomeNature(String value) {
                this.incomeNature = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemPeriodControl" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="DepreciationStatus" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="tNO"/&gt;
     *                         &lt;enumeration value="tYES"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemPeriodControl"
    })
    public static class ItemPeriodControls {

        @XmlElement(name = "ItemPeriodControl")
        protected List<ItemPeriodControl> itemPeriodControl;

        /**
         * Gets the value of the itemPeriodControl property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemPeriodControl property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemPeriodControl().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPeriodControls.ItemPeriodControl }
         *
         *
         */
        public List<ItemPeriodControl> getItemPeriodControl() {
            if (itemPeriodControl == null) {
                itemPeriodControl = new ArrayList<ItemPeriodControl>();
            }
            return this.itemPeriodControl;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SubPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="DepreciationStatus" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="tNO"/&gt;
         *               &lt;enumeration value="tYES"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemPeriodControl {

            @XmlElement(name = "FiscalYear")
            protected String fiscalYear;
            @XmlElement(name = "DepreciationArea")
            protected String depreciationArea;
            @XmlElement(name = "SubPeriod")
            protected Long subPeriod;
            @XmlElement(name = "DepreciationStatus")
            protected String depreciationStatus;
            @XmlElement(name = "Factor")
            protected Double factor;

            /**
             * Obtiene el valor de la propiedad fiscalYear.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFiscalYear() {
                return fiscalYear;
            }

            /**
             * Define el valor de la propiedad fiscalYear.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFiscalYear(String value) {
                this.fiscalYear = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationArea.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDepreciationArea() {
                return depreciationArea;
            }

            /**
             * Define el valor de la propiedad depreciationArea.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDepreciationArea(String value) {
                this.depreciationArea = value;
            }

            /**
             * Obtiene el valor de la propiedad subPeriod.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getSubPeriod() {
                return subPeriod;
            }

            /**
             * Define el valor de la propiedad subPeriod.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setSubPeriod(Long value) {
                this.subPeriod = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationStatus.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDepreciationStatus() {
                return depreciationStatus;
            }

            /**
             * Define el valor de la propiedad depreciationStatus.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDepreciationStatus(String value) {
                this.depreciationStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad factor.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getFactor() {
                return factor;
            }

            /**
             * Define el valor de la propiedad factor.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setFactor(Double value) {
                this.factor = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemPreferredVendor" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="BPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemPreferredVendor"
    })
    public static class ItemPreferredVendors {

        @XmlElement(name = "ItemPreferredVendor")
        protected List<ItemPreferredVendor> itemPreferredVendor;

        /**
         * Gets the value of the itemPreferredVendor property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemPreferredVendor property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemPreferredVendor().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPreferredVendors.ItemPreferredVendor }
         *
         *
         */
        public List<ItemPreferredVendor> getItemPreferredVendor() {
            if (itemPreferredVendor == null) {
                itemPreferredVendor = new ArrayList<ItemPreferredVendor>();
            }
            return this.itemPreferredVendor;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="BPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemPreferredVendor {

            @XmlElement(name = "BPCode")
            protected String bpCode;

            /**
             * Obtiene el valor de la propiedad bpCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBPCode() {
                return bpCode;
            }

            /**
             * Define el valor de la propiedad bpCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBPCode(String value) {
                this.bpCode = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemPrice" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BasePriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="UoMPrices" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Auto" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="tNO"/&gt;
     *                                             &lt;enumeration value="tYES"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemPrice"
    })
    public static class ItemPrices {

        @XmlElement(name = "ItemPrice")
        protected List<ItemPrice> itemPrice;

        /**
         * Gets the value of the itemPrice property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemPrice property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemPrice().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPrices.ItemPrice }
         *
         *
         */
        public List<ItemPrice> getItemPrice() {
            if (itemPrice == null) {
                itemPrice = new ArrayList<ItemPrice>();
            }
            return this.itemPrice;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BasePriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="UoMPrices" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Auto" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="tNO"/&gt;
         *                                   &lt;enumeration value="tYES"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemPrice {

            @XmlElement(name = "PriceList")
            protected Long priceList;
            @XmlElement(name = "Price")
            protected Double price;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "AdditionalPrice1")
            protected Double additionalPrice1;
            @XmlElement(name = "AdditionalCurrency1")
            protected String additionalCurrency1;
            @XmlElement(name = "AdditionalPrice2")
            protected Double additionalPrice2;
            @XmlElement(name = "AdditionalCurrency2")
            protected String additionalCurrency2;
            @XmlElement(name = "BasePriceList")
            protected Long basePriceList;
            @XmlElement(name = "Factor")
            protected Double factor;
            @XmlElement(name = "UoMPrices")
            protected Item.ItemPrices.ItemPrice.UoMPrices uoMPrices;

            /**
             * Obtiene el valor de la propiedad priceList.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getPriceList() {
                return priceList;
            }

            /**
             * Define el valor de la propiedad priceList.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setPriceList(Long value) {
                this.priceList = value;
            }

            /**
             * Obtiene el valor de la propiedad price.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getPrice() {
                return price;
            }

            /**
             * Define el valor de la propiedad price.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setPrice(Double value) {
                this.price = value;
            }

            /**
             * Obtiene el valor de la propiedad currency.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Define el valor de la propiedad currency.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalPrice1.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getAdditionalPrice1() {
                return additionalPrice1;
            }

            /**
             * Define el valor de la propiedad additionalPrice1.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setAdditionalPrice1(Double value) {
                this.additionalPrice1 = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalCurrency1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAdditionalCurrency1() {
                return additionalCurrency1;
            }

            /**
             * Define el valor de la propiedad additionalCurrency1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAdditionalCurrency1(String value) {
                this.additionalCurrency1 = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalPrice2.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getAdditionalPrice2() {
                return additionalPrice2;
            }

            /**
             * Define el valor de la propiedad additionalPrice2.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setAdditionalPrice2(Double value) {
                this.additionalPrice2 = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalCurrency2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAdditionalCurrency2() {
                return additionalCurrency2;
            }

            /**
             * Define el valor de la propiedad additionalCurrency2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAdditionalCurrency2(String value) {
                this.additionalCurrency2 = value;
            }

            /**
             * Obtiene el valor de la propiedad basePriceList.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBasePriceList() {
                return basePriceList;
            }

            /**
             * Define el valor de la propiedad basePriceList.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBasePriceList(Long value) {
                this.basePriceList = value;
            }

            /**
             * Obtiene el valor de la propiedad factor.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getFactor() {
                return factor;
            }

            /**
             * Define el valor de la propiedad factor.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setFactor(Double value) {
                this.factor = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMPrices.
             *
             * @return
             *     possible object is
             *     {@link Item.ItemPrices.ItemPrice.UoMPrices }
             *
             */
            public Item.ItemPrices.ItemPrice.UoMPrices getUoMPrices() {
                return uoMPrices;
            }

            /**
             * Define el valor de la propiedad uoMPrices.
             *
             * @param value
             *     allowed object is
             *     {@link Item.ItemPrices.ItemPrice.UoMPrices }
             *
             */
            public void setUoMPrices(Item.ItemPrices.ItemPrice.UoMPrices value) {
                this.uoMPrices = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Auto" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="tNO"/&gt;
             *                         &lt;enumeration value="tYES"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/all&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "uoMPrice"
            })
            public static class UoMPrices {

                @XmlElement(name = "UoMPrice")
                protected List<UoMPrice> uoMPrice;

                /**
                 * Gets the value of the uoMPrice property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the uoMPrice property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUoMPrice().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Item.ItemPrices.ItemPrice.UoMPrices.UoMPrice }
                 *
                 *
                 */
                public List<UoMPrice> getUoMPrice() {
                    if (uoMPrice == null) {
                        uoMPrice = new ArrayList<UoMPrice>();
                    }
                    return this.uoMPrice;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;all&gt;
                 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Auto" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="tNO"/&gt;
                 *               &lt;enumeration value="tYES"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/all&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class UoMPrice {

                    @XmlElement(name = "PriceList")
                    protected Long priceList;
                    @XmlElement(name = "UoMEntry")
                    protected Long uoMEntry;
                    @XmlElement(name = "ReduceBy")
                    protected Double reduceBy;
                    @XmlElement(name = "Price")
                    protected Double price;
                    @XmlElement(name = "Currency")
                    protected String currency;
                    @XmlElement(name = "AdditionalReduceBy1")
                    protected Double additionalReduceBy1;
                    @XmlElement(name = "AdditionalPrice1")
                    protected Double additionalPrice1;
                    @XmlElement(name = "AdditionalCurrency1")
                    protected String additionalCurrency1;
                    @XmlElement(name = "AdditionalReduceBy2")
                    protected Double additionalReduceBy2;
                    @XmlElement(name = "AdditionalPrice2")
                    protected Double additionalPrice2;
                    @XmlElement(name = "AdditionalCurrency2")
                    protected String additionalCurrency2;
                    @XmlElement(name = "Auto")
                    protected String auto;

                    /**
                     * Obtiene el valor de la propiedad priceList.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getPriceList() {
                        return priceList;
                    }

                    /**
                     * Define el valor de la propiedad priceList.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setPriceList(Long value) {
                        this.priceList = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uoMEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getUoMEntry() {
                        return uoMEntry;
                    }

                    /**
                     * Define el valor de la propiedad uoMEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setUoMEntry(Long value) {
                        this.uoMEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad reduceBy.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getReduceBy() {
                        return reduceBy;
                    }

                    /**
                     * Define el valor de la propiedad reduceBy.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setReduceBy(Double value) {
                        this.reduceBy = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad price.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getPrice() {
                        return price;
                    }

                    /**
                     * Define el valor de la propiedad price.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setPrice(Double value) {
                        this.price = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad currency.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCurrency() {
                        return currency;
                    }

                    /**
                     * Define el valor de la propiedad currency.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCurrency(String value) {
                        this.currency = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalReduceBy1.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getAdditionalReduceBy1() {
                        return additionalReduceBy1;
                    }

                    /**
                     * Define el valor de la propiedad additionalReduceBy1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setAdditionalReduceBy1(Double value) {
                        this.additionalReduceBy1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalPrice1.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getAdditionalPrice1() {
                        return additionalPrice1;
                    }

                    /**
                     * Define el valor de la propiedad additionalPrice1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setAdditionalPrice1(Double value) {
                        this.additionalPrice1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalCurrency1.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAdditionalCurrency1() {
                        return additionalCurrency1;
                    }

                    /**
                     * Define el valor de la propiedad additionalCurrency1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAdditionalCurrency1(String value) {
                        this.additionalCurrency1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalReduceBy2.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getAdditionalReduceBy2() {
                        return additionalReduceBy2;
                    }

                    /**
                     * Define el valor de la propiedad additionalReduceBy2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setAdditionalReduceBy2(Double value) {
                        this.additionalReduceBy2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalPrice2.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getAdditionalPrice2() {
                        return additionalPrice2;
                    }

                    /**
                     * Define el valor de la propiedad additionalPrice2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setAdditionalPrice2(Double value) {
                        this.additionalPrice2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalCurrency2.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAdditionalCurrency2() {
                        return additionalCurrency2;
                    }

                    /**
                     * Define el valor de la propiedad additionalCurrency2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAdditionalCurrency2(String value) {
                        this.additionalCurrency2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad auto.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAuto() {
                        return auto;
                    }

                    /**
                     * Define el valor de la propiedad auto.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAuto(String value) {
                        this.auto = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemProject" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemProject"
    })
    public static class ItemProjects {

        @XmlElement(name = "ItemProject")
        protected List<ItemProject> itemProject;

        /**
         * Gets the value of the itemProject property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemProject property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemProject().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemProjects.ItemProject }
         *
         *
         */
        public List<ItemProject> getItemProject() {
            if (itemProject == null) {
                itemProject = new ArrayList<ItemProject>();
            }
            return this.itemProject;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemProject {

            @XmlElement(name = "LineNumber")
            protected Long lineNumber;
            @XmlElement(name = "ValidFrom")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validFrom;
            @XmlElement(name = "ValidTo")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validTo;
            @XmlElement(name = "Project")
            protected String project;

            /**
             * Obtiene el valor de la propiedad lineNumber.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLineNumber() {
                return lineNumber;
            }

            /**
             * Define el valor de la propiedad lineNumber.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLineNumber(Long value) {
                this.lineNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad validFrom.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getValidFrom() {
                return validFrom;
            }

            /**
             * Define el valor de la propiedad validFrom.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setValidFrom(XMLGregorianCalendar value) {
                this.validFrom = value;
            }

            /**
             * Obtiene el valor de la propiedad validTo.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getValidTo() {
                return validTo;
            }

            /**
             * Define el valor de la propiedad validTo.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setValidTo(XMLGregorianCalendar value) {
                this.validTo = value;
            }

            /**
             * Obtiene el valor de la propiedad project.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProject() {
                return project;
            }

            /**
             * Define el valor de la propiedad project.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProject(String value) {
                this.project = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemUnitOfMeasurement" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="UoMType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="iutPurchasing"/&gt;
     *                         &lt;enumeration value="iutSales"/&gt;
     *                         &lt;enumeration value="iutInventory"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="DefaultBarcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="DefaultPackage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="ItemUoMPackageCollection" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="UoMType" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="iutPurchasing"/&gt;
     *                                             &lt;enumeration value="iutSales"/&gt;
     *                                             &lt;enumeration value="iutInventory"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemUnitOfMeasurement"
    })
    public static class ItemUnitOfMeasurementCollection {

        @XmlElement(name = "ItemUnitOfMeasurement")
        protected List<ItemUnitOfMeasurement> itemUnitOfMeasurement;

        /**
         * Gets the value of the itemUnitOfMeasurement property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemUnitOfMeasurement property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemUnitOfMeasurement().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement }
         *
         *
         */
        public List<ItemUnitOfMeasurement> getItemUnitOfMeasurement() {
            if (itemUnitOfMeasurement == null) {
                itemUnitOfMeasurement = new ArrayList<ItemUnitOfMeasurement>();
            }
            return this.itemUnitOfMeasurement;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="UoMType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="iutPurchasing"/&gt;
         *               &lt;enumeration value="iutSales"/&gt;
         *               &lt;enumeration value="iutInventory"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="DefaultBarcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="DefaultPackage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="ItemUoMPackageCollection" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="UoMType" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="iutPurchasing"/&gt;
         *                                   &lt;enumeration value="iutSales"/&gt;
         *                                   &lt;enumeration value="iutInventory"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemUnitOfMeasurement {

            @XmlElement(name = "UoMType")
            protected String uoMType;
            @XmlElement(name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(name = "DefaultBarcode")
            protected Long defaultBarcode;
            @XmlElement(name = "DefaultPackage")
            protected Long defaultPackage;
            @XmlElement(name = "Length1")
            protected Double length1;
            @XmlElement(name = "Length1Unit")
            protected Long length1Unit;
            @XmlElement(name = "Length2")
            protected Double length2;
            @XmlElement(name = "Length2Unit")
            protected Long length2Unit;
            @XmlElement(name = "Width1")
            protected Double width1;
            @XmlElement(name = "Width1Unit")
            protected Long width1Unit;
            @XmlElement(name = "Width2")
            protected Double width2;
            @XmlElement(name = "Width2Unit")
            protected Long width2Unit;
            @XmlElement(name = "Height1")
            protected Double height1;
            @XmlElement(name = "Height1Unit")
            protected Long height1Unit;
            @XmlElement(name = "Height2")
            protected Double height2;
            @XmlElement(name = "Height2Unit")
            protected Long height2Unit;
            @XmlElement(name = "Volume")
            protected Double volume;
            @XmlElement(name = "VolumeUnit")
            protected Long volumeUnit;
            @XmlElement(name = "Weight1")
            protected Double weight1;
            @XmlElement(name = "Weight1Unit")
            protected Long weight1Unit;
            @XmlElement(name = "Weight2")
            protected Double weight2;
            @XmlElement(name = "Weight2Unit")
            protected Long weight2Unit;
            @XmlElement(name = "ItemUoMPackageCollection")
            protected Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection itemUoMPackageCollection;

            /**
             * Obtiene el valor de la propiedad uoMType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUoMType() {
                return uoMType;
            }

            /**
             * Define el valor de la propiedad uoMType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUoMType(String value) {
                this.uoMType = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUoMEntry() {
                return uoMEntry;
            }

            /**
             * Define el valor de la propiedad uoMEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUoMEntry(Long value) {
                this.uoMEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultBarcode.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getDefaultBarcode() {
                return defaultBarcode;
            }

            /**
             * Define el valor de la propiedad defaultBarcode.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setDefaultBarcode(Long value) {
                this.defaultBarcode = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultPackage.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getDefaultPackage() {
                return defaultPackage;
            }

            /**
             * Define el valor de la propiedad defaultPackage.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setDefaultPackage(Long value) {
                this.defaultPackage = value;
            }

            /**
             * Obtiene el valor de la propiedad length1.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getLength1() {
                return length1;
            }

            /**
             * Define el valor de la propiedad length1.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setLength1(Double value) {
                this.length1 = value;
            }

            /**
             * Obtiene el valor de la propiedad length1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLength1Unit() {
                return length1Unit;
            }

            /**
             * Define el valor de la propiedad length1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLength1Unit(Long value) {
                this.length1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad length2.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getLength2() {
                return length2;
            }

            /**
             * Define el valor de la propiedad length2.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setLength2(Double value) {
                this.length2 = value;
            }

            /**
             * Obtiene el valor de la propiedad length2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLength2Unit() {
                return length2Unit;
            }

            /**
             * Define el valor de la propiedad length2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLength2Unit(Long value) {
                this.length2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad width1.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getWidth1() {
                return width1;
            }

            /**
             * Define el valor de la propiedad width1.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setWidth1(Double value) {
                this.width1 = value;
            }

            /**
             * Obtiene el valor de la propiedad width1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWidth1Unit() {
                return width1Unit;
            }

            /**
             * Define el valor de la propiedad width1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWidth1Unit(Long value) {
                this.width1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad width2.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getWidth2() {
                return width2;
            }

            /**
             * Define el valor de la propiedad width2.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setWidth2(Double value) {
                this.width2 = value;
            }

            /**
             * Obtiene el valor de la propiedad width2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWidth2Unit() {
                return width2Unit;
            }

            /**
             * Define el valor de la propiedad width2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWidth2Unit(Long value) {
                this.width2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad height1.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getHeight1() {
                return height1;
            }

            /**
             * Define el valor de la propiedad height1.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setHeight1(Double value) {
                this.height1 = value;
            }

            /**
             * Obtiene el valor de la propiedad height1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getHeight1Unit() {
                return height1Unit;
            }

            /**
             * Define el valor de la propiedad height1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setHeight1Unit(Long value) {
                this.height1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad height2.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getHeight2() {
                return height2;
            }

            /**
             * Define el valor de la propiedad height2.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setHeight2(Double value) {
                this.height2 = value;
            }

            /**
             * Obtiene el valor de la propiedad height2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getHeight2Unit() {
                return height2Unit;
            }

            /**
             * Define el valor de la propiedad height2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setHeight2Unit(Long value) {
                this.height2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad volume.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getVolume() {
                return volume;
            }

            /**
             * Define el valor de la propiedad volume.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setVolume(Double value) {
                this.volume = value;
            }

            /**
             * Obtiene el valor de la propiedad volumeUnit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getVolumeUnit() {
                return volumeUnit;
            }

            /**
             * Define el valor de la propiedad volumeUnit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setVolumeUnit(Long value) {
                this.volumeUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad weight1.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getWeight1() {
                return weight1;
            }

            /**
             * Define el valor de la propiedad weight1.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setWeight1(Double value) {
                this.weight1 = value;
            }

            /**
             * Obtiene el valor de la propiedad weight1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWeight1Unit() {
                return weight1Unit;
            }

            /**
             * Define el valor de la propiedad weight1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWeight1Unit(Long value) {
                this.weight1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad weight2.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getWeight2() {
                return weight2;
            }

            /**
             * Define el valor de la propiedad weight2.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setWeight2(Double value) {
                this.weight2 = value;
            }

            /**
             * Obtiene el valor de la propiedad weight2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWeight2Unit() {
                return weight2Unit;
            }

            /**
             * Define el valor de la propiedad weight2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWeight2Unit(Long value) {
                this.weight2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad itemUoMPackageCollection.
             *
             * @return
             *     possible object is
             *     {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection }
             *
             */
            public Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection getItemUoMPackageCollection() {
                return itemUoMPackageCollection;
            }

            /**
             * Define el valor de la propiedad itemUoMPackageCollection.
             *
             * @param value
             *     allowed object is
             *     {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection }
             *
             */
            public void setItemUoMPackageCollection(Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection value) {
                this.itemUoMPackageCollection = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="UoMType" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="iutPurchasing"/&gt;
             *                         &lt;enumeration value="iutSales"/&gt;
             *                         &lt;enumeration value="iutInventory"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                 &lt;/all&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "itemUoMPackage"
            })
            public static class ItemUoMPackageCollection {

                @XmlElement(name = "ItemUoMPackage")
                protected List<ItemUoMPackage> itemUoMPackage;

                /**
                 * Gets the value of the itemUoMPackage property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itemUoMPackage property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItemUoMPackage().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection.ItemUoMPackage }
                 *
                 *
                 */
                public List<ItemUoMPackage> getItemUoMPackage() {
                    if (itemUoMPackage == null) {
                        itemUoMPackage = new ArrayList<ItemUoMPackage>();
                    }
                    return this.itemUoMPackage;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;all&gt;
                 *         &lt;element name="UoMType" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="iutPurchasing"/&gt;
                 *               &lt;enumeration value="iutSales"/&gt;
                 *               &lt;enumeration value="iutInventory"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *       &lt;/all&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class ItemUoMPackage {

                    @XmlElement(name = "UoMType")
                    protected String uoMType;
                    @XmlElement(name = "UoMEntry")
                    protected Long uoMEntry;
                    @XmlElement(name = "PackageTypeEntry")
                    protected Long packageTypeEntry;
                    @XmlElement(name = "Length1")
                    protected Double length1;
                    @XmlElement(name = "Length1Unit")
                    protected Long length1Unit;
                    @XmlElement(name = "Length2")
                    protected Double length2;
                    @XmlElement(name = "Length2Unit")
                    protected Long length2Unit;
                    @XmlElement(name = "Width1")
                    protected Double width1;
                    @XmlElement(name = "Width1Unit")
                    protected Long width1Unit;
                    @XmlElement(name = "Width2")
                    protected Double width2;
                    @XmlElement(name = "Width2Unit")
                    protected Long width2Unit;
                    @XmlElement(name = "Height1")
                    protected Double height1;
                    @XmlElement(name = "Height1Unit")
                    protected Long height1Unit;
                    @XmlElement(name = "Height2")
                    protected Double height2;
                    @XmlElement(name = "Height2Unit")
                    protected Long height2Unit;
                    @XmlElement(name = "Volume")
                    protected Double volume;
                    @XmlElement(name = "VolumeUnit")
                    protected Long volumeUnit;
                    @XmlElement(name = "Weight1")
                    protected Double weight1;
                    @XmlElement(name = "Weight1Unit")
                    protected Long weight1Unit;
                    @XmlElement(name = "Weight2")
                    protected Double weight2;
                    @XmlElement(name = "Weight2Unit")
                    protected Long weight2Unit;
                    @XmlElement(name = "QuantityPerPackage")
                    protected Double quantityPerPackage;

                    /**
                     * Obtiene el valor de la propiedad uoMType.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getUoMType() {
                        return uoMType;
                    }

                    /**
                     * Define el valor de la propiedad uoMType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setUoMType(String value) {
                        this.uoMType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uoMEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getUoMEntry() {
                        return uoMEntry;
                    }

                    /**
                     * Define el valor de la propiedad uoMEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setUoMEntry(Long value) {
                        this.uoMEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad packageTypeEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getPackageTypeEntry() {
                        return packageTypeEntry;
                    }

                    /**
                     * Define el valor de la propiedad packageTypeEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setPackageTypeEntry(Long value) {
                        this.packageTypeEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length1.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getLength1() {
                        return length1;
                    }

                    /**
                     * Define el valor de la propiedad length1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setLength1(Double value) {
                        this.length1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length1Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getLength1Unit() {
                        return length1Unit;
                    }

                    /**
                     * Define el valor de la propiedad length1Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setLength1Unit(Long value) {
                        this.length1Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length2.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getLength2() {
                        return length2;
                    }

                    /**
                     * Define el valor de la propiedad length2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setLength2(Double value) {
                        this.length2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length2Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getLength2Unit() {
                        return length2Unit;
                    }

                    /**
                     * Define el valor de la propiedad length2Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setLength2Unit(Long value) {
                        this.length2Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad width1.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getWidth1() {
                        return width1;
                    }

                    /**
                     * Define el valor de la propiedad width1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setWidth1(Double value) {
                        this.width1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad width1Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getWidth1Unit() {
                        return width1Unit;
                    }

                    /**
                     * Define el valor de la propiedad width1Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setWidth1Unit(Long value) {
                        this.width1Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad width2.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getWidth2() {
                        return width2;
                    }

                    /**
                     * Define el valor de la propiedad width2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setWidth2(Double value) {
                        this.width2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad width2Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getWidth2Unit() {
                        return width2Unit;
                    }

                    /**
                     * Define el valor de la propiedad width2Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setWidth2Unit(Long value) {
                        this.width2Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad height1.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getHeight1() {
                        return height1;
                    }

                    /**
                     * Define el valor de la propiedad height1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setHeight1(Double value) {
                        this.height1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad height1Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getHeight1Unit() {
                        return height1Unit;
                    }

                    /**
                     * Define el valor de la propiedad height1Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setHeight1Unit(Long value) {
                        this.height1Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad height2.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getHeight2() {
                        return height2;
                    }

                    /**
                     * Define el valor de la propiedad height2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setHeight2(Double value) {
                        this.height2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad height2Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getHeight2Unit() {
                        return height2Unit;
                    }

                    /**
                     * Define el valor de la propiedad height2Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setHeight2Unit(Long value) {
                        this.height2Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad volume.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getVolume() {
                        return volume;
                    }

                    /**
                     * Define el valor de la propiedad volume.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setVolume(Double value) {
                        this.volume = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad volumeUnit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getVolumeUnit() {
                        return volumeUnit;
                    }

                    /**
                     * Define el valor de la propiedad volumeUnit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setVolumeUnit(Long value) {
                        this.volumeUnit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad weight1.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getWeight1() {
                        return weight1;
                    }

                    /**
                     * Define el valor de la propiedad weight1.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setWeight1(Double value) {
                        this.weight1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad weight1Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getWeight1Unit() {
                        return weight1Unit;
                    }

                    /**
                     * Define el valor de la propiedad weight1Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setWeight1Unit(Long value) {
                        this.weight1Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad weight2.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getWeight2() {
                        return weight2;
                    }

                    /**
                     * Define el valor de la propiedad weight2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setWeight2(Double value) {
                        this.weight2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad weight2Unit.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getWeight2Unit() {
                        return weight2Unit;
                    }

                    /**
                     * Define el valor de la propiedad weight2Unit.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setWeight2Unit(Long value) {
                        this.weight2Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantityPerPackage.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getQuantityPerPackage() {
                        return quantityPerPackage;
                    }

                    /**
                     * Define el valor de la propiedad quantityPerPackage.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setQuantityPerPackage(Double value) {
                        this.quantityPerPackage = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemWarehouseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="MinimalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="MaximalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="MinimalOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="StandardAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Locked" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="tNO"/&gt;
     *                         &lt;enumeration value="tYES"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="InventoryAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CostAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VarienceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DecreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IncreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ReturningAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EURevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EUExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ForeignRevenueAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ForeignExpensAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ExemptIncomeAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PriceDifferenceAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="InStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="WasCounted" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="tNO"/&gt;
     *                         &lt;enumeration value="tYES"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UserSignature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="Counted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="ExpenseClearingAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EUPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ForeignPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SalesCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SalesCreditEUAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ExemptedCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SalesCreditForeignAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ExpenseOffsettingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WipAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ExchangeRateDifferencesAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GoodsClearingAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NegativeInventoryAdjustmentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CostInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GLDecreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GLIncreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAReturnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PurchaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PurchaseOffsetAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ShippedGoodsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="StockInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="StockInflationAdjustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VATInRevenueAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WipVarianceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CostInflationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WHIncomingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WHOutgoingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="StockInTransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WipOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="InventoryOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DefaultBin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;element name="DefaultBinEnforced" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="tNO"/&gt;
     *                         &lt;enumeration value="tYES"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PurchaseBalanceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_UBIC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_UBIC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_UBIC3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_UBIC4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_UBIC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_VLGX_RHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_VLGX_NSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="U_VLGX_POL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ItemCycleCounts" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="Alert" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="tNO"/&gt;
     *                                             &lt;enumeration value="tYES"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
     *                                       &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "itemWarehouseInfo"
    })
    public static class ItemWarehouseInfoCollection {

        @XmlElement(name = "ItemWarehouseInfo")
        protected List<ItemWarehouseInfo> itemWarehouseInfo;

        /**
         * Gets the value of the itemWarehouseInfo property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemWarehouseInfo property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemWarehouseInfo().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo }
         *
         *
         */
        public List<ItemWarehouseInfo> getItemWarehouseInfo() {
            if (itemWarehouseInfo == null) {
                itemWarehouseInfo = new ArrayList<ItemWarehouseInfo>();
            }
            return this.itemWarehouseInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="MinimalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="MaximalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="MinimalOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="StandardAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Locked" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="tNO"/&gt;
         *               &lt;enumeration value="tYES"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="InventoryAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CostAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VarienceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DecreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IncreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ReturningAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EURevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EUExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ForeignRevenueAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ForeignExpensAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ExemptIncomeAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PriceDifferenceAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="InStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="WasCounted" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="tNO"/&gt;
         *               &lt;enumeration value="tYES"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UserSignature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="Counted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="ExpenseClearingAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EUPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ForeignPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SalesCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SalesCreditEUAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ExemptedCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SalesCreditForeignAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ExpenseOffsettingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WipAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ExchangeRateDifferencesAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GoodsClearingAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NegativeInventoryAdjustmentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CostInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GLDecreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GLIncreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAReturnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PurchaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PurchaseOffsetAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ShippedGoodsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="StockInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="StockInflationAdjustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VATInRevenueAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WipVarianceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CostInflationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WHIncomingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WHOutgoingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="StockInTransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WipOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="InventoryOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DefaultBin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="DefaultBinEnforced" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="tNO"/&gt;
         *               &lt;enumeration value="tYES"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PurchaseBalanceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_UBIC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_UBIC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_UBIC3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_UBIC4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_UBIC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_VLGX_RHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_VLGX_NSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="U_VLGX_POL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ItemCycleCounts" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="Alert" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="tNO"/&gt;
         *                                   &lt;enumeration value="tYES"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
         *                             &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemWarehouseInfo {

            @XmlElement(name = "MinimalStock")
            protected Double minimalStock;
            @XmlElement(name = "MaximalStock")
            protected Double maximalStock;
            @XmlElement(name = "MinimalOrder")
            protected Double minimalOrder;
            @XmlElement(name = "StandardAveragePrice")
            protected Double standardAveragePrice;
            @XmlElement(name = "Locked")
            protected String locked;
            @XmlElement(name = "InventoryAccount")
            protected String inventoryAccount;
            @XmlElement(name = "CostAccount")
            protected String costAccount;
            @XmlElement(name = "TransferAccount")
            protected String transferAccount;
            @XmlElement(name = "RevenuesAccount")
            protected String revenuesAccount;
            @XmlElement(name = "VarienceAccount")
            protected String varienceAccount;
            @XmlElement(name = "DecreasingAccount")
            protected String decreasingAccount;
            @XmlElement(name = "IncreasingAccount")
            protected String increasingAccount;
            @XmlElement(name = "ReturningAccount")
            protected String returningAccount;
            @XmlElement(name = "ExpensesAccount")
            protected String expensesAccount;
            @XmlElement(name = "EURevenuesAccount")
            protected String euRevenuesAccount;
            @XmlElement(name = "EUExpensesAccount")
            protected String euExpensesAccount;
            @XmlElement(name = "ForeignRevenueAcc")
            protected String foreignRevenueAcc;
            @XmlElement(name = "ForeignExpensAcc")
            protected String foreignExpensAcc;
            @XmlElement(name = "ExemptIncomeAcc")
            protected String exemptIncomeAcc;
            @XmlElement(name = "PriceDifferenceAcc")
            protected String priceDifferenceAcc;
            @XmlElement(name = "WarehouseCode")
            protected String warehouseCode;
            @XmlElement(name = "InStock")
            protected Double inStock;
            @XmlElement(name = "Committed")
            protected Double committed;
            @XmlElement(name = "Ordered")
            protected Double ordered;
            @XmlElement(name = "CountedQuantity")
            protected Double countedQuantity;
            @XmlElement(name = "WasCounted")
            protected String wasCounted;
            @XmlElement(name = "UserSignature")
            protected Long userSignature;
            @XmlElement(name = "Counted")
            protected Double counted;
            @XmlElement(name = "ExpenseClearingAct")
            protected String expenseClearingAct;
            @XmlElement(name = "PurchaseCreditAcc")
            protected String purchaseCreditAcc;
            @XmlElement(name = "EUPurchaseCreditAcc")
            protected String euPurchaseCreditAcc;
            @XmlElement(name = "ForeignPurchaseCreditAcc")
            protected String foreignPurchaseCreditAcc;
            @XmlElement(name = "SalesCreditAcc")
            protected String salesCreditAcc;
            @XmlElement(name = "SalesCreditEUAcc")
            protected String salesCreditEUAcc;
            @XmlElement(name = "ExemptedCredits")
            protected String exemptedCredits;
            @XmlElement(name = "SalesCreditForeignAcc")
            protected String salesCreditForeignAcc;
            @XmlElement(name = "ExpenseOffsettingAccount")
            protected String expenseOffsettingAccount;
            @XmlElement(name = "WipAccount")
            protected String wipAccount;
            @XmlElement(name = "ExchangeRateDifferencesAcct")
            protected String exchangeRateDifferencesAcct;
            @XmlElement(name = "GoodsClearingAcct")
            protected String goodsClearingAcct;
            @XmlElement(name = "NegativeInventoryAdjustmentAccount")
            protected String negativeInventoryAdjustmentAccount;
            @XmlElement(name = "CostInflationOffsetAccount")
            protected String costInflationOffsetAccount;
            @XmlElement(name = "GLDecreaseAcct")
            protected String glDecreaseAcct;
            @XmlElement(name = "GLIncreaseAcct")
            protected String glIncreaseAcct;
            @XmlElement(name = "PAReturnAcct")
            protected String paReturnAcct;
            @XmlElement(name = "PurchaseAcct")
            protected String purchaseAcct;
            @XmlElement(name = "PurchaseOffsetAcct")
            protected String purchaseOffsetAcct;
            @XmlElement(name = "ShippedGoodsAccount")
            protected String shippedGoodsAccount;
            @XmlElement(name = "StockInflationOffsetAccount")
            protected String stockInflationOffsetAccount;
            @XmlElement(name = "StockInflationAdjustAccount")
            protected String stockInflationAdjustAccount;
            @XmlElement(name = "VATInRevenueAccount")
            protected String vatInRevenueAccount;
            @XmlElement(name = "WipVarianceAccount")
            protected String wipVarianceAccount;
            @XmlElement(name = "CostInflationAccount")
            protected String costInflationAccount;
            @XmlElement(name = "WHIncomingCenvatAccount")
            protected String whIncomingCenvatAccount;
            @XmlElement(name = "WHOutgoingCenvatAccount")
            protected String whOutgoingCenvatAccount;
            @XmlElement(name = "StockInTransitAccount")
            protected String stockInTransitAccount;
            @XmlElement(name = "WipOffsetProfitAndLossAccount")
            protected String wipOffsetProfitAndLossAccount;
            @XmlElement(name = "InventoryOffsetProfitAndLossAccount")
            protected String inventoryOffsetProfitAndLossAccount;
            @XmlElement(name = "DefaultBin")
            protected Long defaultBin;
            @XmlElement(name = "DefaultBinEnforced")
            protected String defaultBinEnforced;
            @XmlElement(name = "PurchaseBalanceAccount")
            protected String purchaseBalanceAccount;
            @XmlElement(name = "U_UBIC1")
            protected String uubic1;
            @XmlElement(name = "U_UBIC2")
            protected String uubic2;
            @XmlElement(name = "U_UBIC3")
            protected String uubic3;
            @XmlElement(name = "U_UBIC4")
            protected String uubic4;
            @XmlElement(name = "U_UBIC5")
            protected String uubic5;
            @XmlElement(name = "U_VLGX_RHT")
            protected String uvlgxrht;
            @XmlElement(name = "U_VLGX_NSP")
            protected String uvlgxnsp;
            @XmlElement(name = "U_VLGX_POL")
            protected String uvlgxpol;
            @XmlElement(name = "ItemCycleCounts")
            protected Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts itemCycleCounts;

            /**
             * Obtiene el valor de la propiedad minimalStock.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getMinimalStock() {
                return minimalStock;
            }

            /**
             * Define el valor de la propiedad minimalStock.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setMinimalStock(Double value) {
                this.minimalStock = value;
            }

            /**
             * Obtiene el valor de la propiedad maximalStock.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getMaximalStock() {
                return maximalStock;
            }

            /**
             * Define el valor de la propiedad maximalStock.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setMaximalStock(Double value) {
                this.maximalStock = value;
            }

            /**
             * Obtiene el valor de la propiedad minimalOrder.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getMinimalOrder() {
                return minimalOrder;
            }

            /**
             * Define el valor de la propiedad minimalOrder.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setMinimalOrder(Double value) {
                this.minimalOrder = value;
            }

            /**
             * Obtiene el valor de la propiedad standardAveragePrice.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getStandardAveragePrice() {
                return standardAveragePrice;
            }

            /**
             * Define el valor de la propiedad standardAveragePrice.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setStandardAveragePrice(Double value) {
                this.standardAveragePrice = value;
            }

            /**
             * Obtiene el valor de la propiedad locked.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLocked() {
                return locked;
            }

            /**
             * Define el valor de la propiedad locked.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLocked(String value) {
                this.locked = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInventoryAccount() {
                return inventoryAccount;
            }

            /**
             * Define el valor de la propiedad inventoryAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInventoryAccount(String value) {
                this.inventoryAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostAccount() {
                return costAccount;
            }

            /**
             * Define el valor de la propiedad costAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostAccount(String value) {
                this.costAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad transferAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTransferAccount() {
                return transferAccount;
            }

            /**
             * Define el valor de la propiedad transferAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTransferAccount(String value) {
                this.transferAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad revenuesAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRevenuesAccount() {
                return revenuesAccount;
            }

            /**
             * Define el valor de la propiedad revenuesAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRevenuesAccount(String value) {
                this.revenuesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad varienceAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVarienceAccount() {
                return varienceAccount;
            }

            /**
             * Define el valor de la propiedad varienceAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVarienceAccount(String value) {
                this.varienceAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad decreasingAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDecreasingAccount() {
                return decreasingAccount;
            }

            /**
             * Define el valor de la propiedad decreasingAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDecreasingAccount(String value) {
                this.decreasingAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad increasingAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIncreasingAccount() {
                return increasingAccount;
            }

            /**
             * Define el valor de la propiedad increasingAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIncreasingAccount(String value) {
                this.increasingAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad returningAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getReturningAccount() {
                return returningAccount;
            }

            /**
             * Define el valor de la propiedad returningAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setReturningAccount(String value) {
                this.returningAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad expensesAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExpensesAccount() {
                return expensesAccount;
            }

            /**
             * Define el valor de la propiedad expensesAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExpensesAccount(String value) {
                this.expensesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad euRevenuesAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEURevenuesAccount() {
                return euRevenuesAccount;
            }

            /**
             * Define el valor de la propiedad euRevenuesAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEURevenuesAccount(String value) {
                this.euRevenuesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad euExpensesAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEUExpensesAccount() {
                return euExpensesAccount;
            }

            /**
             * Define el valor de la propiedad euExpensesAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEUExpensesAccount(String value) {
                this.euExpensesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad foreignRevenueAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getForeignRevenueAcc() {
                return foreignRevenueAcc;
            }

            /**
             * Define el valor de la propiedad foreignRevenueAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setForeignRevenueAcc(String value) {
                this.foreignRevenueAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad foreignExpensAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getForeignExpensAcc() {
                return foreignExpensAcc;
            }

            /**
             * Define el valor de la propiedad foreignExpensAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setForeignExpensAcc(String value) {
                this.foreignExpensAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad exemptIncomeAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExemptIncomeAcc() {
                return exemptIncomeAcc;
            }

            /**
             * Define el valor de la propiedad exemptIncomeAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExemptIncomeAcc(String value) {
                this.exemptIncomeAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad priceDifferenceAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPriceDifferenceAcc() {
                return priceDifferenceAcc;
            }

            /**
             * Define el valor de la propiedad priceDifferenceAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPriceDifferenceAcc(String value) {
                this.priceDifferenceAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad warehouseCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWarehouseCode() {
                return warehouseCode;
            }

            /**
             * Define el valor de la propiedad warehouseCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWarehouseCode(String value) {
                this.warehouseCode = value;
            }

            /**
             * Obtiene el valor de la propiedad inStock.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getInStock() {
                return inStock;
            }

            /**
             * Define el valor de la propiedad inStock.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setInStock(Double value) {
                this.inStock = value;
            }

            /**
             * Obtiene el valor de la propiedad committed.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getCommitted() {
                return committed;
            }

            /**
             * Define el valor de la propiedad committed.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setCommitted(Double value) {
                this.committed = value;
            }

            /**
             * Obtiene el valor de la propiedad ordered.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getOrdered() {
                return ordered;
            }

            /**
             * Define el valor de la propiedad ordered.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setOrdered(Double value) {
                this.ordered = value;
            }

            /**
             * Obtiene el valor de la propiedad countedQuantity.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getCountedQuantity() {
                return countedQuantity;
            }

            /**
             * Define el valor de la propiedad countedQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setCountedQuantity(Double value) {
                this.countedQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad wasCounted.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWasCounted() {
                return wasCounted;
            }

            /**
             * Define el valor de la propiedad wasCounted.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWasCounted(String value) {
                this.wasCounted = value;
            }

            /**
             * Obtiene el valor de la propiedad userSignature.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUserSignature() {
                return userSignature;
            }

            /**
             * Define el valor de la propiedad userSignature.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUserSignature(Long value) {
                this.userSignature = value;
            }

            /**
             * Obtiene el valor de la propiedad counted.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getCounted() {
                return counted;
            }

            /**
             * Define el valor de la propiedad counted.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setCounted(Double value) {
                this.counted = value;
            }

            /**
             * Obtiene el valor de la propiedad expenseClearingAct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExpenseClearingAct() {
                return expenseClearingAct;
            }

            /**
             * Define el valor de la propiedad expenseClearingAct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExpenseClearingAct(String value) {
                this.expenseClearingAct = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseCreditAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPurchaseCreditAcc() {
                return purchaseCreditAcc;
            }

            /**
             * Define el valor de la propiedad purchaseCreditAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPurchaseCreditAcc(String value) {
                this.purchaseCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad euPurchaseCreditAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEUPurchaseCreditAcc() {
                return euPurchaseCreditAcc;
            }

            /**
             * Define el valor de la propiedad euPurchaseCreditAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEUPurchaseCreditAcc(String value) {
                this.euPurchaseCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad foreignPurchaseCreditAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getForeignPurchaseCreditAcc() {
                return foreignPurchaseCreditAcc;
            }

            /**
             * Define el valor de la propiedad foreignPurchaseCreditAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setForeignPurchaseCreditAcc(String value) {
                this.foreignPurchaseCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad salesCreditAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSalesCreditAcc() {
                return salesCreditAcc;
            }

            /**
             * Define el valor de la propiedad salesCreditAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSalesCreditAcc(String value) {
                this.salesCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad salesCreditEUAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSalesCreditEUAcc() {
                return salesCreditEUAcc;
            }

            /**
             * Define el valor de la propiedad salesCreditEUAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSalesCreditEUAcc(String value) {
                this.salesCreditEUAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad exemptedCredits.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExemptedCredits() {
                return exemptedCredits;
            }

            /**
             * Define el valor de la propiedad exemptedCredits.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExemptedCredits(String value) {
                this.exemptedCredits = value;
            }

            /**
             * Obtiene el valor de la propiedad salesCreditForeignAcc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSalesCreditForeignAcc() {
                return salesCreditForeignAcc;
            }

            /**
             * Define el valor de la propiedad salesCreditForeignAcc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSalesCreditForeignAcc(String value) {
                this.salesCreditForeignAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad expenseOffsettingAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExpenseOffsettingAccount() {
                return expenseOffsettingAccount;
            }

            /**
             * Define el valor de la propiedad expenseOffsettingAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExpenseOffsettingAccount(String value) {
                this.expenseOffsettingAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad wipAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWipAccount() {
                return wipAccount;
            }

            /**
             * Define el valor de la propiedad wipAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWipAccount(String value) {
                this.wipAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad exchangeRateDifferencesAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExchangeRateDifferencesAcct() {
                return exchangeRateDifferencesAcct;
            }

            /**
             * Define el valor de la propiedad exchangeRateDifferencesAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExchangeRateDifferencesAcct(String value) {
                this.exchangeRateDifferencesAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad goodsClearingAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGoodsClearingAcct() {
                return goodsClearingAcct;
            }

            /**
             * Define el valor de la propiedad goodsClearingAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGoodsClearingAcct(String value) {
                this.goodsClearingAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad negativeInventoryAdjustmentAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNegativeInventoryAdjustmentAccount() {
                return negativeInventoryAdjustmentAccount;
            }

            /**
             * Define el valor de la propiedad negativeInventoryAdjustmentAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNegativeInventoryAdjustmentAccount(String value) {
                this.negativeInventoryAdjustmentAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costInflationOffsetAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostInflationOffsetAccount() {
                return costInflationOffsetAccount;
            }

            /**
             * Define el valor de la propiedad costInflationOffsetAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostInflationOffsetAccount(String value) {
                this.costInflationOffsetAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad glDecreaseAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGLDecreaseAcct() {
                return glDecreaseAcct;
            }

            /**
             * Define el valor de la propiedad glDecreaseAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGLDecreaseAcct(String value) {
                this.glDecreaseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad glIncreaseAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGLIncreaseAcct() {
                return glIncreaseAcct;
            }

            /**
             * Define el valor de la propiedad glIncreaseAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGLIncreaseAcct(String value) {
                this.glIncreaseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad paReturnAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPAReturnAcct() {
                return paReturnAcct;
            }

            /**
             * Define el valor de la propiedad paReturnAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPAReturnAcct(String value) {
                this.paReturnAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPurchaseAcct() {
                return purchaseAcct;
            }

            /**
             * Define el valor de la propiedad purchaseAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPurchaseAcct(String value) {
                this.purchaseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseOffsetAcct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPurchaseOffsetAcct() {
                return purchaseOffsetAcct;
            }

            /**
             * Define el valor de la propiedad purchaseOffsetAcct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPurchaseOffsetAcct(String value) {
                this.purchaseOffsetAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad shippedGoodsAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getShippedGoodsAccount() {
                return shippedGoodsAccount;
            }

            /**
             * Define el valor de la propiedad shippedGoodsAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setShippedGoodsAccount(String value) {
                this.shippedGoodsAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInflationOffsetAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStockInflationOffsetAccount() {
                return stockInflationOffsetAccount;
            }

            /**
             * Define el valor de la propiedad stockInflationOffsetAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStockInflationOffsetAccount(String value) {
                this.stockInflationOffsetAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInflationAdjustAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStockInflationAdjustAccount() {
                return stockInflationAdjustAccount;
            }

            /**
             * Define el valor de la propiedad stockInflationAdjustAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStockInflationAdjustAccount(String value) {
                this.stockInflationAdjustAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad vatInRevenueAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVATInRevenueAccount() {
                return vatInRevenueAccount;
            }

            /**
             * Define el valor de la propiedad vatInRevenueAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVATInRevenueAccount(String value) {
                this.vatInRevenueAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad wipVarianceAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWipVarianceAccount() {
                return wipVarianceAccount;
            }

            /**
             * Define el valor de la propiedad wipVarianceAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWipVarianceAccount(String value) {
                this.wipVarianceAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costInflationAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostInflationAccount() {
                return costInflationAccount;
            }

            /**
             * Define el valor de la propiedad costInflationAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostInflationAccount(String value) {
                this.costInflationAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad whIncomingCenvatAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWHIncomingCenvatAccount() {
                return whIncomingCenvatAccount;
            }

            /**
             * Define el valor de la propiedad whIncomingCenvatAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWHIncomingCenvatAccount(String value) {
                this.whIncomingCenvatAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad whOutgoingCenvatAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWHOutgoingCenvatAccount() {
                return whOutgoingCenvatAccount;
            }

            /**
             * Define el valor de la propiedad whOutgoingCenvatAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWHOutgoingCenvatAccount(String value) {
                this.whOutgoingCenvatAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInTransitAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStockInTransitAccount() {
                return stockInTransitAccount;
            }

            /**
             * Define el valor de la propiedad stockInTransitAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStockInTransitAccount(String value) {
                this.stockInTransitAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad wipOffsetProfitAndLossAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWipOffsetProfitAndLossAccount() {
                return wipOffsetProfitAndLossAccount;
            }

            /**
             * Define el valor de la propiedad wipOffsetProfitAndLossAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWipOffsetProfitAndLossAccount(String value) {
                this.wipOffsetProfitAndLossAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryOffsetProfitAndLossAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInventoryOffsetProfitAndLossAccount() {
                return inventoryOffsetProfitAndLossAccount;
            }

            /**
             * Define el valor de la propiedad inventoryOffsetProfitAndLossAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInventoryOffsetProfitAndLossAccount(String value) {
                this.inventoryOffsetProfitAndLossAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultBin.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getDefaultBin() {
                return defaultBin;
            }

            /**
             * Define el valor de la propiedad defaultBin.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setDefaultBin(Long value) {
                this.defaultBin = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultBinEnforced.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDefaultBinEnforced() {
                return defaultBinEnforced;
            }

            /**
             * Define el valor de la propiedad defaultBinEnforced.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDefaultBinEnforced(String value) {
                this.defaultBinEnforced = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseBalanceAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPurchaseBalanceAccount() {
                return purchaseBalanceAccount;
            }

            /**
             * Define el valor de la propiedad purchaseBalanceAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPurchaseBalanceAccount(String value) {
                this.purchaseBalanceAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad uubic1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUUBIC1() {
                return uubic1;
            }

            /**
             * Define el valor de la propiedad uubic1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUUBIC1(String value) {
                this.uubic1 = value;
            }

            /**
             * Obtiene el valor de la propiedad uubic2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUUBIC2() {
                return uubic2;
            }

            /**
             * Define el valor de la propiedad uubic2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUUBIC2(String value) {
                this.uubic2 = value;
            }

            /**
             * Obtiene el valor de la propiedad uubic3.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUUBIC3() {
                return uubic3;
            }

            /**
             * Define el valor de la propiedad uubic3.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUUBIC3(String value) {
                this.uubic3 = value;
            }

            /**
             * Obtiene el valor de la propiedad uubic4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUUBIC4() {
                return uubic4;
            }

            /**
             * Define el valor de la propiedad uubic4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUUBIC4(String value) {
                this.uubic4 = value;
            }

            /**
             * Obtiene el valor de la propiedad uubic5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUUBIC5() {
                return uubic5;
            }

            /**
             * Define el valor de la propiedad uubic5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUUBIC5(String value) {
                this.uubic5 = value;
            }

            /**
             * Obtiene el valor de la propiedad uvlgxrht.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUVLGXRHT() {
                return uvlgxrht;
            }

            /**
             * Define el valor de la propiedad uvlgxrht.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUVLGXRHT(String value) {
                this.uvlgxrht = value;
            }

            /**
             * Obtiene el valor de la propiedad uvlgxnsp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUVLGXNSP() {
                return uvlgxnsp;
            }

            /**
             * Define el valor de la propiedad uvlgxnsp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUVLGXNSP(String value) {
                this.uvlgxnsp = value;
            }

            /**
             * Obtiene el valor de la propiedad uvlgxpol.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUVLGXPOL() {
                return uvlgxpol;
            }

            /**
             * Define el valor de la propiedad uvlgxpol.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUVLGXPOL(String value) {
                this.uvlgxpol = value;
            }

            /**
             * Obtiene el valor de la propiedad itemCycleCounts.
             *
             * @return
             *     possible object is
             *     {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts }
             *
             */
            public Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts getItemCycleCounts() {
                return itemCycleCounts;
            }

            /**
             * Define el valor de la propiedad itemCycleCounts.
             *
             * @param value
             *     allowed object is
             *     {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts }
             *
             */
            public void setItemCycleCounts(Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts value) {
                this.itemCycleCounts = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="Alert" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="tNO"/&gt;
             *                         &lt;enumeration value="tYES"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
             *                   &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/all&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "itemCycleCount"
            })
            public static class ItemCycleCounts {

                @XmlElement(name = "ItemCycleCount")
                protected List<ItemCycleCount> itemCycleCount;

                /**
                 * Gets the value of the itemCycleCount property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itemCycleCount property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItemCycleCount().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts.ItemCycleCount }
                 *
                 *
                 */
                public List<ItemCycleCount> getItemCycleCount() {
                    if (itemCycleCount == null) {
                        itemCycleCount = new ArrayList<ItemCycleCount>();
                    }
                    return this.itemCycleCount;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;all&gt;
                 *         &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="Alert" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="tNO"/&gt;
                 *               &lt;enumeration value="tYES"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
                 *         &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/all&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class ItemCycleCount {

                    @XmlElement(name = "CycleCode")
                    protected Long cycleCode;
                    @XmlElement(name = "Alert")
                    protected String alert;
                    @XmlElement(name = "NextCountingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar nextCountingDate;
                    @XmlElement(name = "AlertTime")
                    @XmlSchemaType(name = "time")
                    protected XMLGregorianCalendar alertTime;
                    @XmlElement(name = "DestinationUser")
                    protected Long destinationUser;
                    @XmlElement(name = "WarehouseCode")
                    protected String warehouseCode;

                    /**
                     * Obtiene el valor de la propiedad cycleCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getCycleCode() {
                        return cycleCode;
                    }

                    /**
                     * Define el valor de la propiedad cycleCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setCycleCode(Long value) {
                        this.cycleCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad alert.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAlert() {
                        return alert;
                    }

                    /**
                     * Define el valor de la propiedad alert.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAlert(String value) {
                        this.alert = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nextCountingDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getNextCountingDate() {
                        return nextCountingDate;
                    }

                    /**
                     * Define el valor de la propiedad nextCountingDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setNextCountingDate(XMLGregorianCalendar value) {
                        this.nextCountingDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad alertTime.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getAlertTime() {
                        return alertTime;
                    }

                    /**
                     * Define el valor de la propiedad alertTime.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setAlertTime(XMLGregorianCalendar value) {
                        this.alertTime = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad destinationUser.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getDestinationUser() {
                        return destinationUser;
                    }

                    /**
                     * Define el valor de la propiedad destinationUser.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setDestinationUser(Long value) {
                        this.destinationUser = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warehouseCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getWarehouseCode() {
                        return warehouseCode;
                    }

                    /**
                     * Define el valor de la propiedad warehouseCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setWarehouseCode(String value) {
                        this.warehouseCode = value;
                    }

                }

            }

        }

    }

}
