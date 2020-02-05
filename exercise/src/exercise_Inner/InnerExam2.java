package exercise_Inner;

//클래스 내부의 정적 클래스
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
