package exercise_Inner;

//지역 클래스 
public class InnerExam3 {
	
	public void exec() {
		class Cal{
			int value = 0;
			
			public void plus() {
				value++;		
				
			}	
			
		}
		
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

	public static void main(String[] args) {
		InnerExam3 in = new InnerExam3();
		in.exec();
		

	}

}
