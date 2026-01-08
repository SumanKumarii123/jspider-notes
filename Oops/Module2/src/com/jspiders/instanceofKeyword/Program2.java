package com.jspiders.instanceofKeyword;


public class Program2 {
	public static void main(String[] args) {
		Developer dev=new Developer();
		Manager.workReview(dev);
		System.out.println(".....................");
		Tester qa=new Tester();
		Manager.workReview(qa);
	}

}
