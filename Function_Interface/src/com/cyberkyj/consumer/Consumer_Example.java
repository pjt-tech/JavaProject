package com.cyberkyj.consumer;

import java.util.function.*;

public class Consumer_Example {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t+u);
		biConsumer.accept("Java","8");
		
		ObjIntConsumer<String> oiConsumer = (t,u) -> System.out.println(t+u); 
		oiConsumer.accept("Java", 8);

	}

}
