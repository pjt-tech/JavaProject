
public class Point implements Cloneable{
	
	int xPos;
	int yPos;
	public Point(int xPos, int yPos) {
		
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]",xPos, yPos);
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
				
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	

}
