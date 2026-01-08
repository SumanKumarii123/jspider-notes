package com.jspiders.MethodOverriding;

class Parent{
	void watchTv()
	{
		System.out.println("NEWS/SERIAL");
	}
}
class Child extends Parent
{
	@Override
	void watchTv()
	{
		System.out.println("MOVIES/SERIES");
	}
}
public class Program1 {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.watchTv();
		
		Child c=new Child();
		c.watchTv();
		
		Parent ref=new Child();//UPCASTING
		ref.watchTv();
	}

}
