package com.jspiders.playingwithobjects;

public class MainClass4 {
	public static void main(String[] args) {
		Product p1=Flipkart.createProduct();
		Flipkart.showProductDetails(p1);
		System.out.println("................");
		Product p2=Flipkart.createProduct();
		Flipkart.showProductDetails(p2);
	}

}
