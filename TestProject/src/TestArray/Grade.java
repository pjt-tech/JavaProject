package TestArray;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int select = 0, number; 
		int[] scores = new int[select];
		boolean close = true;
		int max = 0;
		while(close==true) {
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택>");
	    select = s.nextInt();
		switch(select){
		case 1 : 
			System.out.print("학생수 >");
			select = s.nextInt();
			scores = new int[select];
			break;
		case 2 :
			for(int i =0; i<scores.length; i++) {
			System.out.print("scores"+"["+i+"]"+">");
			scores[i] = s.nextInt();
			}
			break;
		case 3 :
				for(int i =0; i<scores.length; i++) 
				{ 
			System.out.println("scores"+"["+i+"]" +":"+scores[i]);
				}
				break;
		case 4 : 
				int sum = 0;
				for(int j=0; j<scores.length; j++) {
					sum += scores[j];
					if(max < scores[j]) 
						max = scores[j];			
					}
				
			
			System.out.println("최고점수 : "+ max);
			System.out.println("평균점수 : "+sum/scores.length);
			break;
		case 5 :
			close = false;
		}
		
	   }
		System.out.println("프로그램종료");
	}
	
}
