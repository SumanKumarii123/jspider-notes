package PartialAbstraction;

public class ContentManager {
	static void controlAcces(Hotstar hs) {
		if(hs!=null) {
			hs.login();
			hs.watch();
		}
	}

}
