package method_overradding;

public class Car_Example {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1 :
				System.out.println("�տ��� Hankook Tire�� ��ü");
				car.frontLeftTire = new HankookTire(15,"�տ���");
				break;
				
				case 2 :
					System.out.println("�տ����� kumho Tire�� ��ü");
					car.frontRightTire = new kumhoTire(13,"�տ�����");
					break;
				case 3 :
					System.out.println("�ڿ��� Hankook Tire�� ��ü");
					car.backLeftTire = new HankookTire(17,"�ڿ���");
					break;
				case 4 :
					System.out.println("�ڿ����� kumho Tire�� ��ü");
					car.backRightTire = new kumhoTire(14,"�ڿ�����");
					break;
			}
			System.out.println("------------------------------");
		}
		
	}

}