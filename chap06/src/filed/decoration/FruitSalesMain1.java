package filed.decoration;

import java.util.Scanner;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		int money = 0;
		
		while(true) {
		System.out.print("구매할 사과의 금액은 ?");
		money = s.nextInt();
		buyer.buyApple(seller,money);
		
		System.out.println("과일 판매자의 현재상황");
		seller.showSaleResult();
			
		System.out.println("과일 구매자의 현재상황");
		buyer.showBuyResult();

	}

}
}
