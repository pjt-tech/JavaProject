package TestExample;

public class Bankbook {
	
	private int balance;
	
public Bankbook(int money) {
	 
	 this.balance = money;
	 
}
 
 public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance += balance;
  }
}

