package package1;

public class A {
	
	public int field1;
	int field2;
	private int field3;
	protected int field4;
	
	public A(){
		field1=1;
		field2=1;
		field3=1;
		field4=1;
		
		method1();
		method2();
		method3();
		
		
	}
	
	public int getfield() {
		return field3;
	}
	
	public void setfield(int num) {
		this.field3 = num;
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}

}
