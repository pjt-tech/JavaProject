package com.cyberkyj.wildcard2;

import java.util.*;

public class WildCard_Example {

	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���",5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<>("�����ΰ���",5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<>("�л�����",5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highstudentCourse = new Course<>("����л�����",5);
		highstudentCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		System.out.println("------------------------");
		
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highstudentCourse);
		System.out.println("------------------------");
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highstudentCourse);
		System.out.println("------------------------");

	}
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+" ������ : "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+" ������ : "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+" ������ : "+Arrays.toString(course.getStudents()));
	}

}











