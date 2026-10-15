package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configure.myConfigClass;
import com.Entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(myConfigClass.class);
		Employee e = context.getBean("emp", Employee.class);

		System.out.println(e);

	}

}