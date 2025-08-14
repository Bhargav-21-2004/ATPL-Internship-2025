package com.example.mvcflow.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoggingInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) {
		System.out.println("preHandle: incoming reuest URl=" + request.getRequestURL());
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) {
		if(modelAndView != null) {
			System.out.println("postHandle: ModelAndView="+ modelAndView);
		}
		else {
			System.out.println("PostHandle: no ModelAndView");
		}
	}
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception e) {
		System.out.println("After Completion:"+response.getStatus());
		if(e!=null) {
			System.out.println("Exception:"+ e.getMessage());
		}
	}

}
