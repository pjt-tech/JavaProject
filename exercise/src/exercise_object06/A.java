package exercise_object06;

class S{
	public String x() {
		return "s"; //�޼ҵ�������̵�
	}
}

class SS extends S{
	public String x() {
		return "ss"; //�޼ҵ�������̵�
	}
	public String y() {
		return "ss";
	}
}
class SSS extends S{
	public String x() {
		return "sss"; //�޼ҵ�������̵�
	}
}
public class A {

	public static void main(String[] args) {
		S s = new SS(); //S�� ������ϰ��ִ� SS
		s.x();
		System.out.println(s.x()); //�������̵��� ���Ͽ� �켱������ ���� �ڽ��� �޼ҵ带 ȣ����
		s = new SSS();
		System.out.println(s.x());
	}

}
