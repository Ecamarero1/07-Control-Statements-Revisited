/**
 * The card class contains the following pieces of data about a playing card:
 * rank (stored as an integer 1-13), and suit (stored as a String).  This
 * information is private to the class.  Clients can obtain this information
 * only by using the various methods defined by the class.
 * @author User
 *
 */

public class card {

	
	public static final int CLUBS = 1;
	public static final int DIAMONS = 2;
	public static final int HEARTS = 3;
	public static final int SPADES = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	/**
	 * Creates a new Card Object with a specified rank and suit.
	 * @param rank The card's rank as an integer 1- 13
	 * @param suit The card's suit as an integer 1- 4
	 */
	
	public card (int rank, int suit){
		cardRank = rank;
		cardSuit = suit;
	}
	
	/**
	 * Gets the rank of this card
	 * @return The rank of this card
	 */
	public String getRank(){
		switch(cardRank){
			case ACE : return "Ace";
			case JACK : return "Jack";
			case QUEEN : return "Queen";
			case KING : return "King";
			default: return Integer.toString(cardRank);
		}
	}
	
	/**
	 * Gets the suit of the card
	 * @return The suit of this card
	 */
	public String getSuit(){
		switch(cardSuit){
			case CLUBS : return "Clubs";
			case DIAMONS: return "Diamons";
			case HEARTS: return "Hearts";
			case SPADES: return "Spades";
			default: return "no suit";
			
		}
	}
	/**
	 * Creates a String identify this card
	 * @return The String used to display this card
	 */
	public String toString() {
		return getRank() + " of " + getSuit();
	}
	
	
	// Private instance variables
	private int cardRank;
	private int cardSuit;
}


