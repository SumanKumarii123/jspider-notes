package com.jspiders.playingwithobjects;

public class MainClass2 {
	public static void main(String[] args) {
		Player p1=Rooster.createPlayer();
		Rooster.displayPlayerDetails(p1);
		System.out.println("...............");
		Player p2=Rooster.createPlayer();
		Rooster.displayPlayerDetails(p2);
}

}
