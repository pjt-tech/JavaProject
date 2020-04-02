package com.cyberkyj.basic;

import java.awt.*;

//public class BeepPrint extends Thread{
public class BeepPrint implements Runnable{

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
