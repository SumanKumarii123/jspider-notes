package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Rooster {
	static void displayPlayerDetails(Player p)
	{
		if(p!=null)
		{
			System.out.println("Jersey Number : "+p.jn);
			System.out.println("Player Name : "+p.name);
		}
	}
	static Player createPlayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter jersey no. :");
		int jn=sc.nextInt();
		System.out.println("Enter Player Name");
		String name=sc.next();
		Player p=new Player(jn,name);
		return p;
	}

}
