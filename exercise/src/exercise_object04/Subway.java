package exercise_object04;

public class Subway {
	String subwayNumber;
	int passengerCount;
	int money;
	
	
	//����ö��ü
	public Subway(String subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö"+subwayNumber + "�� �°���" + passengerCount+ "���̰�,������"+money+"�Դϴ�.");
	}

}

