package com.cyberkyj.generic_method;

public class Generic_Method_Example {

	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair(1,"���");
		Pair<Integer,String> p2 = new Pair(1,"���");
		boolean result1 = Util.compare(p1, p2);
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
			
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
		
		Pair<String,String> p3 = new Pair("user1","���");
		Pair<String,String> p4 = new Pair("user2","���");
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
			
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
	}

}
