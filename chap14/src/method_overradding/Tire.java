package method_overradding;

public class Tire {
	
	public int maxRotaion;
	public int accumulatedRotation = 0;
	public String location; 
	
	public Tire(int maxRotaion, String location) {
		this.maxRotaion = maxRotaion;
		this.location = location;
	}
	
	public boolean roll()
	{
		++accumulatedRotation;
		if(accumulatedRotation<maxRotaion) {
			System.out.println(location+"Tire ¼ö¸í : " + (maxRotaion-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***" +location+"Tire ÆãÅ© ***");
			return false;
		}
	}
}
