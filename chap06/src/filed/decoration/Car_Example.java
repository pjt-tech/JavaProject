package filed.decoration;

public class Car_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("�� :  " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		int current_Speed = myCar.modify_Speed(90);
		System.out.println("������ ���� �ӵ� : " + current_Speed+"Km�Դϴ�.");

	}

}
