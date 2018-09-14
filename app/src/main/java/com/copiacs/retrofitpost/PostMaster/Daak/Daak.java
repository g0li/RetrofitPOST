package com.copiacs.retrofitpost.PostMaster.Daak;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Daak {

    @SerializedName("Success")
    @Expose
    private Boolean success;
    @SerializedName("Result")
    @Expose
    private Result result;
    @SerializedName("StatusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("ErrorMessage")
    @Expose
    private Object errorMessage;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }



    public class Result {

        @SerializedName("PPRID")
        @Expose
        private Integer pPRID;
        @SerializedName("MobileStatus")
        @Expose
        private Integer mobileStatus;
        @SerializedName("list")
        @Expose
        private Object list;

        public Integer getPPRID() {
            return pPRID;
        }

        public void setPPRID(Integer pPRID) {
            this.pPRID = pPRID;
        }

        public Integer getMobileStatus() {
            return mobileStatus;
        }

        public void setMobileStatus(Integer mobileStatus) {
            this.mobileStatus = mobileStatus;
        }

        public Object getList() {
            return list;
        }

        public void setList(Object list) {
            this.list = list;
        }

    }

}
