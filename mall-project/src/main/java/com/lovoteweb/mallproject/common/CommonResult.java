package com.lovoteweb.mallproject.common;

import lombok.Data;

@Data
public class CommonResult<T> {
    private Long code;
    private String message;
    private T data;

    public CommonResult(Long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @return
     *
     * @param data 获取的数据
     */

    public static <T> CommonResult<Object> success(T data){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * 成功返回结果
     *
     * @Param data 获取的数据
     * @param message 提示信息
     */
    public static <T> CommonResult<T> success(T data,String message){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),message,data);
    }


    /**
     * 失败返回结果
     * @param errorCode 错误码
     */

    public static <T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * 失败返回结果
     * @param iErrorCode
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(IErrorCode iErrorCode, String message){
        return new CommonResult<>(iErrorCode.getCode(),message,null);
    }

    /**
     * 失败返回结果
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<>(ResultCode.FAILED.getCode(),message,null);
    }

    /**
     *
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> unauthorized(String message){
        return new CommonResult<>(ResultCode.UNAUTHORIZED.getCode(),message,null);
    }

    /**
     *
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> forbidden(String message){
        return new CommonResult<>(ResultCode.FORBIDDEN.getCode(),message,null);
    }
}
