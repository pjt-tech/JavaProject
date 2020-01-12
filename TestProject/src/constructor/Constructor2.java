package constructor;

public class Constructor2 {
	int myMoney = 0;
	int numofTaco = 20;
	int tacoprice = 500;
	
	public int tacoSeller(int money) {
		int num = money/tacoprice;
		numofTaco-=num;
		myMoney+=money;
		return num;
		
	}
	public void sellerResult() {
		System.out.println("판매현황 : " + myMoney);
		System.out.println("남은개수 : " + numofTaco);
	}

}
