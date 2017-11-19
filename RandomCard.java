/*
*	RandomCard.java
*
*	A program that display a random card
*	only with letter
*
*/

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		
		int number;
		String suits= "";
		int card = rgen.nextInt(1, 52);
		
		if (card >= 1 && card <=13){
			number = card;
			suits = "Clubs ";
		} else if (card >=14 && card <= 26) {
			number = card - 13;
			suits = "Diamons ";
		} else if (card >= 27 && card <= 39){
			number = card - 26;
			suits = "Hearts ";
		} else {
			number = card - 39;
			suits = "Spades ";
		}	
		switch (number){
		case 1: println("As of "+ suits); break;
		case 2: println("Two of "+ suits); break;
		case 3: println("Tree of "+ suits); break;
		case 4: println("Four of "+ suits); break;
		case 5: println("Five of "+ suits); break;
		case 6: println("Six of "+ suits); break;
		case 7: println("Seven of "+ suits); break;
		case 8: println("Eight of "+ suits); break;
		case 9: println("Nine of "+ suits); break;
		case 10: println("Ten of "+ suits); break;
		case 11: println("Jack of "+ suits); break;
		case 12: println("Queen of "+ suits); break;
		case 13: println("King of "+ suits); break;
		default: break;
		}
		
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}