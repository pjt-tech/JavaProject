package project02;

public class Nh extends Bank{	
	int money = 0;
	
	public Nh(String name,String bankName,String num,int money) {
		super(name,bankName,num);
		this.money = money;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("현재잔액 : " + money);
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("은행명 : " + bankName);
		
	}
	
}
