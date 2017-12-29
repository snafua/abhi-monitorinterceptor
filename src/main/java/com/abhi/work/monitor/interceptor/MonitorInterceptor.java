package com.abhi.work.monitor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MonitorInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	StoreActionMapper mapper;
	

	public boolean preHandle(HttpServletRequest request,HttpServletResponse response , Object handler) {
		StoreActionType actionType = mapper.getStoreActionType(request.getMethod() , (k,v) -> mapper.getRequestURI(request).matches(k));
		if(actionType != null) {
			
		}
		return true;
		
	}
	
	public void postHandle(HttpServletRequest request,HttpServletResponse response , Object handler,
			ModelAndView modelAndView) {
		
		StoreActionType actionType = mapper.getStoreActionType(request.getMethod() , (k,v) -> mapper.getRequestURI(request).matches(k));
		String action="";
		String acionDescription;
		if(actionType != null) {
			action = actionType.getActionType();
			/*if(response.) {
				
			}*/
		}
		
	}
}
