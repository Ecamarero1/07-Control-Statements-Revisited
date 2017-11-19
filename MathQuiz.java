/*
*	MathQuiz.java
*	
*	Ask Randomly for 5 Math problems
*	if the answer is not correct for three times
*	the program gives you the answer and continue
*	with the next problem
*/

import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {
	
	private static final int NQUESTIONS = 5;
	
	public void run() {
		
		println("Wellcome to the math quiz!!!");
		
		for(int i = NQUESTIONS; i >= 1; i--){
			
			//Control that the sum of firtsNumber and SecondNumber is equal or less than 20.
			int firtsNumber = firtsNumber();
			int a = 20 - firtsNumber;
			int b = 0;
			int secondNumber = secondNumber(a , b);
			
			//Set the greater value in the first position.
			if (secondNumber > firtsNumber){
				int temp;
				temp = secondNumber;
				secondNumber = firtsNumber;
				firtsNumber = temp;
			}
			// Set the sign for the sum or substration.
			String sign = operationSing();
			
			int count= 0;
			while(true){
				questionsText(firtsNumber, sign, secondNumber);
				int answer = readInt();
				int result = questionOperation(firtsNumber, sign, secondNumber); 
				while(result != answer){
					println("That's incorrect - try a different answer: ");
					answer = readInt();
					count++;
					if (count == 2){
						println("No, the answer is. " + result);
						break;
					}
				}
				CongratsMessage(); break;
			}
		}
	}
	
	private int firtsNumber(){
			
		int firts = rgen.nextInt(0, 20);
		return firts;
	}
	
	private int secondNumber(int a, int b){
		
		int second = rgen.nextInt(a, b);
		return second;
	}
	
	private String operationSing(){
		
		String sign = rgen.nextBoolean(0.5) ? "+" : "-";
		return sign;
	}
	
	private int questionOperation(int a, String sign, int b){
		
		int solution;
		if (sign == "+"){
			solution = a + b;
		} else {
			solution = a - b;
		}
		return solution;
	}  
	
	private void questionsText (int a, String sign, int b){
		
		print("What is " + a + " " + sign + " " + b + " ?");
	}
	
	private void CongratsMessage(){
		
		int option = rgen.nextInt(0, 3);
		
		switch (option){
			case 0 : println("That's the answer!"); break;
			case 1 : println("Great answer!"); break;
			case 2 : println("You got it!"); break;
			case 3 : println("Correct!"); break;
			default: break;
		}
	}
	
	public RandomGenerator rgen = new RandomGenerator();
}