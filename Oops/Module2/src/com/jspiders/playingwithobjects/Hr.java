package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Hr {
	static void displayEmployeeDetails(Employee e)
	{
		if(e!=null)
		{
			System.out.println("EID : "+e.eid);
			System.out.println("CTC : "+e.ctc);
		}
	}
	static Employee createEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EID");
		int eid=sc.nextInt();
		System.out.println("Enter CTC");
		double ctc=sc.nextDouble();
		Employee e=new Employee(eid,ctc);
		return e;
	}
}
