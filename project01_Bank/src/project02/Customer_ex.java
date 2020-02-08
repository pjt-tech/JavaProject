package project02;

import java.util.Scanner;

public class Customer_ex {
	
	public static void main (String[] args) {
	
	int choice;	
	
	CustomerHandler ch = new CustomerHandler(10);
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.농협 | 2.신한은행 | 3.기본정보 | 4.회원정보 | 5.종료 |");
		System.out.println("-----------------------------------------------------------");
		System.out.print("서비스를 선택하세요 : ");
		choice = s.nextInt();
		
		switch(choice) {
		case 1: case 2: 
			ch.addCoustomer(choice);
			break;
		case 3: 
			ch.basicData();
			break;
		case 4:
			ch.allData();
			break;
		case 5:
			System.out.println("프로그램 종료");
			return;
			}
		}
	}
}
