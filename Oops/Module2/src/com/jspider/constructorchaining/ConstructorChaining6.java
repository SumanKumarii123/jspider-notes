package com.jspider.constructorchaining;

class Parent
{
	Parent()
	{
		super();
		System.out.println("aaaaaaaaaaaaaaaaaaaa");
	}
	Parent(int x)
	{
		this();
		System.out.println("bbbbbbbbbbbbbbbbbbbbb");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("cccccccccccccccccccccc");
	}
	Child(int y)
	{
		super(1);
		System.out.println("ddddddddddddddddddddd");
	}
}
public class ConstructorChaining6 {
	public static void main(String[] args) {
		Child c=new Child();
	}

}
