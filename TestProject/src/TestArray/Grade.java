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
		System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		System.out.println("--------------------------------------------");
		System.out.print("����>");
	    select = s.nextInt();
		switch(select){
		case 1 : 
			System.out.print("�л��� >");
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
				
			
			System.out.println("�ְ����� : "+ max);
			System.out.println("������� : "+sum/scores.length);
			break;
		case 5 :
			close = false;
		}
		
	   }
		System.out.println("���α׷�����");
	}
	
}
