package filed.decoration;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public int modify_Speed(int number) {
		
		speed = number;
		return speed;
	}
}
