package com.mabf.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mabf
 * @create 2020-06-05 0:35
 */
public class UserFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(UserFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("开始过滤请求");
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        Object user = httpServletRequest.getSession().getAttribute("user");
        if(user!= null){
            chain.doFilter(request,response);
        }else{

        }


    }

    @Override
    public void destroy() {
        logger.info("过滤完请求");
    }
}
