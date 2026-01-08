package com.jspiders.Upcasting;

class Alpha
{
	void play() {
		System.out.println("Executing play()...");
	}
}
class Beta extends Alpha
{
	void send() {
	System.out.println("Executing send()...");
	}
}
public class Program2 {
	public static void main(String[] args) {
		Beta ref=new Beta();
		ref.play();
		ref.send();
		Alpha obj=ref;
		obj.play();
		//obj.send();----->CTE :After UPCASTING we can not access sub-class properties
	}

}
