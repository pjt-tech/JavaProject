
public class Shallow_Deep_Copy {

	public static void main(String[] args) {
		
			
		Rectangle rec = new Rectangle(1,1,9,9);
		Rectangle cpy;
		
		try {
			cpy=(Rectangle)rec.clone();
			cpy.changePos(2, 2, 7, 7);
			rec.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
