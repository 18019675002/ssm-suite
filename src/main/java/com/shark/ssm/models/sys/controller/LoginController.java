package com.shark.ssm.models.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午11:55:38
 * @version 1.0
 * @since  
 */
@Controller
@RequestMapping(value="/system")
public class LoginController {

	@RequestMapping(name="/loginPage")
	public String loginPage(){
		return "sys/login";
	}
}
