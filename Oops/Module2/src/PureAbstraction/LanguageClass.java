package PureAbstraction;

public class LanguageClass {
	public static void main(String[] args) {
		English e=new English();
		Kannda k=new Kannda();
		Hindi h=new Hindi();
		GoogleTranslator.translate(e, k);
		System.out.println("..................");
		GoogleTranslator.translate(k, h);
		System.out.println("..............");
		GoogleTranslator.translate(h, e);
	}

}
