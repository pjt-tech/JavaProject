package constructor;

public class Buyer {
	int myMoney = 5000;
	int numoftaco = 0;
	public void tacoBuyer(Constructor2 tacoSeller,int money) {
		numoftaco += tacoSeller.tacoSeller(money);
		myMoney-=money;
		
	}
	
	public void buyerResult() {
		System.out.println("잔액 : " + myMoney);
		System.out.println("타코개수" + numoftaco);
	}

}
