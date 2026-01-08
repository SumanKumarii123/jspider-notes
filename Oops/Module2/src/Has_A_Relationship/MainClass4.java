package Has_A_Relationship;

class Camera{
	void photo() {
		System.out.println("Taking photo in Camera");
	}
}
class SimCard{
	void services() {
		System.out.println("Call/Message using SimCard");
	}
}
class Mobile{
	Camera cam=new Camera();//Mobile Has-A Camera : Composition
	SimCard sim;//Mobile Has-A SimCard : Aggregation
	Mobile(SimCard sim){
		this.sim=sim;
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		SimCard airtel=new SimCard();
		SimCard jio=new SimCard();
		Mobile mob=new Mobile(jio);
		mob.cam.photo();
		mob.sim.services();
	}

}
