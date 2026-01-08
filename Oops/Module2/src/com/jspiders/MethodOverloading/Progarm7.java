package com.jspiders.MethodOverloading;

class FingerPrint{
	
}
class Mobile
{
	void unlock() 
	{
		System.out.println("Swipe to unlock");
	}
	void unlock(int pin) {
		System.out.println("pin to unlock");
	}
	void unlock(String pwd) {
		System.out.println("Password to unlock");
	}
	void unlock(FingerPrint obj) {
		System.out.println("FingerPrint to unlock");
	}
}
public class Progarm7 {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.unlock();
		m.unlock(123);
		m.unlock("dgfhgj");
		m.unlock(new FingerPrint());	
	}

}
