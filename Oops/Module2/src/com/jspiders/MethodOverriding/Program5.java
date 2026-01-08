package com.jspiders.MethodOverriding;

class Whatsapp1{
	void deliveryReport() {
		System.out.println("Sent");
	}
}
class Whatsapp2 extends Whatsapp1{
	@Override
	void deliveryReport() {
		System.out.println("Sent-Delivered");
	}
}
class Whatsapp3 extends Whatsapp2{
	@Override
	void deliveryReport() {
		System.out.println("Sent-Delivered-Seen");
	}
}
public class Program5 {
	public static void main(String[] args) {
		Whatsapp1 w1=new Whatsapp1();
		w1.deliveryReport();
		
		
		Whatsapp2 w2=new Whatsapp2();
		w2.deliveryReport();
		
		Whatsapp3 w3=new Whatsapp3();
		w3.deliveryReport();
		
		Whatsapp1 ref=new Whatsapp3();//UPCASTING
		ref.deliveryReport();
	}

}
