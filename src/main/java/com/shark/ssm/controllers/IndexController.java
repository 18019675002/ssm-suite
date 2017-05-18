package com.shark.ssm.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月11日 上午12:16:22
 * @version 1.0
 * @since  
 */
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String page(HttpServletRequest req, HttpServletResponse res, ModelMap model){
		Object info = req.getAttribute("systemInterceptorInfo").toString();
		String systemInterceptorInfo = "";
		if(info!=null)
		systemInterceptorInfo = info.toString(); 
		System.out.println(systemInterceptorInfo);
		return "index";
	}
	

}
