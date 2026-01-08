package PartialAbstraction;

public class Controller {
	static void display(Android a) {
		if(a != null) {
			a.ui();
			a.services();
		}
	}

}
