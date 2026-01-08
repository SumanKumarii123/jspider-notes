package com.jspiders.instanceofKeyword;

class Parent
{

}
	class Son extends Parent
	{
	
	}
		class Daughter extends Parent
		{
			
	}

public class Program1 {
	public static void main(String[] args) {
		Parent ref=new Parent();
		if(ref instanceof Son) {
			System.out.println("Rought and Tough");
		}
		else if(ref instanceof Daughter) {
			System.out.println("Love and Care");
		}
		else {
			System.out.println("No Child");
		}
	}

}
