package com.jspiders.DownCasting;

class Alpha
{
	void play() {
		System.out.println("Execute Play");
	}
}
class Beta extends Alpha{
	void help() {
		System.out.println("Execute Help");
	}
}
public class Program1 {
	public static void main(String[] args) {
		Alpha a=new Beta();
		a.play();
		System.out.println("------------------");
		Beta b=(Beta)a;//DOWNCASTING : Alpha--------->Beta
		b.play();
		b.help();
	}

}
