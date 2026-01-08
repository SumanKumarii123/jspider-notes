package Has_A_Relationship;

class Engine{
	void power() {
		System.out.println("Engine sends Power");
	}
}
class Driver{
	void drive() {
		System.out.println("Driver is Driving");
	}
}
class Car{
	Engine eng=new Engine();//Car Has-A Engine : Composition
	Driver dr;//Car Has-A Driver : Aggregation
	Car(Driver dr){
		this.dr=dr;
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		Driver dr=new Driver();
		Car c=new Car(dr);
		c.eng.power();
		c.dr.drive();
	}

}
