package constructor;

public class Constructor1 {

	public static void main(String[] args) {
	Constructor2 taco2 = new Constructor2();
	Buyer buyer = new Buyer();
	buyer.tacoBuyer(taco2,1000);
	
	System.out.println("구매자 현황");
	buyer.buyerResult();
	System.out.println("판매자현황");
	taco2.sellerResult();
	
	
	}
	

}
