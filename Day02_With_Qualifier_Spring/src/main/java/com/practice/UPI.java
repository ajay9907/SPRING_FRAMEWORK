package com.practice;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPI implements PaymentMethod {
	@Override
	public String payment() {
		return " payment functionality provides through UPI";
	}

}
