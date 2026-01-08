package RuntimePolymorphism;

public class MainClass1 {
	public static void main(String[] args) {
		Frontend fe=new Frontend();
		Lead.reviewWork(fe);
		System.out.println("......................");
		Backened be=new Backened();
		Lead.reviewWork(be);
	}

}
