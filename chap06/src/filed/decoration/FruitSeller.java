package filed.decoration;

public class FruitSeller {
	int numOfApple = 100;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;
	
	public int saleApple(int money)
	{
		int num = (int)money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
		
	}

	public void showSaleResult() {
		System.out.println("������� :" + numOfApple);
		System.out.println("�Ǹż��� :" + myMoney);
	}
}
