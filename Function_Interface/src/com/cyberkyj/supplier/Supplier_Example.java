package com.cyberkyj.supplier;

import java.util.function.*;

public class Supplier_Example {

	public static void main(String[] args) {
		
		//IntSupplier supplier = () -> {
		Supplier<Integer> supplier = () -> {
			int num = (int) (Math.random()*6)+1;
			return num;
		};
		
		//int num = supplier.getAsInt();
		int num = supplier.get();
		System.out.println("주사위 눈의 수 : "+num);
		
	}

}
