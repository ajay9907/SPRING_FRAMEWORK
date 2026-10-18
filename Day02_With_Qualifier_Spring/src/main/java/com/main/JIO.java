package com.main;

import org.springframework.stereotype.Component;

@Component("jio")
public class JIO implements SimCard {
	@Override

	public String calling() {
		return "Calling on jio...";

	}

}
