package com.Custom;

import com.Custom.MyAnnotation.Myannotation;

@Myannotation
public class MyAnnotation {

	public @interface Myannotation {

	}

	public void display() {
		System.out.println("Custom Annotation Example");
	}

	public static void main(String[] args) {
		MyAnnotation obj = new MyAnnotation();
		obj.display();
	}
}