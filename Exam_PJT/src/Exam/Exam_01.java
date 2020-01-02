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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			balance = s.nextInt();
			 
			switch(balance) {
			case 1 : 
				System.out.print("예금액>");
				y = s.nextInt();
				sum+=y;	
				break;
			case 2	:
				System.out.print("출금액>");
				c = s.nextInt();
				sum-=c;
				break;
			case 3 :
				System.out.println("잔고>"+sum);
			    break;
			case 4 :
			    run=false;
			    break;
			}	
			
			System.out.println("프로그램 종료");
		}

	}
}