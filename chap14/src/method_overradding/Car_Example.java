package method_overradding;

public class Car_Example {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1 :
				System.out.println("앞왼쪽 Hankook Tire로 교체");
				car.frontLeftTire = new HankookTire(15,"앞왼쪽");
				break;
				
				case 2 :
					System.out.println("앞오른쪽 kumho Tire로 교체");
					car.frontRightTire = new kumhoTire(13,"앞오른쪽");
					break;
				case 3 :
					System.out.println("뒤왼쪽 Hankook Tire로 교체");
					car.backLeftTire = new HankookTire(17,"뒤왼쪽");
					break;
				case 4 :
					System.out.println("뒤오른쪽 kumho Tire로 교체");
					car.backRightTire = new kumhoTire(14,"뒤오른쪽");
					break;
			}
			System.out.println("------------------------------");
		}
		
	}

}
