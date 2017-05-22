package com.shark.ssm.models.sys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午9:39:05
 * @version 1.0
 * @since  
 */
public class SystemInfoInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("SystemInfoInterceptor    afterCompletion");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
		//System.out.println("SystemInfoInterceptor    postHandle");
	
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		//arg0.setAttribute("systemInterceptorInfo", "我是来自SystemInterceptor设置进来的数据");
		//System.out.println("SystemInfoInterceptor    preHandle");
		return true;
	}

}
