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
//@RequestMapping(value="/")
public class IndexController {
	
	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		System.out.println("index跑了");
		return "/index";
	}
}
