
package co.igb.b1ws.client.purchasedeliverynote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PurchaseDeliveryNotesServiceSoap", targetNamespace = "PurchaseDeliveryNotesService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PurchaseDeliveryNotesServiceSoap {


    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.GetByParamsResponse
     */
    @WebMethod(operationName = "GetByParams", action = "PurchaseDeliveryNotesService/GetByParams")
    @WebResult(name = "GetByParamsResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetByParamsResponse getByParams(
        @WebParam(name = "GetByParams", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        GetByParams parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.AddResponse
     */
    @WebMethod(operationName = "Add", action = "PurchaseDeliveryNotesService/Add")
    @WebResult(name = "AddResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public AddResponse add(
        @WebParam(name = "Add", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Add parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.UpdateResponse
     */
    @WebMethod(operationName = "Update", action = "PurchaseDeliveryNotesService/Update")
    @WebResult(name = "UpdateResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "Update", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Update parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.RemoveResponse
     */
    @WebMethod(operationName = "Remove", action = "PurchaseDeliveryNotesService/Remove")
    @WebResult(name = "RemoveResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public RemoveResponse remove(
        @WebParam(name = "Remove", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Remove parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.CloseResponse
     */
    @WebMethod(operationName = "Close", action = "PurchaseDeliveryNotesService/Close")
    @WebResult(name = "CloseResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CloseResponse close(
        @WebParam(name = "Close", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Close parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.CancelResponse
     */
    @WebMethod(operationName = "Cancel", action = "PurchaseDeliveryNotesService/Cancel")
    @WebResult(name = "CancelResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CancelResponse cancel(
        @WebParam(name = "Cancel", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Cancel parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.ReopenResponse
     */
    @WebMethod(operationName = "Reopen", action = "PurchaseDeliveryNotesService/Reopen")
    @WebResult(name = "ReopenResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public ReopenResponse reopen(
        @WebParam(name = "Reopen", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Reopen parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.SaveDraftToDocumentResponse
     */
    @WebMethod(operationName = "SaveDraftToDocument", action = "PurchaseDeliveryNotesService/SaveDraftToDocument")
    @WebResult(name = "SaveDraftToDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public SaveDraftToDocumentResponse saveDraftToDocument(
        @WebParam(name = "SaveDraftToDocument", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        SaveDraftToDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.GetApprovalTemplatesResponse
     */
    @WebMethod(operationName = "GetApprovalTemplates", action = "PurchaseDeliveryNotesService/GetApprovalTemplates")
    @WebResult(name = "GetApprovalTemplatesResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetApprovalTemplatesResponse getApprovalTemplates(
        @WebParam(name = "GetApprovalTemplates", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        GetApprovalTemplates parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.UpdateFromXMLResponse
     */
    @WebMethod(operationName = "UpdateFromXML", action = "PurchaseDeliveryNotesService/UpdateFromXML")
    @WebResult(name = "UpdateFromXMLResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateFromXMLResponse updateFromXML(
        @WebParam(name = "UpdateFromXML", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        UpdateFromXML parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.PreviewResponse
     */
    @WebMethod(operationName = "Preview", action = "PurchaseDeliveryNotesService/Preview")
    @WebResult(name = "PreviewResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public PreviewResponse preview(
        @WebParam(name = "Preview", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        Preview parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.HandleApprovalRequestResponse
     */
    @WebMethod(operationName = "HandleApprovalRequest", action = "PurchaseDeliveryNotesService/HandleApprovalRequest")
    @WebResult(name = "HandleApprovalRequestResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public HandleApprovalRequestResponse handleApprovalRequest(
        @WebParam(name = "HandleApprovalRequest", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        HandleApprovalRequest parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.purchasedeliverynote.CreateCancellationDocumentResponse
     */
    @WebMethod(operationName = "CreateCancellationDocument", action = "PurchaseDeliveryNotesService/CreateCancellationDocument")
    @WebResult(name = "CreateCancellationDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CreateCancellationDocumentResponse createCancellationDocument(
        @WebParam(name = "CreateCancellationDocument", targetNamespace = "PurchaseDeliveryNotesService", partName = "parameters")
        CreateCancellationDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

}
