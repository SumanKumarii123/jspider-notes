package com.jspiders.inheritance;

class SwiggyV1
{
	void foodDelivery()
	{
		System.out.println("Food is delivered");
	}
}
class SwiggyV2 extends SwiggyV1
{
	void groceryDelivery()
	{
		System.out.println("Grocery is delivered");
	}
}
public class codeResuability {
	public static void main(String[] args) {
		SwiggyV2 s=new SwiggyV2();
		s.foodDelivery();
		s.groceryDelivery();
	}

}
