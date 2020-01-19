package exercise_object04;

public class Student {
	String studentName;
	int grade,money;
	
	public Student(String Name,int money) {
		this.studentName = Name;
		this.money = money;
		
	}
	public void takeBus(BUS bus) {
		bus.take(1000);
		this.money-=1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "¥‘¿« ≥≤¿∫ µ∑¿∫" + money + "¿‘¥œ¥Ÿ.");
	}
}
