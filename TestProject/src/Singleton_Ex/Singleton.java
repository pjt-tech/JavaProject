package Singleton_Ex;

public class Singleton {
	
	private static Singleton Factory = new Singleton();

	private Singleton() {
		System.out.println("�̱��� ��ü�� �����Ǿ����ϴ�.");
	}
	
	public static Singleton getIncetance() {
		return Factory;
	}
	
}
