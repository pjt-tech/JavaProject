package testing;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int time;
		int hour,min,sec;
		
		System.out.print("## ����� �ʴ�?");
		time = s.nextInt();
		hour = time / (60*60);  //1�ð� = 1��(60��)*60
		time = time % (60*60);
		min = time/60;
		sec = time%60;
		
		System.out.printf("\n�ð��� ==> %d �ð� \n", hour);
		System.out.printf("���� ==> %d �� \n", min);
		System.out.printf("�ʴ� ==> %d �� \n", sec);
		
	
	}
	
}
