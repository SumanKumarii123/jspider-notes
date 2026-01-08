package com.jspiders.MethodOverloading;

class Irctc{
	void search(int trainNo) {
		System.out.println("Search with train no");
	}
	void search(String src,String dest) {
		System.out.println("Search with source & destination");
	}
	void search(long pnr) {
		System.out.println("Search with pnr");
	}
}
public class Program6 {
	public static void main(String[] args) {
		Irctc ir=new Irctc();
		ir.search(1234);
		ir.search("banglore","gaya");
		ir.search(5465768798L);
	}

}
