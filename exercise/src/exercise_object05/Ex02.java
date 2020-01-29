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
		System.out.println("멍멍");
	}
	
	void disp() {
		System.out.println("이름 :" + name);
		System.out.println("나이 : " + age);
	}
	
}

class Cat extends Animal{
	
	
	
	public Cat(String name, int age) {
		super(name,age);
	}
	
	void sound() {
		System.out.println("야옹");
		
	}
	
	void disp() {
		System.out.println("이름 :" + name);
		System.out.println("나이 : " + age);
	}
}



public class Ex02 {

	public static void main(String[] args) {
		
		Animal an = new Dog("루피",7);
		an.disp();
		an.sound();
		an = new Cat("미미",4);
		an.disp();
		an.sound();
	}

}
