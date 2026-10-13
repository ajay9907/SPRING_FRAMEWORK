package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Course;
import com.entity.Student;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Student std = context.getBean(Student.class);

		Course course = context.getBean(Course.class);

		System.out.println(std);
		System.out.println(course);

	}

}
