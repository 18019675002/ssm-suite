package com.shark.ssm.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在service层方法上使用，用于指定使用哪个数据源 @TargetDataSource(name="ds1")
 * @author   
 * @create	2017年5月15日
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
	String name();// default TargetDataSource.master;;
	
	//public static String master = "dataSource1";
	//public static String slave1 = "dataSource2";
}
