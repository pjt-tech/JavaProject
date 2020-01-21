package method_overradding;

public class HankookTire extends Tire {
	
	
	public HankookTire(int maxRotaion, String location) {
		super(maxRotaion,location);
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotaion) {
			System.out.println(location+"HankookTire ¼ö¸í : " + (maxRotaion-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***" +location+"HankookTire ÆãÅ© ***");
			return false;
		}
	
	}
	
}
