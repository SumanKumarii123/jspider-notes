package com.jspiders.Widening;

class Demo
{
	void play(float val) {
		System.out.println("Value : "+val);
	}
}
public class Program2 {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.play(4.5F);
		ref.play(10);//AUTO-WIDENING : int---------->float
		ref.play('a');//AUTO-WIDENING : char---------->float
	}

}
