package grade;

import java.util.Scanner;

public class gugu_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
		int i;
		System.out.print("¸î´Ü ?");
		i = s.nextInt();
		System.out.println(i+"´Ü");
		int j = 1;
		boolean gugu = true;
		while(gugu) 
		{
			if(j<10) 
			{
			System.out.printf("%dX%d=%d \n",i,j,i*j);
			}
			else 
			{
			gugu = false;
			}
			j++;
		}
	}
}

}
	


