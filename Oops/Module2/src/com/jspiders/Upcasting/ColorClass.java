package com.jspiders.Upcasting;

public class ColorClass {
	public static void main(String[] args) {
		Red r=new Red();
		ColorPalette.selectColor(r);
		
		Blue b=new Blue();
		ColorPalette.selectColor(b);
		
		Green g=new Green();
		ColorPalette.selectColor(g);
		
		Black k=new Black();
		ColorPalette.selectColor(k);
	}

}
