package chap04;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		out:
		while (true) {
			System.out.printf("����� ù��° ���� �Է� : ");
			a = s.nextInt();
			System.out.printf("����� �ι�° ���� �Է� : ");
			b = s.nextInt();
			String ch = s.nextLine();
			System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
			ch = s.nextLine();
			
			switch(ch)
			{
			case"+" :
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case"-" :
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case"*" :
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case"/" :
				System.out.println(a+"/"+b+"="+(a/b));
				break;
			case"%" :
				System.out.println(a+"%"+b+"="+(a%b));
				break;
			default :
				System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
				
			}
			break out;
		}
		
		

	}

}
