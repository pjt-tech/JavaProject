package com.cyberkyj.wildcard2;

public class Course<T> {
	
	String name;
	T[] students;
	
	public Course(String name, int size) {
		this.name = name;
		students = (T[])new Object[size];
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i]=t;
				
			}
		}
	}

}
