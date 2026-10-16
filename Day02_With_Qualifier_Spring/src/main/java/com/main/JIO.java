package com.main;

import org.springframework.stereotype.Component;

@Component("jio")
public class JIO implements SimCard {
	@Override

	public void calling() {
		System.out.println("Calling on Airtel...");

	}

}
