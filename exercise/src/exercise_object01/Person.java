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
		System.out.println("�ֹ���"+num2);
		System.out.println("�ֹ���ȣ : " + number);
		System.out.println("�ֹ��� ���̵� : " + Id);
		System.out.println("�ֹ���¥ : " + days);
		System.out.println("�ֹ��� �̸� : " + name);
		System.out.println("�ֹ���ǰ��ȣ : " + num);
		System.out.println("��� �ּ� : " + juso);
	}
}
