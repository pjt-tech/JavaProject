package exercise_object04;

public class BUS {
	int busNumber;
	int passengerCount;
	int money;
	
	//������ü
	public BUS(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println("����"+busNumber + "���� �°���" + passengerCount+ "���̰�,������"+money+"�Դϴ�.");
	}

}
