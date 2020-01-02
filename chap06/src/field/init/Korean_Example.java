package field.init;

public class Korean_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korean k1 = new Korean("박자바","920203");
		System.out.println("k1의 이름"+k1.getName());
		System.out.println("k1의 주민번호"+k1.getSsn());
		
		Korean k2 = new Korean("김자바","920203");
		System.out.println("k2의 이름"+k2.getName());
		System.out.println("k2의 주민번호"+k2.getSsn());
	}

}
