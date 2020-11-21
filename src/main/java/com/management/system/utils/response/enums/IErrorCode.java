package com.management.system.utils.response.enums;

/**
 * @author：xiexiaolong.
 * @date: 2020/11/21
 */
public interface IErrorCode {
    /**
     * 获取异常码
     *
     * @return
     */
    Integer getCode();

    /**
     * 获取异常描述
     *
     * @return
     */
    String getMsg();
}
