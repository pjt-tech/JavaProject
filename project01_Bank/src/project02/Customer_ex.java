package project02;

import java.util.Scanner;

public class Customer_ex {
	
	public static void main (String[] args) {
	
	int choice;	
	
	CustomerHandler ch = new CustomerHandler(10);
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.���� | 2.�������� | 3.�⺻���� | 4.ȸ������ | 5.���� |");
		System.out.println("-----------------------------------------------------------");
		System.out.print("���񽺸� �����ϼ��� : ");
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
			System.out.println("���α׷� ����");
			return;
			}
		}
	}
}
