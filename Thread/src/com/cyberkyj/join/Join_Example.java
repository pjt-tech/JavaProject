package com.cyberkyj.join;

public class Join_Example {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("1-100까지의 합 : "+sumThread.getSum());

	}

}
