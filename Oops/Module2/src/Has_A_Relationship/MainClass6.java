package Has_A_Relationship;

class Account{
	void withdraw() {
		System.out.println("Withdraw for account");
	}
	void deposit() {
		System.out.println("Deposit to Account");
	}
}
class Customer{
	Account a=new Account();//Customer Has-A Account : Composition
}
class Bank{
	Customer cu;
	Bank(Customer cu){//Bank Has-A Customer : Aggregation
		this.cu=cu;
	}
}
public class MainClass6 {
	public static void main(String[] args) {
		Customer cu=new Customer();
		Bank icici=new Bank(cu);
		icici.cu.a.withdraw();
		Bank sbi=new Bank(cu);
		sbi.cu.a.deposit();
	}

}
