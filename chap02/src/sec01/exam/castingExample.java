package sec01.exam;

public class castingExample {

	public static void main(String[] args) {
		int intValue1 = 44032;
		char charValue = (char)intValue1;
		System.out.println(charValue);
		
		long longValue1 = 500;
		int intValue2 = (int)longValue1;
		System.out.println(intValue2);
		
		double doubleValue = 3.14;
	    intValue1 = (int)doubleValue;
	    System.out.println(intValue1);
	    
	    System.out.println(3>4);
	}

}
