/*
*	ConsecutiveHeads.java
*	
*	This program flip coins until tree heads 
*	Appear consecutively
*
*/

import acm.program.*;
import acm.util.RandomGenerator;

public class ConsecutiveHeads extends ConsoleProgram {
	
	public void run() {
		
		int count = 0;
		int totalcount = 0;
		while(count != 3){
			int result = rgen.nextBoolean() ? 1 : 2;
			totalcount ++;
			if (result == 1){
				println("Heads.");
				count++;
			}else {
				println("Tails.");
				count = 0;
			}		
		}
		println("It took " + totalcount +  " flips to get 3 consecutive heads. ");					
	}
	private RandomGenerator rgen = new RandomGenerator();
}