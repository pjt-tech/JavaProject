package com.cyberkyj.synchronize;

public class User1 extends Thread {
	Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("USER1");
		this.calculator=calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
	

}
