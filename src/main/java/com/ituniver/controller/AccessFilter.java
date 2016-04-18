package com.ituniver.controller;

import com.ituniver.service.WeatherProvider;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class AccessFilter implements Filter {
    private String weather;

    public void init(FilterConfig filterConfig) throws ServletException {
        //weather = new WeatherProvider().getWeather();

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        req.setAttribute("weather", weather);

        System.out.println("Got request from " + req.getRemoteAddr()
                + ". Path: " + req.getServletPath()
                + ". Method: " + req.getMethod());

        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
