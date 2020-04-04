public class CardTester {
  public static void main(String[] args) {
    // Testing Card class by initializing objects and calling object's methods such as getValue(), equalCards(), toString() //
		Card card1 = new Card("Q", "Diamond", 12);
    card1.getValue();
		Card card2 = new Card("Q", "Heart", 12);
    card2.equalCards(card1, card2);
		Card card3 = new Card("J", "Club", 11);
		System.out.println(card3.toString());
	}
}