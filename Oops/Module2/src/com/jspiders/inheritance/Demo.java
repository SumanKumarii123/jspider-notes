package com.jspiders.inheritance;
class Test {
	int val=100;
	void test()
	{
		System.out.println("Executing test()...........");
	}
}
class Sample extends Test
{
	
}
public class Demo
{
	public static void main(String[] args) {
		Sample ref=new Sample();
		System.out.println(ref.val);
		ref.test();
	}
}
