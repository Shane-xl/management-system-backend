package com.management.system.utils.response;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/19
 */
public enum ReturnCode {

    /**
     * 请求成功
     */
    SUCCESS(200, "SUCCESS"),
    /**
     * 请求失败
     */
    FAIL(1, "ERROR"),
    /**
     * 参数不合法
     */
    PARAMS_ERROR(2, "参数不合法"),
    /**
     * 验证失败
     */
    SIGN_ERROR(3, "验证失败"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR(4, "系统异常");

    private final Integer code;
    private final String msg;


    ReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }
}
