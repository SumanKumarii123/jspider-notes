package Enum;
enum Vehicle{
	KTM,YAMAHA,TVS,HERO,BAJAJ;
}
public class Bike {
	public static void main(String[] args) {
		Vehicle v1=Vehicle.TVS;
		System.out.println(v1);
		Vehicle v2=Vehicle.HERO;
		System.out.println(v2);
		System.out.println("..........");
		Vehicle arr[]=Vehicle.values();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
