package com.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
//@Scope("prototype")
public class Student {

	@Value("1010")
	private int id;

	@Value("Varad")
	private String name;

	@Value("Limbaganesh")
	private String addr;

	@Value("8765432187")
	private String phNo;

	@Autowired
	Collage clg;

	public Student() {
		super();

	}

	public Student(int id, String name, String addr, String phNo, Collage clg) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phNo = phNo;
		this.clg = clg;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public Collage getClg() {
		return clg;
	}

	public void setClg(Collage clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + ", phNo=" + phNo + ", clg=" + clg + "]";
	}

}
