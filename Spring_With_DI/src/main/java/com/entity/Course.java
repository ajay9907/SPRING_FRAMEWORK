package com.entity;

public class Course {

	private int c_Id;
	private String c_Name;
	private double price;

	public Course() {

		super();
	}

	public Course(int c_Id, String c_Name, double price) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		this.price = price;
	}

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [c_Id=" + c_Id + ", c_Name=" + c_Name + ", price=" + price + "]";
	}

}
