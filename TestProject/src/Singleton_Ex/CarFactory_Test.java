package Singleton_Ex;

import java.util.Calendar;

public class CarFactory_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getIncetance();
		Singleton s2 = Singleton.getIncetance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	}

}
