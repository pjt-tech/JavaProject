package exercise_object06;

class S{
	public String x() {
		return "s"; //메소드오버라이딩
	}
}

class SS extends S{
	public String x() {
		return "ss"; //메소드오버라이딩
	}
	public String y() {
		return "ss";
	}
}
class SSS extends S{
	public String x() {
		return "sss"; //메소드오버라이딩
	}
}
public class A {

	public static void main(String[] args) {
		S s = new SS(); //S의 행색을하고있는 SS
		s.x();
		System.out.println(s.x()); //오버라이딩을 통하여 우선순위가 높은 자신의 메소드를 호출함
		s = new SSS();
		System.out.println(s.x());
	}

}
