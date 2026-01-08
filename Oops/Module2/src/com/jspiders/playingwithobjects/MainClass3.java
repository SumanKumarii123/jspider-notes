package com.jspiders.playingwithobjects;

public class MainClass3 {
	public static void main(String[] args) {
		Account a1=Bank.createAccount();
		Bank.showAccountInfo(a1);
		System.out.println("...............");
		Account a2=Bank.createAccount();
		Bank.showAccountInfo(a2);
		
	}

}
