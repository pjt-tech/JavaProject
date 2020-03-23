import java.util.*;

public class Math_Random_Example {

	public static void main(String[] args) {
		
		//int num = (int)(Math.random()*6)+1;
		Random random = new Random();
		int num = random.nextInt(6)+1;
		System.out.println("ÁÖ»çÀ§ÀÇ ´« : "+num);
		

	}

}
