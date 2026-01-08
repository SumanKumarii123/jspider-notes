package com.jspiders.inheritance;

class Whatsapp1
{
	void message()
	{
		System.out.println("Message in Whatsapp");
	}
}
class Whatsapp2 extends Whatsapp1
{
	void call()
	{
		System.out.println("Call in Whatsapp");
	}
}
class Whatsapp3 extends Whatsapp2
{
	void status()
	{
		System.out.println("Status in Whatsapp");
	}
}
public class MainClass12 {
	public static void main(String[] args) {
		Whatsapp3 obj=new Whatsapp3();
		obj.message();
		obj.call();
		obj.status();
	}
}
