package exercise_object05;

class Up{
	int a = 7;
	String name = "ȫ�浿";	
	
	public Up() {
		
	}
	
	public Up(int a) {
		this.a = a;
		System.out.println("UpŬ����");
		
	}
}

class Lo extends Up{
	int a = 5;
	int b = 17;
	public Lo() {
		super(5);
		System.out.println("LoŬ����");
	}
	
}

public class EX01 {

	public static void main(String[] args) {
		Lo u = new Lo();
		
	}

}
