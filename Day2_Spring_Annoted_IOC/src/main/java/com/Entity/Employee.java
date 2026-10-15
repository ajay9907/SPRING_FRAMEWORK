package com.Entity;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("2020")
	private int id;
	@Value("Sangram")
	private String name;
	@Value("22")
	private int age;
	@Value("BEED")
	private String city;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
