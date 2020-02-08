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
		System.out.print("�̸� :");
		name = s.nextLine();
		System.out.print("���¹�ȣ :");
		accountNum = s.nextLine();
		System.out.print("����� :");
		bankName = s.nextLine();
		System.out.print("�ݾ� :");
		money = s.nextInt();
		if(choice==1) {
			addBankCoustomer(new Nh(name,bankName,accountNum,money));
		}else {
			addBankCoustomer(new Sh(name,bankName,accountNum,money));
		}
		System.out.println("�Է¿Ϸ� !");
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
