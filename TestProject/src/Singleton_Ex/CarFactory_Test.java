package Singleton_Ex;

import java.util.Calendar;

public class CarFactory_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Singleton s1 = Singleton.getIncetance();
	Singleton s2 = Singleton.getIncetance();
		
		System.out.println("mySonata : "+ s1.getIncetance().carNum);
		System.out.println("yourSonata : "+ s2.getIncetance().carNum);
		
		
		
	}
	
	public void tt() {
		System.out.println("test");
	}

}
