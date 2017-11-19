/*
* File: Craps.java
* ----------------
* This program plays the casino game of Craps. At the beginning of
* the game, the player rolls a pair of dice and computes the total.
* If the total is 2, 3, or 12 (called "craps"), the player loses.
* If the total is 7 or 11 (called a "natural"), the player wins.
* If the total is any other number, that number becomes the "point."
* From here, the player keeps rolling the dice until (a) the point
* comes up again, in which case the player wins or (b) a 7 appears,
* in which case the player loses. Note that the numbers 2, 3, 11,
* and 12, no longer have special significance after the first roll.
*/

import acm.program.*;
import acm.util.*;

public class Craps extends ConsoleProgram {
	
	public void run (){
		
		int total = rollTwoDice();
		if (total == 7 || total== 11){
			println("That's a natural, you win");
		} else if (total == 2 || total==3 || total== 12) {
			println("Thas's a craps, you lose.");
		} else {
			int point = total;
			println("Your point is " + point);
			while(true){
				total =rollTwoDice();
				if (total == point){
					println("You make your point, you win.");
					break;
				} else if (total == 7) {
					println("That's a 7, you lose.");
					break;
				}	
				
			}
		}
	}
	
	
	private int rollTwoDice(){
		
		int d1 = rgen.nextInt(1, 6);
		int d2 = rgen.nextInt(1, 6);
		int total = d1 + d2;
		println (d1 + " + " + d2 + " = " + total);
		return total;
	}
		
	
	private RandomGenerator rgen = new RandomGenerator(); 
}