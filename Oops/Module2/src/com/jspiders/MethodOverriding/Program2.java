package com.jspiders.MethodOverriding;

class Father{
	void motorCycle() {
		System.out.println("Normal");
	}
}
class Gunda extends Father{
	@Override
	void motorCycle() {
		System.out.println("Abnormal");
	}
}
public class Program2 {
	public static void main(String[] args) {
		Father ref=new Gunda();//UPCASTING
		ref.motorCycle();
	}

}
