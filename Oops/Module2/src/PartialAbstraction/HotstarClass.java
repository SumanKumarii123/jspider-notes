package PartialAbstraction;

public class HotstarClass {
	public static void main(String[] args) {
		HotStarFree free=new HotStarFree();
		ContentManager.controlAcces(free);
		System.out.println("................");
		HotStarVip vip=new HotStarVip();
		ContentManager.controlAcces(vip);
		System.out.println(".................");
		HotStarPremium premium=new HotStarPremium();
		ContentManager.controlAcces(premium);
		System.out.println("....................");
	}

}
