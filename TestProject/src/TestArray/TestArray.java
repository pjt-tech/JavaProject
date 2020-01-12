package TestArray;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int [9][9];
		for(int i=0; i<9; i++)
			for(int j=0; j<9; j++)
				array[i][j] = (i+1)*(j+1);
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("%2dX%d=%2d",j+1,i+1,array[i][j]);
			}
		System.out.printf("\n");
				
		}
		
		
	}

}
