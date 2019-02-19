package com.NSSFDataModel;

import javax.validation.constraints.NotNull;

public class InvalidParam {
    @NotNull
    public String param; //required. attribute's name encoded as a JSON Pointer
    public String reason; //human-readable reason

    public String getParam() {
        return param;
    }
    public void setParam(String param) {
        this.param = param;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}
