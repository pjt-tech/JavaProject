package com.cyberkyj.function;

import java.util.*;
import java.util.function.*;

public class Function_Example {

	static List<Student> list = Arrays.asList(new Student("워너원",90,96),
											new Student("트와이스",95,93));
	
	public static void main(String[] args) {
		
		System.out.println("학생 이름 :");
		printString(t -> t.getName());	
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
		
		
	}
	
	public static void printString(Function<Student, String> function) {
		
		for(Student stu : list) {
			System.out.print(function.apply(stu)+" ");
		}
		
		System.out.println("");
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		
		for(Student stu : list) {
			System.out.print(function.applyAsInt(stu)+" ");
		}
		
		System.out.println("");
	}

}
