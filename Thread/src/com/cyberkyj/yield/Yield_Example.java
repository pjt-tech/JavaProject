package com.cyberkyj.yield;

public class Yield_Example {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {}
		threadA.work=false;
		threadB.work=true;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {}
		threadA.work=true;
		threadB.work=false;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {}
		
		threadA.stop=true;
		threadB.stop=true;
		

	}

}
