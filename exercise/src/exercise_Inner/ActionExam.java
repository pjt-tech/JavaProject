package exercise_Inner;

public class ActionExam {

	public static void main(String[] args) {
		//Action action = new MyAction();
		//action.exec();
		//익명클래스
		//한번만 쓰고 말것 굳이 상속받는 클래스를 만들지 않을경우 사용
		Action action = new Action() {
			
			public void exec() {
				System.out.println("exec");
			}
		};
		
		action.exec();
	}

}
