package main.designPatterns.strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;

	public PaypalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
		List<Integer> x = new ArrayList();
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
