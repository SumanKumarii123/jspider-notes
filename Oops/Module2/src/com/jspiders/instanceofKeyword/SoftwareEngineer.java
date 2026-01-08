package com.jspiders.instanceofKeyword;

public class SoftwareEngineer {
    void meeting() {
	System.out.println("Software Engineer is in meeting");
}
}
class Developer extends SoftwareEngineer{
	void coding() {
		System.out.println("Developer is doing coding");
	}
}
class Tester extends SoftwareEngineer{
	void testing() {
		System.out.println("Tester is doing testing");
	}
}