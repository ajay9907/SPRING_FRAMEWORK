package com.main;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements SimCard {

	public void calling() {
		System.out.println("Callin on Airtel ");

	}

}
