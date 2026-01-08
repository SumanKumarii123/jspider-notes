package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class MakeMyTrip {
	static void showTicketDetails(Ticket t)
	{
		if(t!=null)
		{
			System.out.println("Price : "+t.price);
			System.out.println("PNR : "+t.pnr);
		}
	}
	static Ticket createTicket()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price : ");
		double price=sc.nextDouble();
		System.out.println("Enter PNR : ");
		long pnr=sc.nextLong();
		Ticket t=new Ticket(price,pnr);
		return t;
	}
}
