
package com.copiacs.retrofitpost.PostMaster.Lifafa;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lifafa {

    @SerializedName("TicketID")
    @Expose
    private String ticketID;
    @SerializedName("PPRType")
    @Expose
    private String pPRType;
    @SerializedName("CallType")
    @Expose
    private String callType;
    @SerializedName("Potential")
    @Expose
    private String potential;
    @SerializedName("Region")
    @Expose
    private String region;
    @SerializedName("Division")
    @Expose
    private String division;
    @SerializedName("GenralMeeting")
    @Expose
    private String genralMeeting;
    @SerializedName("Product")
    @Expose
    private String product;
    @SerializedName("Model")
    @Expose
    private String model;
    @SerializedName("SerialNo")
    @Expose
    private String serialNo;
    @SerializedName("HMR")
    @Expose
    private String hMR;
    @SerializedName("ExpectedHMR")
    @Expose
    private String expectedHMR;
    @SerializedName("HMR_Category")
    @Expose
    private String hMRCategory;
    @SerializedName("AddPartDes")
    @Expose
    private String addPartDes;
    @SerializedName("CustomerID")
    @Expose
    private String customerID;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("CMRID")
    @Expose
    private String cMRID;
    @SerializedName("PPRID")
    @Expose
    private String pPRID;
    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("ReqTypeID")
    @Expose
    private String reqTypeID;
    @SerializedName("Comments")
    @Expose
    private String comments;
    @SerializedName("PartComments")
    @Expose
    private String partComments;
    @SerializedName("SendTo")
    @Expose
    private String sendTo;
    @SerializedName("ShiftTo")
    @Expose
    private String shiftTo;
    @SerializedName("DivisionID")
    @Expose
    private String divisionID;
    @SerializedName("ProductID")
    @Expose
    private String productID;
    @SerializedName("MachineSrNo")
    @Expose
    private String machineSrNo;
    @SerializedName("ExpWorking")
    @Expose
    private String expWorking;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("CallTypeID")
    @Expose
    private String callTypeID;
    @SerializedName("RegionID")
    @Expose
    private String regionID;
    @SerializedName("ImageUpload")
    @Expose
    private String imageUpload;
    @SerializedName("PPRTypeID")
    @Expose
    private String pPRTypeID;
    @SerializedName("PPRStatusID")
    @Expose
    private String pPRStatusID;
    @SerializedName("ShiptoID")
    @Expose
    private String shiptoID;
    @SerializedName("PurchaseTimelineID")
    @Expose
    private String purchaseTimelineID;
    @SerializedName("PPRNO")
    @Expose
    private String pPRNO;
    @SerializedName("TempAddPart")
    @Expose
    private List<TempAddPart> tempAddPart = null;

    public Lifafa(String ticketID, String pPRType, String callType, String potential, String region, String division, String genralMeeting, String product, String model, String serialNo, String hMR, String expectedHMR, String hMRCategory, String addPartDes, String customerID, String userId, String cMRID, String pPRID, String dealerId, String reqTypeID, String comments, String partComments, String sendTo, String shiftTo, String divisionID, String productID, String machineSrNo, String expWorking, String category, String callTypeID, String regionID, String imageUpload, String pPRTypeID, String pPRStatusID, String shiptoID, String purchaseTimelineID, String pPRNO, List<TempAddPart> tempAddPart) {
        this.ticketID = ticketID;
        this.pPRType = pPRType;
        this.callType = callType;
        this.potential = potential;
        this.region = region;
        this.division = division;
        this.genralMeeting = genralMeeting;
        this.product = product;
        this.model = model;
        this.serialNo = serialNo;
        this.hMR = hMR;
        this.expectedHMR = expectedHMR;
        this.hMRCategory = hMRCategory;
        this.addPartDes = addPartDes;
        this.customerID = customerID;
        this.userId = userId;
        this.cMRID = cMRID;
        this.pPRID = pPRID;
        this.dealerId = dealerId;
        this.reqTypeID = reqTypeID;
        this.comments = comments;
        this.partComments = partComments;
        this.sendTo = sendTo;
        this.shiftTo = shiftTo;
        this.divisionID = divisionID;
        this.productID = productID;
        this.machineSrNo = machineSrNo;
        this.expWorking = expWorking;
        this.category = category;
        this.callTypeID = callTypeID;
        this.regionID = regionID;
        this.imageUpload = imageUpload;
        this.pPRTypeID = pPRTypeID;
        this.pPRStatusID = pPRStatusID;
        this.shiptoID = shiptoID;
        this.purchaseTimelineID = purchaseTimelineID;
        this.pPRNO = pPRNO;
        this.tempAddPart = tempAddPart;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getPPRType() {
        return pPRType;
    }

    public void setPPRType(String pPRType) {
        this.pPRType = pPRType;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getPotential() {
        return potential;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGenralMeeting() {
        return genralMeeting;
    }

    public void setGenralMeeting(String genralMeeting) {
        this.genralMeeting = genralMeeting;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getHMR() {
        return hMR;
    }

    public void setHMR(String hMR) {
        this.hMR = hMR;
    }

    public String getExpectedHMR() {
        return expectedHMR;
    }

    public void setExpectedHMR(String expectedHMR) {
        this.expectedHMR = expectedHMR;
    }

    public String getHMRCategory() {
        return hMRCategory;
    }

    public void setHMRCategory(String hMRCategory) {
        this.hMRCategory = hMRCategory;
    }

    public String getAddPartDes() {
        return addPartDes;
    }

    public void setAddPartDes(String addPartDes) {
        this.addPartDes = addPartDes;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCMRID() {
        return cMRID;
    }

    public void setCMRID(String cMRID) {
        this.cMRID = cMRID;
    }

    public String getPPRID() {
        return pPRID;
    }

    public void setPPRID(String pPRID) {
        this.pPRID = pPRID;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getReqTypeID() {
        return reqTypeID;
    }

    public void setReqTypeID(String reqTypeID) {
        this.reqTypeID = reqTypeID;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPartComments() {
        return partComments;
    }

    public void setPartComments(String partComments) {
        this.partComments = partComments;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getShiftTo() {
        return shiftTo;
    }

    public void setShiftTo(String shiftTo) {
        this.shiftTo = shiftTo;
    }

    public String getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(String divisionID) {
        this.divisionID = divisionID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getMachineSrNo() {
        return machineSrNo;
    }

    public void setMachineSrNo(String machineSrNo) {
        this.machineSrNo = machineSrNo;
    }

    public String getExpWorking() {
        return expWorking;
    }

    public void setExpWorking(String expWorking) {
        this.expWorking = expWorking;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCallTypeID() {
        return callTypeID;
    }

    public void setCallTypeID(String callTypeID) {
        this.callTypeID = callTypeID;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getImageUpload() {
        return imageUpload;
    }

    public void setImageUpload(String imageUpload) {
        this.imageUpload = imageUpload;
    }

    public String getPPRTypeID() {
        return pPRTypeID;
    }

    public void setPPRTypeID(String pPRTypeID) {
        this.pPRTypeID = pPRTypeID;
    }

    public String getPPRStatusID() {
        return pPRStatusID;
    }

    public void setPPRStatusID(String pPRStatusID) {
        this.pPRStatusID = pPRStatusID;
    }

    public String getShiptoID() {
        return shiptoID;
    }

    public void setShiptoID(String shiptoID) {
        this.shiptoID = shiptoID;
    }

    public String getPurchaseTimelineID() {
        return purchaseTimelineID;
    }

    public void setPurchaseTimelineID(String purchaseTimelineID) {
        this.purchaseTimelineID = purchaseTimelineID;
    }

    public String getPPRNO() {
        return pPRNO;
    }

    public void setPPRNO(String pPRNO) {
        this.pPRNO = pPRNO;
    }

    public List<TempAddPart> getTempAddPart() {
        return tempAddPart;
    }

    public void setTempAddPart(List<TempAddPart> tempAddPart) {
        this.tempAddPart = tempAddPart;
    }

}
