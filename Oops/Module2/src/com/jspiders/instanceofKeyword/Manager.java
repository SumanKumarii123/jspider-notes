package com.jspiders.instanceofKeyword;

public class Manager {
	static void workReview(SoftwareEngineer sw) {
		if(sw !=null) {
			sw.meeting();
			if(sw instanceof Developer) {
				Developer d=(Developer)sw;
				d.coding();
			}
			else if(sw instanceof Tester) {
				Tester t=(Tester)sw;
				t.testing();
			}
		}
	}

}
