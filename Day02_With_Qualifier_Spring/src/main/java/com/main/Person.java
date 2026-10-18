package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier("airtel")
	Airtel airtel;
	@Autowired
	@Qualifier("jio")
	JIO jio;

	public Person() {
		super();
	}

	public Person(Airtel atl, JIO jio) {
		super();
		this.airtel = atl;
		this.jio = jio;
	}

	public Airtel getAtl() {
		return airtel;
	}

	public void setAtl(Airtel atl) {
		this.airtel = atl;
	}

	public JIO getJio() {
		return jio;
	}

	public void setJio(JIO jio) {
		this.jio = jio;
	}

}
