package casting;

public class Child_Example {

	public static void main(String[] args) {
		Parent parent = new child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data1";
		child child = (child)parent;
		
		child.field2 = "data2";
		child.method2();
		child.method3();
		
		
	}

}
