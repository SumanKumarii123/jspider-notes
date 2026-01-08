package com.jspiders.instanceofKeyword;

public class Flipkart {
	static void deliverProduct(Product p) {
		if(p instanceof Mobile) {
			System.out.println("Deliver in 2 wheeler");
		}
		else if(p instanceof Television) {
			System.out.println("Deliver in 3 wheeler");
		}
		else if(p instanceof Refrigerator) {
			System.out.println("Deliver in 4 wheeler");
		}
	}

}
