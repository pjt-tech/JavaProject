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
		System.out.print("������ ����� �ݾ��� ?");
		money = s.nextInt();
		buyer.buyApple(seller,money);
		
		System.out.println("���� �Ǹ����� �����Ȳ");
		seller.showSaleResult();
			
		System.out.println("���� �������� �����Ȳ");
		buyer.showBuyResult();

	}

}
}
