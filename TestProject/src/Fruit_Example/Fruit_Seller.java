package Fruit_Example;

public class Fruit_Seller {
	int numofApple;
	int myMoney;
	int APPLE_PRICE;
	public Fruit_Seller(int money,int num,int price) {
		this.APPLE_PRICE = price;
		this.myMoney = money;
		this.numofApple = num;
	}
	public int AppleSeller(int money) {
		int num = money/APPLE_PRICE;
		numofApple -= num;
		myMoney += money;
		return num;
	}
	
	
	public void SellerResult() {
		System.out.println("판매 금액 : "  + myMoney);
		System.out.println("남은 사과 : " + numofApple);
	}
	

}
