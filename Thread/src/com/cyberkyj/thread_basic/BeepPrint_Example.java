package com.cyberkyj.thread_basic;

public class BeepPrint_Example {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+mainThread.getName());
		
		//BeepPrint thread = new BeepPrint();
		Thread thread = new Thread(new BeepPrint_Runnable());
		thread.setName("트와이스");	
		System.out.println("독립적인 스레드의 이름: "+thread.getName());
		thread.start();
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
