package method_overradding;

public class HankookTire extends Tire {
	
	
	public HankookTire(int maxRotaion, String location) {
		super(maxRotaion,location);
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotaion) {
			System.out.println(location+"HankookTire ���� : " + (maxRotaion-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***" +location+"HankookTire ��ũ ***");
			return false;
		}
	
	}
	
}
