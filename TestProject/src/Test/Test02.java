package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,c,d;
		int ��;
		System.out.print("###��ȯ�� ����?");
		�� = s.nextInt();
			
		a = ��/500;
		�� = ��%500;
		b = ��/100;
		�� = ��%100;
		c = ��/50;
		�� = ��%50;
		d = ��/10;
		�� = ��%10;
		System.out.println("�����¥�� ==>" + a+"��");
		System.out.println("���¥�� ==>" + b+"��");
		System.out.println("���ʿ�¥�� ==>" + c+"��");
		System.out.println("���ʿ�¥�� ==>" + d+"��");
		System.out.println("�ٲ��������ܵ� ==>" + �� +"��");
	}
}	
