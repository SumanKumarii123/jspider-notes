package com.jspiders.Widening;

public class Program1 {
	public static void main(String[] args) {
		int a=20;
		double b=a;//WIDENING : int----------->double
		System.out.println(b);
		
		char c='A';
		int d=c;//char-------------->int
		System.out.println(d);
		
		long e=45677L;
		float f=e;//long-------------->float
		System.out.println(f);
	}

}
