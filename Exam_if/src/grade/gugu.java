package grade;

import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=0;
		System.out.print("¸î´Ü ?");
		i = s.nextInt();
		
		for(int j = 1; j<10; j++) {
		System.out.printf("%dX%d=%d \n",i,j,i*j);			
		}
	}
}
