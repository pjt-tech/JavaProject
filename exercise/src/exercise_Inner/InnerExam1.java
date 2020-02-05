package exercise_Inner;

//클래스 내부의 클래스 
public class InnerExam1 {
	
	class Cal{
		int value = 0;
		
		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {
		InnerExam1 in = new InnerExam1();
		InnerExam1.Cal cal = in.new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
