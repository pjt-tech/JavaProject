package Hash;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "(" + age + "¼¼)";
	}
	
	@Override
	public boolean equals(Object arg0) {

		if(arg0 instanceof Person) {
			Person student = (Person)arg0;
			return (age==student.age)&&(name.equals(student.name));
		}else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		
		return age+name.hashCode();
		
	}
}
