
package com.copiacs.retrofitpost.PostMaster.Lifafa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TempAddPart {

    @SerializedName("PPRID")
    @Expose
    private String pPRID;
    @SerializedName("ItemNo")
    @Expose
    private String itemNo;
    @SerializedName("ItemID")
    @Expose
    private String itemID;
    @SerializedName("ModelID")
    @Expose
    private String modelID;
    @SerializedName("Quantity")
    @Expose
    private String quantity;

    public TempAddPart(String pPRID, String itemNo, String itemID, String modelID, String quantity) {
        this.pPRID = pPRID;
        this.itemNo = itemNo;
        this.itemID = itemID;
        this.modelID = modelID;
        this.quantity = quantity;
    }

    public String getPPRID() {
        return pPRID;
    }

    public void setPPRID(String pPRID) {
        this.pPRID = pPRID;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
