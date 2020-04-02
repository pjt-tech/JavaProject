package com.cyberkyj.thread_lambda;

public class Thread_lambda_Example {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			
			for(int i=0; i<20; i++) {
				if(i%2==0) {
					System.out.print(i+" ");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
				}
			}
			
		};
		
		Runnable task2 = () -> {
			
			for(int i=0; i<20; i++) {
				if(i%2==1) {
					System.out.print(i+" ");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
				}
			}
			
		};

		
		Thread th1 = new Thread(task1);
		Thread th2 = new Thread(task2);
		
		th1.start();
		th2.start();
	}

}











