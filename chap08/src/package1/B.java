package package1;

public class B {
	public B( ) {
		A a =  new A();
		a.field1=2;
		a.field2=2;
		//a.field3=1;   private접근불가
		a.setfield(3);
		int num = a.getfield();
		
		a.method1();
		a.method2();
		//a.method3();  접근불가
	}

}
