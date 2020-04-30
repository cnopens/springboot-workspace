package com.jimzhang.plan.enums;

public enum PayTypeEnum {
    DENG_E_BEN_XI(1,"等额本息"),
    DENG_E_BEN_JIN(2,"等额本金"),
    AN_YUE_FU_XI_DAO_QI_HUAN_BEN(3,"按月付息到期还本"),
    DAO_QI_HUAN_BEN_FU_XI(4,"到期还本付息"),
    GU_DING_RI_HUAN_BEN_FU_XI(5,"固定日回款本息"),
    GU_DING_RI_HUAN_XI_DAO_QI_HUAN_BEN(6,"固定日还息，到期还本")

    ;

    private int code;

    private String desc;

    PayTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
