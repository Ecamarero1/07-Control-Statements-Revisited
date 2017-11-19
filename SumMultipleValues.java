/* A program that reads multiple values from the user, then sums
 * them together.
 */
import acm.program.*;

public class SumMultipleValues extends ConsoleProgram {	
	/* The number of values to read. */
	private static final int NUM_VALUES = 5;
	
	public void run() {
		int total = 0;
		for (int i = 0; i < NUM_VALUES; i++) {
			int nextValue = readInt("Enter next value: ");
			
			/* Update the total to factor in this new value. */
			total += nextValue;
		}
		
		println("The total is " + total);
	}
}
