package Singleton_Ex;

public class Singleton {
	
	private static Singleton Factory = new Singleton();
	static int carNum = 10000;
	
	private Singleton() {
		
	}
	
	public static Singleton getIncetance() {
		carNum++;
		return Factory;
		
		
	}
	
}
