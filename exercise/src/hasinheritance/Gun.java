package hasinheritance;

public class Gun {
	
	int bullet;
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	
	public void shut() {
		System.out.println("BBANG!");
		bullet--;
	}

}
