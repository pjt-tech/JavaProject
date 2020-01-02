package chap04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int num1,num2;
		char ch;
		System.out.print("첫번째 수를 입력하세요 :");
		num1 = s.nextInt();
		System.out.print("계산할 연산자를 입력하세요 :");
		ch = s.next().charAt(0);
		System.out.print("두번째 수를 입력하세요:");
		num2 = s.nextInt();
		
		
		if(ch=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		else if(ch=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		else if(ch=='/')
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		else if(ch=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		else if(ch=='%')
			System.out.println(num1+"%"+num2+"="+(num1%num2));
		else
			System.out.println("연산자를 잘못 입력했습니다.");
		
		int i=1,dan;
		String st;
		
		System.out.printf("구구단\n");
		 st = s.nextLine();
		 
		 for(i=1; i<=9;i++) {
			
			 for(dan=2; dan<=9; dan++){
			 System.out.printf("%3d X %d = %2d",dan,i,dan*i);
			  }
			System.out.printf("\n");
			
		 }
	}

}