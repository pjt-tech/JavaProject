package com.cyberkyj.join;

public class Join_Example {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch(Exception e) {
			
		}
		System.out.println("1-100±îÁö ÇÕ : "+sumThread.getSum() );

	}

}
