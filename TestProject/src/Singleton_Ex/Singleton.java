package Singleton_Ex;

public class Singleton {
	
	private static Singleton Factory = new Singleton();
	
	static int carNum = 10000;
	int carId;
	
	private Singleton() {
		System.out.println("�̱��� ��ü�� �����Ǿ����ϴ�.");
	}
	
	public static Singleton getIncetance() {
		return Factory;
	}
	
	
	public int getCarnum() {
		carId = carNum;
		carId++;
		return carId;
	}
}
