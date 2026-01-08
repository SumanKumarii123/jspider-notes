package StaticAndNon_Static;

import java.util.Scanner;

public class Bank {
	static void showAccountInfo(Account a) {
		if(a!=null) {
			System.out.println("Account No. : "+a.accNo);
			System.out.println("Account Bal. : "+a.accBal);
		}
	}
	
	static Account createAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No. : ");
		long accNo=sc.nextLong();
		System.out.println("Enter Account Balance : ");
		double accBal=sc.nextDouble();
		Account a=new Account(accNo,accBal);
		return a;
	}

}
