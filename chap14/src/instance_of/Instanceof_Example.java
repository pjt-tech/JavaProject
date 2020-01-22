package instance_of;

public class Instanceof_Example {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		method1(parent);
		method2(parent);
		
		Parent parent1 = new Parent();
		method1(parent1);
		//method2(parent1); 예외발생
		
	}
	
	
	public static void method1(Parent parent) {
		
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println ("method1 - child 변환성공");
		}else {
			System.out.println ("method1 - child 변환실패");
		}
		
	}
	public static void method2(Parent parent) {
			Child child = (Child)parent;
			System.out.println ("method1 - child 변환성공");
		
	}

}
