package com.cyberkyj.predicate;

import java.util.*;
import java.util.function.*;

public class Predicate_Example {

	static List <Student> list = Arrays.asList(new Student("���ʿ�","����", 95),
			new Student("Ʈ���̽�","����", 92),
			new Student("����ũ","����", 90),
			new Student("���座��","����", 93),
			new Student("��ź�ҳ��","����", 96)); 
	
	static double avg(Predicate<Student> predicate) {
		
		int count = 0, sum =0;
		for(Student stu : list ) {
			if(predicate.test(stu)) {
				count++;
				sum+=stu.getScore();
			}
		}
		
		return (double)sum/count;
		
	}
	
	
	public static void main(String[] args) {
		
		double maleAvg = avg(t -> t.getS().equals("����"));
		System.out.println("���� ��� ���� : "+maleAvg);
		
		double femaleAvg = avg(t -> t.getS().equals("����"));
		System.out.println("���� ��� ���� : "+femaleAvg);
	}
	
	
	

}
