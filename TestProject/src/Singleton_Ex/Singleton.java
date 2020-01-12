package Singleton_Ex;

public class Singleton {
	
	private static Singleton Factory = new Singleton();

	private Singleton() {
		System.out.println("½Ì±ÛÅæ °´Ã¼°¡ »ý¼ºµÇ¾ú½À´Ï´Ù.");
	}
	
	public static Singleton getIncetance() {
		return Factory;
	}
	
}
