package project01;

public class Person {
	static String name;
	static int money;
	
	public Person(String name,int money) {
		this.name = name;
		this.money = money;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
