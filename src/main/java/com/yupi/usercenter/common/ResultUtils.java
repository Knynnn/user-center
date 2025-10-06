package com.yupi.usercenter.common;

/**
 * 返回工具类
 *
 * @author knyn
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @param message
     * @param decription
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String decription) {
        return new BaseResponse(errorCode.getCode(), null, message, decription);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @param decription
     * @return
     */
    public static BaseResponse error(int code, String message, String decription) {
        return new BaseResponse(code, null, message, decription);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @param decription
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String decription) {
        return new BaseResponse(errorCode.getCode(), null, errorCode.getMessage(), decription);
    }
}
