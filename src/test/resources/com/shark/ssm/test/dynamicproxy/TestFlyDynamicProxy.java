package com.shark.ssm.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class TestFlyDynamicProxy {

	@Test
	public void testFly(){
		final Fly fly = new Bird();
		Fly proxy = (Fly) Proxy.newProxyInstance(fly.getClass().getClassLoader(), fly.getClass().getInterfaces(), 
				new InvocationHandler(){

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 拦截gotofly方法
						if(method.getName().equals("gotoFly")){
							System.out.println("代理类实现小鸟飞翔");
						}
						return method.invoke(proxy, args);
					}
			
			
			
		});
		// 3 调用代理对象业务方法
		proxy.gotoFly();
		
		
	}
	
}
