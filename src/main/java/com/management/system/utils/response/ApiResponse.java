package com.management.system.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/19
 */
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ApiResponse<T> implements Serializable {


    /**
     * 响应编码：0成功；-1系统异常；
     */
    private int code;
    /**
     * 响应结果描述
     */
    private String message;
    /**
     * 业务数据
     */
    private T data;


    /*
     * 无业务数据的成功响应
     * @return
     */
    public static ApiResponse success() {
        return success(null);
    }

    public static ApiResponse success200Code() {
        ApiResponse response = new ApiResponse();
        response.setCode(ReturnCode.SUCCESS200.getCode());
        response.setMessage(ReturnCode.SUCCESS200.getMsg());
        return response;
    }

    /**
     * 带业务数据的成功响应
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResponse success(T data) {
        ApiResponse response = new ApiResponse();
        response.setCode(ReturnCode.SUCCESS.getCode());
        response.setMessage(ReturnCode.SUCCESS.getMsg());
        response.setData(data);
        return response;
    }

    public static <T> ApiResponse success200Code(T data) {
        ApiResponse response = new ApiResponse();
        response.setCode(ReturnCode.SUCCESS200.getCode());
        response.setMessage(ReturnCode.SUCCESS200.getMsg());
        response.setData(data);
        return response;
    }


    /**
     * 响应失败
     *
     * @return
     */
    public static ApiResponse fail() {
        return fail(ReturnCode.FAIL.getCode(), ReturnCode.FAIL.getMsg());
    }


    /**
     * 响应失败
     *
     * @param responseCode
     * @return
     */
    public static ApiResponse fail(ReturnCode responseCode) {
        return fail(responseCode.getCode(), responseCode.getMsg());
    }

    /**
     * 响应失败
     *
     * @param failCode
     * @param msg
     * @return
     */
    public static ApiResponse fail(int failCode, String msg, Object obj) {
        ApiResponse response = new ApiResponse();
        response.setCode(failCode);
        response.setMessage(msg);
        response.setData(obj);
        //设置响应头
        HttpServletResponse currentResponse = RequestHolder.getCurrentResponse();
        currentResponse.setStatus(getResponseStatus(failCode));
        return response;
    }

    /**
     * 响应失败
     *
     * @param failCode
     * @param msg
     * @return
     */
    public static ApiResponse fail(int failCode, String msg) {
        ApiResponse response = new ApiResponse();
        response.setCode(failCode);
        response.setMessage(msg);
        //设置响应头
        HttpServletResponse currentResponse = RequestHolder.getCurrentResponse();
        currentResponse.setStatus(getResponseStatus(failCode));
        return response;
    }

    private static Integer getResponseStatus(int failCode) {
        if (failCode == ReturnCode.FAIL.getCode() || failCode == ReturnCode.SYSTEM_ERROR.getCode()) {
            return HttpStatus.INTERNAL_SERVER_ERROR.value();
        } else if (failCode == ReturnCode.PARAMS_ERROR.getCode()) {
            return HttpStatus.BAD_REQUEST.value();
        } else if (failCode == ReturnCode.SIGN_ERROR.getCode()) {
            return HttpStatus.UNAUTHORIZED.value();
        } else {
            return HttpStatus.OK.value();
        }
    }
}
