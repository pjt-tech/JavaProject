package com.cyberkyj.thread_basic;

import java.awt.*;

public class BeepPrint_Anonymous_Ex {

	public static void main(String[] args) {
	
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
