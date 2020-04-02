package com.cyberkyj.join;

public class SumThread extends Thread {
	
	long sum;

	@Override
	public void run() {
		for(int i=1; i<=1000000000; i++) {
			sum+=i;
		}
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	
	
	

}
