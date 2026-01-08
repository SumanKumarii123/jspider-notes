package PartialAbstraction;

public class AndroidClass {
	public static void main(String[] args) {
		Samsung s=new Samsung();
		Controller.display(s);
		System.out.println("...................");
		Vivo v=new Vivo();
		Controller.display(v);
		System.out.println("...................");
		Oppo o=new Oppo();
		Controller.display(o);
	}

}
