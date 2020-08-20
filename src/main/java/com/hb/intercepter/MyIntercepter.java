package com.hb.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author hb
 * @create 2020-06-17 10:10
 */
public class MyIntercepter implements HandlerInterceptor {
    @Override
    //目标请求执行前执行 用于预处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String uri = request.getRequestURI();
        if (uri.indexOf("tools")>0) {
            HttpSession session = request.getSession();
            String name = (String) session.getAttribute("name");
            if (name!=null) {
                return true;
            }else {
                session.setAttribute("status","请您先登录");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                return false;
            }
        }else {

            return true;
        }
        //返回值表示 请求会不会被拦截
    }

}
