package project02;

public class Bank {
	
	String name,bankName,accountNum;
	
	
	
	public Bank(String name,String bankName,String num) {	
		this.name = name;
		this.bankName = bankName;
		this.accountNum = num;
		
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("은행명 : " + bankName);
		System.out.println("계좌번호 : " + accountNum);
	}
	
	public void showBasicInfo() {
		
	}
	

}
