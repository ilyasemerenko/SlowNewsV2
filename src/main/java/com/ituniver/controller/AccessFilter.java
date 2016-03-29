package com.ituniver.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class AccessFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        System.out.println("Got request from " + req.getRemoteAddr()
                + ". Path: " + req.getServletPath()
                + ". Method: " + req.getMethod());

        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
