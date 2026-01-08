package Enum;

enum Shape{
	CIRCLE,SQUARE,TRIANGLE,PENTAGON
}
public class ShapeClass {
	public static void main(String[] args) {
		Shape choice=Shape.CIRCLE;
		switch(choice) {
		case CIRCLE:System.out.println("No sides");
		break;
		case TRIANGLE:System.out.println("3-sides");
		break;
		case SQUARE:System.out.println("4-sides");
		break;
		default:System.out.println("Undefined Shape");
		}
	}

}
