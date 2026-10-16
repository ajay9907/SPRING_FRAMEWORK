package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.myConfigClass;
import com.Entity.Student;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(myConfigClass.class);
		Student std1 = context.getBean(Student.class);
		System.out.println(std1);

	}
}
