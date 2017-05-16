package com.ssm.controllers;

import org.springframework.stereotype.Controller;
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
	public String page(){
		return "index";
	}
	

}
