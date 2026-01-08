package com.jspiders.MethodOverloading;

class Sample{
	void test(int a) {
		System.out.println("white box testing");
	}
	void test(int a,int b) {
		System.out.println("black box testing");
	}
	void test(int a,int b,int c) {
		System.out.println("grey box testing");
	}
}
public class Program2 {
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.test(23);
		obj.test(12, 20);
		obj.test(23, 22, 34);
	}

}
