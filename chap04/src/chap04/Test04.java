package chap04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int num1,num2=0;
		while(true) {
		
		num1 = (int)(Math.random()*6)+1;
		num2 = (int)(Math.random()*6)+1;
		
		System.out.println("("+num1+","+num2+")");
		
		if(num1+num2==5)
			
			break;
				
		 }		
		
	 }
}


