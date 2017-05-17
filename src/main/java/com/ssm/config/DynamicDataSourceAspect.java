package com.ssm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 切换数据源Advice
 * @author 
 * @create 2017年5月15日
 */
@Aspect
@Order(0)	//保证该AOP在@Transaction之前执行
@Component
public class DynamicDataSourceAspect {
	private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);
	
	@Before("@annotation(ds)")
	public void changeDataSource(JoinPoint point, TargetDataSource ds) throws Throwable {
		//获取当前的指定的数据源;
		String dsId = ds.name();
		//如果不在我们注入的所有的数据源范围之内，那么输出警告信息，系统自动使用默认的数据源。
	    if (DynamicDataSourceContextHolder.containsDataSource(dsId)) {
	    	logger.debug("Use DataSource : {} > {}", ds.name(), point.getSignature());
	    	DynamicDataSourceContextHolder.setDataSourceType(ds.name());
	    } else {
	    	logger.error("数据源[{}]不存在，使用默认数据源 > {}", ds.name(), point.getSignature());
	    }
	}
	
	@After("@annotation(ds)")
	public void restoreDataSource(JoinPoint point, TargetDataSource ds) {
	    logger.debug("Revert DataSource : {} > {}", ds.name(), point.getSignature());
	    DynamicDataSourceContextHolder.clearDataSourceType();
	}

}
