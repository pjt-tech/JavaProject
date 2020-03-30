package Lamda;

public class CalculatorDemo {

	public static void main(String[] args) {
		calAndShow((a,b) -> a+b,3,4);
		calAndShow((a,b) -> a+b,3.5,4.5);
		calAndShow((a,b) -> a-b,3,4);
		calAndShow((a,b) -> a-b,3.5,4.5);
		
	}
	
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1,n2);
		System.out.println(r);
	}

}
