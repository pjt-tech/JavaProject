package com.cyberkyj.predicate_test;

import java.util.*;
import java.util.function.*;

public class PredicateShow {

	public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 3, 8, 10, 11);
        System.out.println("홀수 출력");
        show(n -> n%2 != 0, lst1);    
        
        System.out.println("--------------------");
        
        List<Double> lst2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
        System.out.println("0.0 보다 큰 수 출력");    
        show(n -> n > 0.0, lst2);

	}
	
	public static <T> void show(Predicate<T> p, List<T> lst) {        
        for(T n : lst) {
        	if(p.test(n)) {
        		System.out.println(n);
        	}
        }
        
    }


}
