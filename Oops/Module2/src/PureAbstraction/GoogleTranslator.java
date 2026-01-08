package PureAbstraction;

public class GoogleTranslator {
	static void translate(Language from,Language to) {
		if(from !=null && to!=null) {
			from.write();
			System.out.println("to");
			to.write();
		}
	}

}
