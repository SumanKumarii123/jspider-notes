package com.jspiders.inheritance;

class AdobeFree
{
	void read()
	{
		System.out.println("Reading PDF Documents");
	}
}
class AdobePaid extends AdobeFree
{
	void edit()
	{
		System.out.println("Editing PDF Documents");
	}
}
public class MainClass13 {
	public static void main(String[] args) {
		AdobePaid obj=new AdobePaid();
		obj.read();
		obj.edit();
	}

}
