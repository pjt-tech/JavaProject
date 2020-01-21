package method_overradding;

public class kumhoTire extends Tire {

	public kumhoTire(int maxRotaion, String location) {
		super(maxRotaion,location);
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotaion) {
			System.out.println(location+"kumhoTire ¼ö¸í : " + (maxRotaion-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***" +location+"kumhoTire ÆãÅ© ***");
			return false;
		}
	
	}
	
	

}
