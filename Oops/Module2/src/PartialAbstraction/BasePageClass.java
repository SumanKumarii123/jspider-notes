package PartialAbstraction;

public class BasePageClass {
	public static void main(String[] args) {
		Homepage h=new Homepage();
		PageLoader.load(h);
		System.out.println("..................");
		LoginPage l=new LoginPage();
		PageLoader.load(l);
		System.out.println("....................");
		SearchPage s=new SearchPage();
		PageLoader.load(s);
	}

}
