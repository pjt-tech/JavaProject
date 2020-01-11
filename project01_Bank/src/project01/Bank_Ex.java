package project01;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,de,dr;
		int money = 0;
		boolean exit = true;
		String id;
		Scanner s = new Scanner(System.in);
		System.out.print("사용자 ID를 입력 하세요 : ");
		id = s.next();
		while(exit) {
		System.out.println("--------------------------------------------");
		System.out.println(" | 1.예금 | 2.출금 | 3.현재잔액 | 4.회원변경 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("필요한 서비스를 선택하세요 : ");
		num = s.nextInt();
		
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(id,money));
		
		
		switch(num){
			case 1 : 
				System.out.print("예금 금액을 입력하세요 : ");
				de = s.nextInt();
				Person.getMoney();
				money += de;
				break;
			case 2 :
				System.out.print("출금 금액을 입력하세요 : ");
				dr = s.nextInt();
				Person.getMoney();
				money -= dr;
				break;
			case 3 :
				System.out.print("사용자 ID를 입력하세요 : ");
				id = s.next();
				Person.getName();
				if(Person.name.equals(id)) {
				System.out.println("현재잔액 : " + Person.money);
				break;
				}else {
					System.out.println("아이디를 잘못입력했습니다.");
				}
				break;
			case 4	: 
				System.out.print("변경 ID를 입력하세요 : ");
				id = s.next();
				money = 0;
				break;
			case 5	:
				System.out.println("종료");
				exit = false;
				break;
			
			default : 
				System.out.println("서비스 번호를 잘못 입력하였습니다.");
				break;
				
			}
		}
	}
}
