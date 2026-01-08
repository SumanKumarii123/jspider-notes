package com.jspider.constructorchaining;

class Student
{
	Student()
	{
		System.out.println("Initialize Personal Details");
		System.out.println("Initialize Academic Details");
	}
	Student(boolean exp)
	{
		this();
		System.out.println("Initialize Experience Details");
	}
}
public class ConstructorChaining2 {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(".........................");
		Student s2=new Student(true);
	}

}
