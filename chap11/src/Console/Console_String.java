package Console;

import java.util.Scanner;

public class Console_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		String str1;
		String str2 = new String();
		
		System.out.print("���ڿ� 1�� �Է� : " );
		str = s.nextLine();
		System.out.print("���ڿ� 2�� �Է� : ");
		str1 = s.nextLine();
		str2 = str.concat(" ").concat(str1);
		
		System.out.println("������ ���ڿ� ==> " + str2);
		System.out.println("���ڿ� 1 ���� ==> " + str.length());
		System.out.println("���ڿ� 2 ���� ==> " + str1.length());
		
		if(str.equals(str1)) {
			System.out.println("�� ���ڿ��� ����.");
		}else {
			System.out.println("�� ���ڿ��� �ٸ���.");
		}
			
		}
		
		
		

	}


