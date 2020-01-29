package exercise_object05;

class Animal{
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	void sound() {
		
	}
	void disp() {
		
	}
}

class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name,age);
	}

	void sound() {
		System.out.println("�۸�");
	}
	
	void disp() {
		System.out.println("�̸� :" + name);
		System.out.println("���� : " + age);
	}
	
}

class Cat extends Animal{
	
	
	
	public Cat(String name, int age) {
		super(name,age);
	}
	
	void sound() {
		System.out.println("�߿�");
		
	}
	
	void disp() {
		System.out.println("�̸� :" + name);
		System.out.println("���� : " + age);
	}
}



public class Ex02 {

	public static void main(String[] args) {
		
		Animal an = new Dog("����",7);
		an.disp();
		an.sound();
		an = new Cat("�̹�",4);
		an.disp();
		an.sound();
	}

}
