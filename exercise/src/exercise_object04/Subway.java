package exercise_object04;

public class Subway {
	String subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(String subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철"+subwayNumber + "의 승객은" + passengerCount+ "명이고,수입은"+money+"입니다.");
	}

}

