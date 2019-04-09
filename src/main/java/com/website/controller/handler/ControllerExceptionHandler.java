package com.website.controller.handler;

import com.website.controller.exceptions.AuthBizException;
import com.website.controller.exceptions.ExceptionMessage;
import com.website.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yujingyang on 2019/4/8.
 */
@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public Result handleBizException(Exception ex) {
        logger.error("===========Controller Error========={}", ex.getMessage());
        String msg = ex instanceof RuntimeException ? ex.getMessage() : ExceptionMessage.EX_SYS;
        if (ex instanceof AuthBizException) {
            return Result.builder().data(Result.FORBIDDEN, msg).failedFalse(ex.getMessage()).build();
        }
        return Result.builder().data(Result.FAILED, msg).failedFalse(ex.getMessage()).build();
    }


}
