package hasinheritance_Ex;

public class Police {
	
	int handcuffs;
	Gun pistol;
	
	public Police(int bnum, int bcuff) {
		handcuffs = bcuff;
		if(bnum!=0) {
			pistol = new Gun(bnum);
		}else {
			pistol = null;
		}
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shut() {
		if(pistol==null) {
			System.out.println("Hut BAANG !");
		}else {
			pistol.shut();
		}
	}
}
