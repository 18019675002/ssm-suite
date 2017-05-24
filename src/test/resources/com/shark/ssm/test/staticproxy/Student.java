package com.shark.ssm.test.staticproxy;

/**
 * 真正执行任务的类，实现了代理接口。
 * @author wj
 *
 */
public class Student implements Person {

	@Override
	public void study(String personName) {
		// TODO Auto-generated method stub
		System.out.println(personName + "student study Hard");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
