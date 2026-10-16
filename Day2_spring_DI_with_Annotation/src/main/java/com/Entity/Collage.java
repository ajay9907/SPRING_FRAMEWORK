package com.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Collage {
	@Value("0867")
	private int id;
	@Value("Savarkar")
	private String c_Name;

	public Collage() {
		super();

	}

	public Collage(int id, String c_Name) {
		super();
		this.id = id;
		this.c_Name = c_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	@Override
	public String toString() {
		return "Collage [id=" + id + ", c_Name=" + c_Name + "]";
	}

}
