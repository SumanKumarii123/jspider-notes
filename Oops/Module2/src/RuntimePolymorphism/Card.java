package RuntimePolymorphism;

public class Card {
	void swipe() {
		System.out.println("Please Wait");
	}

}
class DebitCard extends Card{
	@Override
	void swipe() {
		System.out.println("Balance Reduces");
	}
}
class CreditCard extends Card{
	@Override
	void swipe() {
		System.out.println("Due Increases");
	}
}
