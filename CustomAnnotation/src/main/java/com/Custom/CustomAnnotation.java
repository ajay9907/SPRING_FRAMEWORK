package com.Custom;

public class CustomAnnotation {
	public @interface MyAnnotation {
	}

	public void show() {
		System.out.println("It is an Custom Annotation.");
	}

	public static void main(String[] args) {
		CustomAnnotation ca = new CustomAnnotation();
		ca.show();
	}
}
