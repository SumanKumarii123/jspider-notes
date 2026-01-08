package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Flipkart {
	static void showProductDetails(Product p)
	{
		if(p!=null)
		{
			System.out.println("Enter pid Number: "+p.pid);
			System.out.println("Enter Price: "+p.price);
		}
		
	}
	static Product createProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid Number: ");
		int pid=sc.nextInt();
		System.out.println("Enter price of the poduct: ");
		double price=sc.nextDouble();
		Product p=new Product(pid,price);
		return p;
	}

}
