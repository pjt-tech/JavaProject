package method_overradding;

public class Car {
	
	Tire frontLeftTire = new Tire(6,"�տ���");
	Tire frontRightTire = new Tire(2,"�տ�����");
	Tire backLeftTire = new Tire(3,"�ڿ���");
	Tire backRightTire = new Tire(4,"�ڿ�����");
	
	int run(){
		
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}else if(frontRightTire.roll()==false){
			stop();
			return 2;
		}
		else if(backLeftTire.roll()==false){
			stop();
			return 3;
		}else if(backRightTire.roll()==false){
			stop();
			return 4;
		}
		return 0;
	}
	
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
