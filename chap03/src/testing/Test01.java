package testing;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int time;
		int hour,min,sec;
		
		System.out.print("## 계산할 초는?");
		time = s.nextInt();
		hour = time / (60*60);  //1시간 = 1분(60초)*60
		time = time % (60*60);
		min = time/60;
		sec = time%60;
		
		System.out.printf("\n시간은 ==> %d 시간 \n", hour);
		System.out.printf("분은 ==> %d 분 \n", min);
		System.out.printf("초는 ==> %d 초 \n", sec);
		
	
	}
	
}
