package com.cyberkyj.yield;

public class ThreadB extends Thread {

	boolean stop = false;
	boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업내용");
			}else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadB 종료");
	}
	
	
	
}
