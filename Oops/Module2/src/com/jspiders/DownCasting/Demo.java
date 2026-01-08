package com.jspiders.DownCasting;

class Test{
	
}
class Sample extends Test{
	
}
public class Demo {
    public static void main(String[] args) {
		Test ref=new Sample();
		Sample obj=(Sample)ref;//DOWNCASTING : Test-------->Sample
		System.out.println(ref);
		System.out.println(obj);
	}

}