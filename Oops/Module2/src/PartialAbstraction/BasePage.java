package PartialAbstraction;

abstract class BasePage {
	void header() {
		System.out.println("Header of Webpage");
	}
	abstract void body();
	void footer() {
		System.out.println("Footer of Webpage");
	}

}
