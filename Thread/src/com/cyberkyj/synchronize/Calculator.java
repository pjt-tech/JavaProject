package com.cyberkyj.synchronize;

public class Calculator {
	
	int memory;

	public int getMemory() {
		return memory;
	}

	//public void setMemory(int memory) {
	  public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}
	
	
	

}
