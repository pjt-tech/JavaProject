package constructor;

public class Constructor1 {

	public static void main(String[] args) {
	Constructor2 taco2 = new Constructor2();
	Buyer buyer = new Buyer();
	buyer.tacoBuyer(taco2,1000);
	
	System.out.println("������ ��Ȳ");
	buyer.buyerResult();
	System.out.println("�Ǹ�����Ȳ");
	taco2.sellerResult();
	
	
	}
	

}
