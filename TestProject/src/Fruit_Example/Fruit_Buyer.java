package Fruit_Example;

public class Fruit_Buyer {
	
	int myMoney = 0;
	int numofApple = 0;
	
	public void buyApple(Fruit_Seller seller, int money ) {
		myMoney = money;
		numofApple += seller.AppleSeller(money);
		myMoney -= money;
		
	}
	
	public void buyResult() {
		System.out.println("���� �ݾ� :" + myMoney);
		System.out.println("��� ���� :" + numofApple);
	}

}
