package Exam;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int y,c; int sum = 0;
		Scanner s = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����>");
			balance = s.nextInt();
			 
			switch(balance) {
			case 1 : 
				System.out.print("���ݾ�>");
				y = s.nextInt();
				sum+=y;	
				break;
			case 2	:
				System.out.print("��ݾ�>");
				c = s.nextInt();
				sum-=c;
				break;
			case 3 :
				System.out.println("�ܰ�>"+sum);
			    break;
			case 4 :
			    run=false;
			    break;
			}	
			
			System.out.println("���α׷� ����");
		}

	}
}