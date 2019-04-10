package com.website.controller.Interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by yujingyang on 2019/4/9.
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains("/front"))
            return true;
        else {
            HttpSession session = request.getSession();
            String loginFlag = (String) session.getAttribute("loginFlag");
            if (loginFlag == null) {
                response.sendRedirect("/api/views/login");
                return false;
            }
            return true;
        }
    }
}
