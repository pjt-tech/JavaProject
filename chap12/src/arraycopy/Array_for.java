package arraycopy;

public class Array_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(String e : args) {
			int a = Integer.parseInt(e);
			System.out.print(a);
		}
		/*
int[][] gugu = new int[9][9];
		
		for(int i=0; i<9; i++)
			for(int k=0; k<9; k++) 
				gugu[i][k]=(i+1)*(k+1);
	
		for(int i=0; i<9; i++) {
			for(int k=0; k<9; k++) {
				System.out.printf("%dX%d=%2d  ",k+1,i+1,gugu[i][k]);
			
			}
			System.out.printf("\n");
		 
	}
	*/
	}
}