package Singleton_Ex;

public class CarFactory_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getIncetance();
		
		System.out.println(s1.getCarnum());
		System.out.println(s1.getCarnum());
	}

}
