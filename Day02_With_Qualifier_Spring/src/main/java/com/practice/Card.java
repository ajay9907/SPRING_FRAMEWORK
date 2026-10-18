package com.practice;

import org.springframework.stereotype.Component;

@Component("card")
public class Card implements PaymentMethod {
@Override
	public String payment() {
		return "Payment Functionality Provides through Card";
	}
}
