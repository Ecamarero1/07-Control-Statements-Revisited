/*
*	RadiactiveDacay.java
*
*	Calculate the possibility (about 50%) of 
*	decay of radioactive atoms
*/

import acm.program.*;
import acm.util.*;

public class RadiactiveDecay extends ConsoleProgram {

	public void run() {
		
		int count=0;
		int n =10000;
		println("There are " + n + " atoms initially");
		
		while(true){	
			int decay = decayAtoms(n);
			count++;
			n = decay;
			if (decay == 0){
				println("There are " + decay + " atoms at the end of year " + count);
				break;
			}
			if (decay < 0) break;		
			println("There are " + decay + " atoms at the end of year " + count);
		}				
	}	
	private int decayAtoms(int n){
			
		int result = 0;
		for(int i= n; i >=1; i--){
			int decay = rgen.nextBoolean(0.5) ? 1 : 0;
			if (decay == 1){
				result ++;				
			} 		
		}
		return result;
	}
		
	private RandomGenerator rgen = new RandomGenerator();
}