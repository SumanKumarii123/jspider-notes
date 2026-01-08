package com.jspiders.MethodOverriding;

class AntiVirusFree{
	void scan() {
		System.out.println("Malware");
	}
}
class AntiVirusPaid extends AntiVirusFree{
	@Override
	void scan() {
		System.out.println("Malware+Spyware");
	}
}
public class Program6 {
	public static void main(String[] args) {
		AntiVirusFree a1=new AntiVirusFree();
		a1.scan();
		
		AntiVirusPaid a2=new AntiVirusPaid();
		a2.scan();
		
		AntiVirusFree ref=new AntiVirusPaid();//UPCASTING
		ref.scan();
	}

}
