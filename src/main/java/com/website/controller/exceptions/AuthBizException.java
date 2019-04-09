package com.website.controller.exceptions;

/**
 * TODO 后期权限异常应该使用这个异常
 */
public class AuthBizException extends RuntimeException {

    private final String errorCode;

    private String errorMessage;

    public AuthBizException(String errorMessage) {
        super(errorMessage);
        // 权限错误，errorCode就一定是403
        errorCode = "403";
        this.errorMessage = errorMessage;
    }

    public AuthBizException() {
        super("权限错误");
        errorCode = "403";
        this.errorMessage = "权限错误";
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
