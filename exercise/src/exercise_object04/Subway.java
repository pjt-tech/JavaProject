package exercise_object04;

public class Subway {
	String subwayNumber;
	int passengerCount;
	int money;
	
	
	//ÁöÇÏÃ¶°´Ã¼
	public Subway(String subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶"+subwayNumber + "ÀÇ ½Â°´Àº" + passengerCount+ "¸íÀÌ°í,¼öÀÔÀº"+money+"ÀÔ´Ï´Ù.");
	}

}

