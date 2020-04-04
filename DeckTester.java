public class DeckTester {  
  public static void main(String[] args) {
    String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
    int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    Deck d1 = new Deck(ranks, suits, values);
    System.out.println(d1.toString());
    Deck d2 = new Deck(ranks, suits, values);
    System.out.println(d2.isEmpty());
    System.out.println(d2.size());
    Deck d3 = new Deck(ranks, suits, values);
    System.out.println(d3.deal());
    System.out.println(d3.varSize());
  }
}