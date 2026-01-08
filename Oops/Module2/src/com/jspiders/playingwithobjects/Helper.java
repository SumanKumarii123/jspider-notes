package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Helper {
	static void displayPenDetails(Pen p)
	{
		if(p!=null)
		{
			System.out.println("Price : "+p.price);
			System.out.println("Color : "+p.color);
		}
	}
	static Pen createPen()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price : ");
		double price=sc.nextDouble();
		System.out.println("Enter color : ");
		String color=sc.next();
		Pen p=new Pen(price,color);
		return p;
		}

}
