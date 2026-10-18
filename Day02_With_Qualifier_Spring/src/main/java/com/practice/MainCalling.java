package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.myConfigClass;

public class MainCalling {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(myConfigClass.class);
		Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp.getUpi().payment());
		System.out.println(emp.getCard().payment());
	}
}
