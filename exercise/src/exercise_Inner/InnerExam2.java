package exercise_Inner;

//Ŭ���� ������ ���� Ŭ����
public class InnerExam2 {
	
	static class Cal{
		int value = 0;
		
		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {
		InnerExam2.Cal in = new InnerExam2.Cal();
		in.plus();
		System.out.println(in.value);
		
	}

}
