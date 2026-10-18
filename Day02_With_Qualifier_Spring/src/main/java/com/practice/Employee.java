package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	@Qualifier("upi")

	UPI upi;

	@Autowired
	@Qualifier("card")

	Card card;

	public UPI getUpi() {
		return upi;
	}

	public void setUpi(UPI upi) {
		this.upi = upi;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
