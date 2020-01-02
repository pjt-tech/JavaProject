package sec01.exam;

import java.util.Scanner;

public class PromotionExample {

	public static void main(String[] args) {
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
        //byte bytevalue3 = bytevalue1+bytevalue2;
		int bytevalue3 = bytevalue1+bytevalue2;
       // int num1 = 10000000000;
       //long num2 = 10000000000;
       // float num3 = 12.45;
        long num1 = 10000000000L;
        double num3 = 12.45;
        
        System.out.println(num1+num3);
        
        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1+charValue2;
        int charValue3 = charValue1+charValue2;
        System.out.println("유니코드:"+charValue3);
        System.out.println("출력문자 :"+ (char)charValue3); 
        
        int intValue1 = 10;
        //int intValue2 = 10/4.0;
        double intValue2 = 10/4.0;
        System.out.println(intValue2);
        
        
        int vluAfter = 0;
        long vluBefore= 0;
        char chrAfter= 'A';
        
        System.out.println ("First reference :"+ vluAfter++);
        System.out.println ("First reference :"+ vluAfter);
        
        int b1= 0B010;
        int b2= 0B011;
        
        System.out.println(2>>1);
        System.out.println(2<<1);
        System.out.println(8>>3);
        System.out.println(-8>>1);
        
       String var1 = "A";
       //Strig은 가변 글자수 제한x
       String var2 = "홍길동";
       String str = "300000";
       int value = Integer.parseInt(str);
       System.out.printf(value+var1+var2);       
       String st = String.valueOf(3);
       System.out.println(st);
       String st1 = "125451254";
       int value1 = Integer.parseInt(st1);
       System.out.println (st1);       
       System.out.printf("이름 :%2$s, 나이:%1$3d, 키:%3$5.2f", 28, "박진태", 180.4);
       
       Scanner scanner = new Scanner(System.in);
       String inputData = scanner.nextLine();
      ////////////////////////////////////테스트//////////////////////////////////
      System.out.println("## 계산할 초는?"+12345);
       
       
       
             
  	}

}
