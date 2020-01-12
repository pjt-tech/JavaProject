package TestExample;

public class Depositor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankbook deposit = new Bankbook(5000);
		User user1 = new User();
		user1.User1(deposit, 50000);
		
		
		System.out.println("ภÜพื : " + deposit.getBalance());
	}

}
