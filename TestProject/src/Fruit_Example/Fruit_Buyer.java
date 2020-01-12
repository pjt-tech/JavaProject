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
		System.out.println("남은 금액 :" + myMoney);
		System.out.println("사과 개수 :" + numofApple);
	}

}
