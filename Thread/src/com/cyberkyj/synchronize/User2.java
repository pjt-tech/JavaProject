package com.cyberkyj.synchronize;

public class User2 extends Thread {
	Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("USER2");
		this.calculator=calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
	

}
