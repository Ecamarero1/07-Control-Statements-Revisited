/*
*	textCardClass,java
*
*	Text for the new class Card.java
*
*/

import acm.program.*;
import acm.util.*;

public class textCardClass extends ConsoleProgram{
	
	public void run(){
		
		int i = rgen.nextInt(1, 13);
		int j = rgen.nextInt(1, 4);
		card a = new card(i, j);
		println(a);
		
		String rank = a.getRank();
		String suit = a.getSuit();
		println ("the rank is " + rank + " and the suit is " + suit);
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}