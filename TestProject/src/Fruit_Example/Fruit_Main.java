package Fruit_Example;

public class Fruit_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit_Buyer buyer = new Fruit_Buyer();
		Fruit_Seller seller1 = new Fruit_Seller(0,30,1000);
		Fruit_Seller seller2 = new Fruit_Seller(0,20,1500);
		
		buyer.buyApple(seller1, 2000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("----------------------------");
		System.out.println("������ ��Ȳ");
		buyer.buyResult();
		System.out.println("----------------------------");
		System.out.println("�Ǹ��� 1��Ȳ");
		seller1.SellerResult();
		System.out.println("----------------------------");
		System.out.println("�Ǹ��� 2��Ȳ");
		seller2.SellerResult();
	}

}
