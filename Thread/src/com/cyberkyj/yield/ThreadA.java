package com.cyberkyj.yield;

public class ThreadA extends Thread {

	boolean stop = false;
	boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾�����");
			}else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadA ����");
	}
	
	
	
}
