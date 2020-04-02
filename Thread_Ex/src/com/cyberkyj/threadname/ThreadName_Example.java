package com.cyberkyj.threadname;

public class ThreadName_Example {

	public static void main(String[] args) {
		
		Thread currentThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+currentThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : "+threadA.getName());
		threadA.start();

		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : "+threadB.getName());
		threadB.start();
	}

}
