package project02;

public class Sh extends Bank{	
	int money = 0;
	
	public Sh(String name,String bankName,String num,int money) {
		super(name,bankName,num);
		this.money = money;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�����ܾ� : " + money);
	}
	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("����� : " + bankName);
	}
	
}

