package grade;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guk,en,su;
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("국어 성적은 ? ");
		guk = s.nextInt();
		System.out.print("영어 성적은 ? ");
		en = s.nextInt();
		System.out.print("수학 성적은 ? ");
		su = s.nextInt();
		
		sum = guk+en+su;
		if(sum>=180) {
			System.out.println("합격입니다.");
			if(guk>40) {
				sum += guk;
			}else if(en>40) {
				sum += en;
			}else if(su>40){
				sum += su;
			}else {
				System.out.println("과락입니다.");
			}
		
		}else{
			System.out.println("불합격입니다.");
		}
	}
	
}


