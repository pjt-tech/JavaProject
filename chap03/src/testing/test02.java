package testing;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int won;
		int a , b , c , d, e;
		
		
		System.out.print("##교환할 돈은 ?");
		
		won = s.nextInt();
		
		a=won/500;
		won=won%500;
		b=won/100;
		won=won%100;
		c=won/50;
		won=won%50;
	    d=won/10;
	    e=won%10;
		
		
	    System.out.printf("\n오백원짜리==> %d개 \n",a);
		System.out.printf("백원짜리==> %d개 \n",b);
		System.out.printf("오십원짜리==> %d개 \n",c);
		System.out.printf("십원짜리==> %d개 \n",d);
		System.out.printf("바꾸지 못한 잔돈==> %d개\n",e);

	}

}
