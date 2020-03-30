package HashMap_Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Hash_Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1001,"홍길동","010-9999-9876","hong@mail.com"));
		list.add(new Student(1002,"아무개","010-8888-8765","anony@mail.com"));
		list.add(new Student(1003,"김무상","010-7777-7654","kim@mail.com"));
		
		System.out.print("학번을 입력하세요 : " );
		num = s.nextInt();
		
		
	
	}

}
