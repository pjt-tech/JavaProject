package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,c,d;
		int µ·;
		System.out.print("###±³È¯ÇÒ µ·Àº?");
		µ· = s.nextInt();
			
		a = µ·/500;
		µ· = µ·%500;
		b = µ·/100;
		µ· = µ·%100;
		c = µ·/50;
		µ· = µ·%50;
		d = µ·/10;
		µ· = µ·%10;
		System.out.println("¿À¹é¿øÂ¥¸® ==>" + a+"°³");
		System.out.println("¹é¿øÂ¥¸® ==>" + b+"°³");
		System.out.println("¿À½Ê¿øÂ¥¸® ==>" + c+"°³");
		System.out.println("¿À½Ê¿øÂ¥¸® ==>" + d+"°³");
		System.out.println("¹Ù²ÙÁö¸øÇÑÀÜµ· ==>" + µ· +"¿ø");
	}
}	
