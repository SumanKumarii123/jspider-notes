package com.jspiders.Upcasting;

class Delta
{
	int num=100;
}
class Example extends Delta
{
	int val=200;
}
public class Program3 {
	public static void main(String[] args) {
		Delta d=new Example();//UPCASTING : Example------->Delta
		System.out.println(d.num);
	}

}
