package com.main;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements SimCard {

	public String calling() {
		return "Calling on Airtel ";

	}

}
