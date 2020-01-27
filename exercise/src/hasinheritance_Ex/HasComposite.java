package hasinheritance_Ex;

public class HasComposite {

	public static void main(String[] args) {
		Police haveGun = new Police(5,3);
		haveGun.shut();
		haveGun.putHandcuff();
		
		Police dontHaveGun=new Police(0,5);
		dontHaveGun.shut();
		dontHaveGun.putHandcuff();
	}

}
