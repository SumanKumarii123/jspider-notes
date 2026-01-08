package com.jspiders.DownCasting;

class Delta{
	int x=100;
}
class Example extends Delta{
	int y=200;
}
public class Program2 {
	public static void main(String[] args) {
		Delta d=new Example();
		
	}
	

}
