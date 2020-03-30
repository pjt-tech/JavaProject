package Generics;

public class BoxSwapDemo {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		
		System.out.println(box1.get() + "&" + box2.get());

		System.out.println(box1.get() + "&" + box2.get());
	
	}
}


