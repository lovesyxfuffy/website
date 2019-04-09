package com.website.controller.exceptions;

/**
 * Created by wangfeng23 on 2017/07/24.
 */
public class BizPermissionException extends BizException {

    public BizPermissionException(){
        super();
    }

    public BizPermissionException(String errorCode, String errorMessage){
        super(errorCode, errorMessage);
    }

    public BizPermissionException(String errorMessage){
        super(errorMessage);
    }

}
