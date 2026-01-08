package com.jspider.constructorchaining;

class Delta
{
	Delta()
	{
		System.out.println("Delta() Constructor");
	}
	Delta(int a)
	{
		this();
		System.out.println("Delta(int) Constructor");
	}
}
class Example extends Delta
{
	Example(){
		super(10);
		System.out.println("Example() Constructor");
	}
}
public class ConstructorChaining5 {
	public static void main(String[] args) {
		Example obj=new Example();
	}

}
