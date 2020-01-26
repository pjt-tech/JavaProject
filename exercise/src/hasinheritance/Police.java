package hasinheritance;

public class Police extends Gun{
	
	int handcuffs;
	
	public Police(int bnum,int bcuff) {
		super(bnum);
		handcuffs=bcuff;
	}
	public void putHandcuff() {
		
		System.out.println("SNAP!");
		bullet--;	
		
	}

}
