package com.Configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.Entity.Employee;

//@Configuration
public class myConfigClass {

	@Bean("emp")
	@Scope("prototype")
	public Employee objEmp() {
		return new Employee();

	}
}