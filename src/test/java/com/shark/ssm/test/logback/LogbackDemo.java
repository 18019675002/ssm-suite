package com.shark.ssm.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月25日 上午12:01:48
 * @version 1.0
 * @since  
 */
public class LogbackDemo {
	private static Logger log = LoggerFactory.getLogger(LogbackDemo.class); 
	public static void main(String[] args) {
		log.trace("======== trace 所有");
		log.debug("======== debug 调试");
		log.info("======info 信息");  
        log.warn("======warn 警告"); 
		log.error("======== error 错误");
	}
}

