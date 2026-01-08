package com.jspiders.MethodOverloading;

class Demo{
	void play(int a) {
    System.out.println("pubg");
	}
	void play(double d) {
		System.out.println("Free Fire");
	}
	void play(String s) {
		System.out.println("LUDO");
	}
}
public class Program1 {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.play(10);
		ref.play(4.5);
		ref.play("tiger");
	}

}
