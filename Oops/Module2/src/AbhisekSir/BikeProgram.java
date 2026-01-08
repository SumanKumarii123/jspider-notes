package AbhisekSir;

public class BikeProgram {
	public static void main(String[] args) {
		Bike b1=new Bike("Hayabus","white",234465);
		Bike b2=new Bike("R1","black",26734465);
		Bike b3=new Bike("Z90w","Grey",27834465);
		Bike x[]= {b1,b2,b3};
		for(int i=0;i<=x.length-1;i++) {
			System.out.println(x[i].name+" "+x[i].color+" "+x[i].price);
		}
	}

}
