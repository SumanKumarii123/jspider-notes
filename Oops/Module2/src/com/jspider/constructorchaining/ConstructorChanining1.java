package com.jspider.constructorchaining;

class City
{
	City(int a)
	{
		this(2.3);
		System.out.println("NEW YORK");
	}
	City(double d){
		this("PQRS");
		System.out.println("LONDON");
	}
	City(String s){
		System.out.println("PARIS");
	}
}
public class ConstructorChanining1 {
	public static void main(String[] args) {
		City c1=new City(45);
	}

}
