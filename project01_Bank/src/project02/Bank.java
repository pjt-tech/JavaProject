package project02;

public class Bank {
	
	String name,bankName,accountNum;
	
	
	
	public Bank(String name,String bankName,String num) {	
		this.name = name;
		this.bankName = bankName;
		this.accountNum = num;
		
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("����� : " + bankName);
		System.out.println("���¹�ȣ : " + accountNum);
	}
	
	public void showBasicInfo() {
		
	}
	

}
