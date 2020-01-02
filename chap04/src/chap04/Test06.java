package chap04;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		out:
		while (true) {
			System.out.printf("계산할 첫번째 수를 입력 : ");
			a = s.nextInt();
			System.out.printf("계산할 두번째 수를 입력 : ");
			b = s.nextInt();
			String ch = s.nextLine();
			System.out.printf("계산할 연산자를 입력하세요 : ");
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
				System.out.println("연산자를 잘못 입력하셨습니다.");
				
			}
			break out;
		}
		
		

	}

}
