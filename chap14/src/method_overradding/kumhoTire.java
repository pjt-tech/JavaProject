package method_overradding;

public class kumhoTire extends Tire {

	public kumhoTire(int maxRotaion, String location) {
		super(maxRotaion,location);
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotaion) {
			System.out.println(location+"kumhoTire ���� : " + (maxRotaion-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***" +location+"kumhoTire ��ũ ***");
			return false;
		}
	
	}
	
	

}
