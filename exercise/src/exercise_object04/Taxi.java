package exercise_object04;

public class Taxi {
	int TaxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int TaxiNumber) {
		this.TaxiNumber = TaxiNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("�ý�"+TaxiNumber + "���� �°���" + passengerCount+ "���̰�,������"+money+"�Դϴ�.");
	}

}
