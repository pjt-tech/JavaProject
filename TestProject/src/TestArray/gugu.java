package TestArray;

public class gugu {
	public static void main(String[] args) {
		int[][] gugu = new int[9][9];
		for(int i = 0; i<9; i++)
			for(int j = 0; j<9; j++)
				gugu[i][j] = (i+1)*(j+1);
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				System.out.printf("%2dX%d=%2d",j+1,i+1,gugu[i][j]);				
			}
			System.out.printf("\n");
			
		}
	}
}
