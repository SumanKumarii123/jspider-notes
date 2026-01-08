package com.jspiders.MethodOverriding;

class Windows10{
	void start() {
		System.out.println("List View");
	}
}
class Windows11 extends Windows10{
	@Override
	void start() {
		System.out.println("Box View");
	}
}
public class Program7 {
	public static void main(String[] args) {
		Windows10 w1=new Windows10();
		w1.start();
		
		Windows11 w2=new Windows11();
		w2.start();
		
		Windows10 ref=new Windows11();
		ref.start();
	}

}
