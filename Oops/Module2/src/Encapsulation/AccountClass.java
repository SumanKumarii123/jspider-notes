package Encapsulation;

public class AccountClass {
	public static void main(String[] args) {
		Account a=new Account();
		a.setAccNum(465768768L);
		a.setAccBal(45000.0);
		System.out.println(a.getAccNum());
		System.out.println(a.getAccBal());
	}

}
