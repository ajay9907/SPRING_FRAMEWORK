package com.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(" Sim1 ")
	Airtel atl;
	@Value("Sim2")
	JIO jio;

	public Person() {
		super();
	}

	public Person(Airtel atl, JIO jio) {
		super();
		this.atl = atl;
		this.jio = jio;
	}

	public Airtel getAtl() {
		return atl;
	}

	public void setAtl(Airtel atl) {
		this.atl = atl;
	}

	public JIO getJio() {
		return jio;
	}

	public void setJio(JIO jio) {
		this.jio = jio;
	}

}
