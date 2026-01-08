package com.jspiders.Narrowing;

public class Program1 {
	public static void main(String[] args) {
		double p=4.5;
		int q=(int)p;//NARROWING : double--------->int
		System.out.println(q);
		
		int x=65;
		char y=(char)x;//int----------->char
		System.out.println(y);
		
		float i=3.7f;
		long j=(long)i;//float--------->long
		System.out.println(j);
	}
	

}
