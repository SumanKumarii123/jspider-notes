package com.jspiders.inheritance;

class InstagramOld
{
	void post()
	{
		System.out.println("Posting Photo");
	}
}
class InstagramNew extends InstagramOld
{
	void messenger()
	{
		System.out.println("Messenger Service");
	}
}
public class MainClass11 {
	public static void main(String[] args) {
		InstagramNew ref=new InstagramNew();
		ref.post();
		ref.messenger();
	}

}
