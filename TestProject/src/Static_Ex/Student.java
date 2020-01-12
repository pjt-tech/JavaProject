package Static_Ex;

public class Student {
	
	private static int serialNum  = 10000;
	
	int studentId;
	String studentName;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}

	public static int getSerialNum() {
		int i  = 10;     //지역변수
		i++;
		System.out.println(i);
		
		studentName = "홍길동";   //인스턴스변수,멤버변수 사용불가
		
		return serialNum;  //static변수
	}
	
}
