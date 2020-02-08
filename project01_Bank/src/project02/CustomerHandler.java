package project02;

import java.util.Scanner;

public class CustomerHandler {
	
	private Bank[] bankCoustomer;
	String name,bankName,accountNum;
	private static int numOfIndex = 0;
	int money;
	public CustomerHandler(int num) {
		bankCoustomer = new Bank[num];
	}
	
	public void addBankCoustomer(Bank customer) {
		bankCoustomer[numOfIndex++] = customer;
	}
	
	public void addCoustomer(int choice) {
		Scanner s = new Scanner(System.in);
		System.out.print("이름 :");
		name = s.nextLine();
		System.out.print("계좌번호 :");
		accountNum = s.nextLine();
		System.out.print("은행명 :");
		bankName = s.nextLine();
		System.out.print("금액 :");
		money = s.nextInt();
		if(choice==1) {
			addBankCoustomer(new Nh(name,bankName,accountNum,money));
		}else {
			addBankCoustomer(new Sh(name,bankName,accountNum,money));
		}
		System.out.println("입력완료 !");
	}
	
	public void allData() {
		for(int i = 0; i < numOfIndex; i++) {
			bankCoustomer[i].showInfo();
			System.out.println("---------------------------");

		}
		
	}
	public void basicData() {
		for(int i = 0; i < numOfIndex; i++) {
			bankCoustomer[i].showBasicInfo();
			System.out.println("---------------------------");

		}
		
	}

}
