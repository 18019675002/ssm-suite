package com.shark.ssm.test.staticproxy;

import java.util.Calendar;

/**
 * 客户类调用此工厂方法获得代理对象。
 * 对客户类来说，其并不知道返回的是代理类对象还是委托类对象。
 * @author wj
 *
 */
public class PersonStaticProxyFactory {
	public static Person getInstance(){
		Person person = new Student();
		Person studentProxy = new PersonProxy(person);
		return studentProxy;
	}
}
