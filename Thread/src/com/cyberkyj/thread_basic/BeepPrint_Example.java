package com.cyberkyj.thread_basic;

public class BeepPrint_Example {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+mainThread.getName());
		
		//BeepPrint thread = new BeepPrint();
		Thread thread = new Thread(new BeepPrint_Runnable());
		thread.setName("Ʈ���̽�");	
		System.out.println("�������� �������� �̸�: "+thread.getName());
		thread.start();
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
