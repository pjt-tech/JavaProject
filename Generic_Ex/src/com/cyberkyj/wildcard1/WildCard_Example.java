package com.cyberkyj.wildcard1;

public class WildCard_Example {

	public static void main(String[] args) {
		
		FruitBox<Fruit> box1 = new FruitBox<>();
		box1.setItem(new Fruit());
		
		FruitBox<Apple> box2 = new FruitBox<>();
		box2.setItem(new Apple());
		
		openAndShow(box1);
		openAndShow(box2);

	}
	
	public static void openAndShow(FruitBox<? extends Fruit> box) {
		Fruit fruit = box.getItem();
		fruit.showYou();
		
	}

}
