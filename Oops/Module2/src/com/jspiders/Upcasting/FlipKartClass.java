package com.jspiders.Upcasting;

public class FlipKartClass {
	public static void main(String[] args) {
	Mobile m=new Mobile();
	Flipkart.addToKart(m);//AUTO-UPCASTING : Mobile-------->Product
	
	Television tv=new Television();
	Flipkart.addToKart(tv);//AUTO-UPCASTING : Television-------->Product
	
	Refrigerator ref=new Refrigerator();
	Flipkart.addToKart(ref);//AUTO-UPCASTING : Refrigerator-------->Product	

	}
}
