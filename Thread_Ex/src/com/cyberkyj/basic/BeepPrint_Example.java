package com.cyberkyj.basic;

import java.awt.*;

public class BeepPrint_Example {

	public static void main(String[] args) {
		
		BeepPrint beepThread = new BeepPrint();
		//beepThread.start();
		
		//Thread thread = new Thread(beepThread); 
		//thread.start();
		
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
