package com.website.controller.Interceptors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by yujingyang on 2019/4/9.
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains("/front") || uri.equals("/manage/account/login"))
            return true;
        else {
            HttpSession session = request.getSession();
            Boolean loginFlag = (Boolean) session.getAttribute("loginFlag");
            if (loginFlag == null) {
                response.setStatus(HttpStatus.FORBIDDEN.value());
                return false;
            }
            return true;
        }
    }
}
