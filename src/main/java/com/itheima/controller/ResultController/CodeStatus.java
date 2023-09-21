package com.itheima.controller.ResultController;

public enum CodeStatus {
    SAVE_OK(2001), UPDATE_OK(2011),
    DELETE_OK(2021),GET_OK(2031),
    SAVE_ERROR(2000), UPDATE_ERROR(2010),
    DELETE_ERROR(2020),GET_ERROR(2030),
    SYS_ERROR(9001), SYS_RUNTIME_ERROR(9002),
    SYS_UNKNOW_ERROR(9999);

    final int code;
    CodeStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
