package com.abhi.work.monitor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MonitorInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request,HttpServletResponse response , Object handler) {
		return true;
		
	}
	
	public void postHandle(HttpServletRequest request,HttpServletResponse response , Object handler,
			ModelAndView modelAndView) {
		
		
	}
}
