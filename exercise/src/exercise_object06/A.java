package exercise_object06;

class S{
	public String x() {
		return "s";
	}
}

class SS extends S{
	public String y() {
		return "ss";
	}
}


public class A {

	public static void main(String[] args) {
		S s = new SS();
		s.x();
		
	}

}
