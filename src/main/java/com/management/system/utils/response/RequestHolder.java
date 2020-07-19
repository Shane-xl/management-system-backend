package com.management.system.utils.response;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/19
 */
public class RequestHolder {
    /**
     * 获取当前请求
     *
     * @return
     */
    public static HttpServletRequest getCurrentRequest() {
        return ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
    }

    /**
     * 获取当前线程响应
     *
     * @return
     */
    public static HttpServletResponse getCurrentResponse() {
        return ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getResponse();
    }


    /**
     * 获取当前请求用户ID
     *
     * @return
     */
    public static String getUidRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        return (String) request.getAttribute("uid");
    }
}
