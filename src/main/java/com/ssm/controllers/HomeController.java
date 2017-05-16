package com.ssm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月10日 下午10:39:52
 * @version 1.0
 * @since  
 */
@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(){
		System.out.println("typmeleaf index跑了");
		return "tindex";
	}
}
