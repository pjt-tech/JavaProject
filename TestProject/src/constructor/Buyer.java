package constructor;

public class Buyer {
	int myMoney = 5000;
	int numoftaco = 0;
	public void tacoBuyer(Constructor2 tacoSeller,int money) {
		numoftaco += tacoSeller.tacoSeller(money);
		myMoney-=money;
		
	}
	
	public void buyerResult() {
		System.out.println("�ܾ� : " + myMoney);
		System.out.println("Ÿ�ڰ���" + numoftaco);
	}

}
