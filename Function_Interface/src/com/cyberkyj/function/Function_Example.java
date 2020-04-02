package com.cyberkyj.function;

import java.util.*;
import java.util.function.*;

public class Function_Example {

	static List<Student> list = Arrays.asList(new Student("���ʿ�",90,96),
											new Student("Ʈ���̽�",95,93));
	
	public static void main(String[] args) {
		
		System.out.println("�л� �̸� :");
		printString(t -> t.getName());	
		
		System.out.println("[���� ����]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[���� ����]");
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
