package com.jspiders.MethodOverloading;

class Facebook{
	void login(String un,String pwd) {
		System.out.println("Login with username and password");
	}
	void login(long mn,String pwd) {
		System.out.println("Login with mobile number and password");
	}
}
public class Program4 {
	public static void main(String[] args) {
		Facebook fb=new Facebook();
		fb.login("suman", "suman@12");
		fb.login(356768798L,"suman234");
	}

}
