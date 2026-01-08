package PartialAbstraction;

public class PageLoader {
	static void load(BasePage bp) {
		if(bp!=null) {
			bp.header();
			bp.body();
			bp.footer();
		}
	}

}
