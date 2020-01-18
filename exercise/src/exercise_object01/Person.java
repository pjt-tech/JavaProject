package exercise_object01;

public class Person {
	String name,Id,days,juso,num;
	long number;
	static int num2;
	
	public Person(String name, String Id, String juso , String num ,String days, long number) {
		this.name=name;
		this.Id = Id;
		this.juso = juso;
		this.num = num;
		this.number = number;
		this.days = days;
		num2++;
	}
	
	public void PersonResult() {
		System.out.println("주문자"+num2);
		System.out.println("주문번호 : " + number);
		System.out.println("주문자 아이디 : " + Id);
		System.out.println("주문날짜 : " + days);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문상품번호 : " + num);
		System.out.println("배송 주소 : " + juso);
	}
}
