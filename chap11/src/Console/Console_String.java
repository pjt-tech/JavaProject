package Console;

import java.util.Scanner;

public class Console_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		String str1;
		String str2 = new String();
		
		System.out.print("문자열 1을 입력 : " );
		str = s.nextLine();
		System.out.print("문자열 2을 입력 : ");
		str1 = s.nextLine();
		str2 = str.concat(" ").concat(str1);
		
		System.out.println("합쳐진 문자열 ==> " + str2);
		System.out.println("문자열 1 길이 ==> " + str.length());
		System.out.println("문자열 2 길이 ==> " + str1.length());
		
		if(str.equals(str1)) {
			System.out.println("두 문자열은 같다.");
		}else {
			System.out.println("두 문자열은 다르다.");
		}
			
		}
		
		
		

	}


