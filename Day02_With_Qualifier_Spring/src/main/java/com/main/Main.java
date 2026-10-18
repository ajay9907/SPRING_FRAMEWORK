package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(myConfigClass.class);
		Person per = context.getBean(Person.class);
		System.out.println(per.getAtl().calling());
		System.out.println(per.getJio().calling());

	}

}
