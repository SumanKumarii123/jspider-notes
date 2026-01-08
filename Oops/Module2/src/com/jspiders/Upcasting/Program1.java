package com.jspiders.Upcasting;

class Demo{
	
}
class Sample extends Demo{
	
}
public class Program1 {
	public static void main(String[] args) {
		Sample ref=new Sample();
		Demo obj=ref;//UPCASTING : Sample---------->Demo
		System.out.println(ref);
		System.out.println(obj);
	}

}
