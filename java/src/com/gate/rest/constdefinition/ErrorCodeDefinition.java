package com.gate.rest.constdefinition;

public enum ErrorCodeDefinition {
    RETURN_OK("RETURN_SUCCESS", 0),
    RETURN_ERR("RETURN_FAILED", -1),
    UNKNOWN_ERR("UNKNOWN", -2);

    private String errinfo;
    private int errcode;

    ErrorCodeDefinition(String errinfo, int errcode) {
        this.errinfo = errinfo;
        this.errcode = errcode;
    }

    public String getErrinfoWithErrcode(int errcode) {
        for (ErrorCodeDefinition o : ErrorCodeDefinition.values()) {
            if (o.errcode == errcode) {
                return o.errinfo;
            }
        }

        return this.UNKNOWN_ERR.errinfo;
    }

    public int getErrCodeWithErrinfo(String errinfo) {
        for (ErrorCodeDefinition o : ErrorCodeDefinition.values()) {
            if (o.errinfo.compareToIgnoreCase(errinfo) == 0) {
                return o.errcode;
            }
        }

        return this.UNKNOWN_ERR.errcode;
    }

    public String getErrinfo() {
        return errinfo;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public void setErrinfo(String errinfo) {
        this.errinfo = errinfo;
    }
}
