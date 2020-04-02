package com.cyberkyj.predicate;

import java.util.*;
import java.util.function.*;

public class Predicate_Example {

	static List <Student> list = Arrays.asList(new Student("워너원","남자", 95),
			new Student("트와이스","여자", 92),
			new Student("블랙핑크","여자", 90),
			new Student("레드벨벳","여자", 93),
			new Student("방탄소년단","남자", 96)); 
	
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
		
		double maleAvg = avg(t -> t.getS().equals("남자"));
		System.out.println("남자 평균 점수 : "+maleAvg);
		
		double femaleAvg = avg(t -> t.getS().equals("여자"));
		System.out.println("여자 평균 점수 : "+femaleAvg);
	}
	
	
	

}
