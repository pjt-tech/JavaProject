package grade;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guk,en,su;
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ ? ");
		guk = s.nextInt();
		System.out.print("���� ������ ? ");
		en = s.nextInt();
		System.out.print("���� ������ ? ");
		su = s.nextInt();
		
		sum = guk+en+su;
		if(sum>=180) {
			System.out.println("�հ��Դϴ�.");
			if(guk>40) {
				sum += guk;
			}else if(en>40) {
				sum += en;
			}else if(su>40){
				sum += su;
			}else {
				System.out.println("�����Դϴ�.");
			}
		
		}else{
			System.out.println("���հ��Դϴ�.");
		}
	}
	
}


