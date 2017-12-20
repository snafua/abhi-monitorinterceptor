package com.abhi.work.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.abhi.work.monitor.interceptor.MonitorInterceptor;

@Configuration
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {
	
	@Autowired
	MonitorInterceptor monitorInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(monitorInterceptor).addPathPatterns("/xyz/**");
		
	}

}
