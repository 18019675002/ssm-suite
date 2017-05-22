package com.shark.ssm.models.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月22日 下午11:12:14
 * @version 1.0
 * @since  
 */
@Controller
@RequestMapping("/system/login")
public class SysLoginController {
	
	@RequestMapping("/loginPage")
	public String loginPage(){
		System.out.println("test1  ----  test11");
		return "sys/login";
	}
	
}
