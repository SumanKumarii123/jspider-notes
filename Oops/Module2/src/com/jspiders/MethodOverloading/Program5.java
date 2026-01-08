package com.jspiders.MethodOverloading;

class Flipkart{
	void payment() {
		System.out.println("COD");
	}
	void payment(long card) {
		System.out.println("CARD");
	}
	void payment(String upi) {
		System.out.println("UPI");
	}
}
public class Program5 {
	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		f.payment();
		f.payment(35476587L);
		f.payment("kumari@suman");
	}

}
