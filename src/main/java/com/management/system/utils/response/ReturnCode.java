package com.management.system.utils.response;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/19
 */
public enum ReturnCode {

    /**
     * 请求成功
     */
    SUCCESS(0, "SUCCESS"),
    SUCCESS200(200, "成功"),
    /**
     * 请求失败
     */
    FAIL(-1, "ERROR"),
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
    SYSTEM_ERROR(4, "系统异常"),
    /**
     * 省统一登录认证失败
     */
    STY_LOGIN_ERROR(5, "省统一登录认证失败"),

    TOKEN_MISSING_ERROR(1000, "缺少access_token参数"),
    LOGIN_ERROR(1001, "认证失败"),
    PARAM_ERROR(1002, "缺少查询参数"),
    DATA_EMPTY_ERROR(1003, "上报对象为空"),
    DATA_PARAM_ERROR(1004, "上报对象不允许空属性没有赋值"),
    SOURCE_NOT_EXIST_ERROR(1005, "查询资源不存在"),
    SESSION_TIME_OUT(1006, "会话超时"),
    SYSTEM_FLAG_OUT(1007, "系统标识错误"),
    /**
     * 字典查询错误
     */
    DICT_SEARCH_ERROR(100001, "系统不存在此字典"),
    /**
     * 查询组织机构出错
     */
    ORG_SEARCH_ERROR(100002, "查询组织机构出错，请联系管理员"),

    DATA_OBJECT_EMPTY_ERROR(100010, "数据对象为空"),
    DATA_PARAM_EMPTY_ERROR(100011, "数据对象非空属性没有赋值"),
    FORBIDDEN_ERROR(403, "用户未登录");


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
