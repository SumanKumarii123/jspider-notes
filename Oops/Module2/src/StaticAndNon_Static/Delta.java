package StaticAndNon_Static;

class Test{
	static int x=10;
	int y=20;
	static void play() {
		int z=30;
		System.out.println("Executing play");
	}
}
public class Delta {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.y);
		Test.play();
		System.out.println(Test.x);
	}

}
