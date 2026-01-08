package com.jspiders.MethodOverriding;

class FacebookOld{
	void reaction() {
		System.out.println("Like");
	}
}
class FacebookNew extends FacebookOld{
	@Override
	void reaction() {
		System.out.println("Like,Wow,Sad,Angry,Haha,Love");
	}
}
public class Program4 {
	public static void main(String[] args) {
		FacebookOld f1=new FacebookOld();
		f1.reaction();
		
		FacebookNew f2=new FacebookNew();
		f2.reaction();
		
		FacebookOld ref=new FacebookNew();//UPCASTING
		ref.reaction();
	}

}
