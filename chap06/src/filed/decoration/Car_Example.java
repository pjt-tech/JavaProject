package filed.decoration;

public class Car_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색 :  " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		int current_Speed = myCar.modify_Speed(90);
		System.out.println("수정된 현재 속도 : " + current_Speed+"Km입니다.");

	}

}
