package com.jspiders.inheritance;

class Alpha
{
	void play()
	{
		System.out.println("Executing play().........");
	}
}
class Beta extends Alpha
{
	void help() 
	{
		System.out.println("Executing help()...........");
	}
}
public class MainClass7 {
	public static void main(String[] args) {
	Alpha ref=new Alpha();
	ref.play();
	System.out.println("................................");
    Beta obj=new Beta();
    obj.play();
    obj.help();
}
}
