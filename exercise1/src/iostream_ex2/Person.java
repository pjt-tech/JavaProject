package iostream_ex2;

import java.io.Serializable;

public class Person implements Serializable {
	
	String name;
	transient int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;	
	}
	
	public String toString() {
		return "이름 : " + name +", 나이 : " + age;
	}
}
