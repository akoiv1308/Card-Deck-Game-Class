class Main {



  /* This is a completed code "Java Card Game" document. I used it as a base to build my project called Card-Game Project - BlackJack (Thus, this is not the actual project and just a code with all of the requirements written in the document). I did not know if you wanted to see this code along with the project, so I attached it to the assignment "Card Game" on Google Classroom */

  


  public static void main(String[] args) {
    // Card Class //

    // Card card1 = new Card("Q", "Diamond");
    // System.out.println(card1.getValue());
		// Card card2 = new Card("Q", "Heart");
    // System.out.println(card2.equalCards(card1, card2));
		// Card card3 = new Card("J", "Club");
		// System.out.println(card3.toString());

    // Deck Class //
    
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