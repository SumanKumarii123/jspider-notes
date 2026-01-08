package com.jspiders.Upcasting;

public class FoodClass {
	public static void main(String[] args) {
		Pongal p=new Pongal();
		Zomato.orderFood(p);
		
		Dosa d=new Dosa();
		Zomato.orderFood(d);
		
		Idly i=new Idly();
		Zomato.orderFood(i);
	}

}
