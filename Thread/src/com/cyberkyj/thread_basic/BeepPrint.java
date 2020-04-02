package com.cyberkyj.thread_basic;

import java.awt.*;

public class BeepPrint extends Thread {

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
	
	

}
