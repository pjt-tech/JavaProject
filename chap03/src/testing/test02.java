package testing;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int won;
		int a , b , c , d, e;
		
		
		System.out.print("##��ȯ�� ���� ?");
		
		won = s.nextInt();
		
		a=won/500;
		won=won%500;
		b=won/100;
		won=won%100;
		c=won/50;
		won=won%50;
	    d=won/10;
	    e=won%10;
		
		
	    System.out.printf("\n�����¥��==> %d�� \n",a);
		System.out.printf("���¥��==> %d�� \n",b);
		System.out.printf("���ʿ�¥��==> %d�� \n",c);
		System.out.printf("�ʿ�¥��==> %d�� \n",d);
		System.out.printf("�ٲ��� ���� �ܵ�==> %d��\n",e);

	}

}
