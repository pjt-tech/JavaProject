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
		int i  = 10;     //��������
		i++;
		System.out.println(i);
		
		studentName = "ȫ�浿";   //�ν��Ͻ�����,������� ���Ұ�
		
		return serialNum;  //static����
	}
	
}
