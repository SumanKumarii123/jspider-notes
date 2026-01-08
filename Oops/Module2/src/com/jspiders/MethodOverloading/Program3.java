package com.jspiders.MethodOverloading;

class Example{
	void eat(int a,String s) {
		System.out.println("veg food");
	}
	void eat(String s,int a)
	{
		System.out.println("Non-veg food");
	}
}
public class Program3 {
	public static void main(String[] args) {
		Example ex=new Example();
		ex.eat(12,"abc");
		ex.eat("rty", 13);
	}

}
