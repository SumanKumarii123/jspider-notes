package com.jspiders.MethodOverriding;

class Mother{
	void marriage() {
		System.out.println("Arrange Marriage");
	}
}
class Daughter extends Mother{
	@Override
	void marriage() {
		System.out.println("Love Marriage");
	}
}
public class Program3 {
	public static void main(String[] args) {
		Mother m=new Mother();
		m.marriage();
		
		Daughter d=new Daughter();
		d.marriage();
		
		Mother ref=new Daughter();//UPCASTING
		ref.marriage();
	}

}
