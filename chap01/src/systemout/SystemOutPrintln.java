package systemout;
import javax.swing.*;

public class SystemOutPrintln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(7);
		System.out.println(3.15);
		System.out.println("3+5="+8);
		System.out.println("3.15"+ "는 실수입니다.");
		System.out.println("3+5"+"의 연산결과는 8입니다.");
		System.out.println(3+5); 
		
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num1+ "+" +num2+ "=" +num3);
		int decimal = 12;
		int hexadecimal = 0xc;
		int octet = 014;
		int binary = 0B1100;
		
		System.out.println(decimal);
		System.out.println(hexadecimal);
		System.out.println(octet);
		System.out.println(binary);
		
		char ch1 = 'A';
		char ch2 = 'B';
		char tab = '\t';
		
		System.out.println("A"+ tab +"B");
		System.out.println(3>4);
		
		
		
	
		
		
	}	

}