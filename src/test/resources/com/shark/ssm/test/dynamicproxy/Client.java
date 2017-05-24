package com.shark.ssm.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Fly fly = new Bird();
		Fly proxy = (Fly) Proxy.newProxyInstance(fly.getClass().getClassLoader(), fly.getClass().getInterfaces(), 
				new InvocationHandler(){

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 拦截gotofly方法
						if(method.getName().equals("gotoFly")){
							System.out.println("代理类实现小鸟飞翔");
							return null;
						}
						// 如果不想拦截
						return method.invoke(fly, args);
					}
			
			
			
		});
		// 3 调用代理对象业务方法
		proxy.gotoFly();
	}

}
