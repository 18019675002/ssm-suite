package com.shark.ssm.test.staticproxy;

import java.lang.reflect.Constructor;
import java.util.Calendar;

public class PersonProxy implements Person {

	private Person student;
	
	public PersonProxy(Person student){
		this.student = student;
		
	}
	
	@Override
	public void study(String personName) {
		// TODO Auto-generated method stub
		long time = Calendar.getInstance().getTimeInMillis();
		System.out.println("time1 = " + time);
		student.study(personName);
		time = Calendar.getInstance().getTimeInMillis();
		System.out.println("time2 = " + time);
		System.out.println(personName + "study hard, day day up!");
	}

}
