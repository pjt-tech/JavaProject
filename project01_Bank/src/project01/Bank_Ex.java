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
		System.out.print("����� ID�� �Է� �ϼ��� : ");
		id = s.next();
		while(exit) {
		System.out.println("--------------------------------------------");
		System.out.println(" | 1.���� | 2.��� | 3.�����ܾ� | 4.ȸ������ | 5.����");
		System.out.println("--------------------------------------------");
		System.out.print("�ʿ��� ���񽺸� �����ϼ��� : ");
		num = s.nextInt();
		
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(id,money));
		
		
		switch(num){
			case 1 : 
				System.out.print("���� �ݾ��� �Է��ϼ��� : ");
				de = s.nextInt();
				Person.getMoney();
				money += de;
				break;
			case 2 :
				System.out.print("��� �ݾ��� �Է��ϼ��� : ");
				dr = s.nextInt();
				Person.getMoney();
				money -= dr;
				break;
			case 3 :
				System.out.print("����� ID�� �Է��ϼ��� : ");
				id = s.next();
				Person.getName();
				if(Person.name.equals(id)) {
				System.out.println("�����ܾ� : " + Person.money);
				break;
				}else {
					System.out.println("���̵� �߸��Է��߽��ϴ�.");
				}
				break;
			case 4	: 
				System.out.print("���� ID�� �Է��ϼ��� : ");
				id = s.next();
				money = 0;
				break;
			case 5	:
				System.out.println("����");
				exit = false;
				break;
			
			default : 
				System.out.println("���� ��ȣ�� �߸� �Է��Ͽ����ϴ�.");
				break;
				
			}
		}
	}
}
