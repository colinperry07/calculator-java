package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		boolean calcOn = true;
		boolean calcLooped = false;
		Double result = null; // Defines the result of the calculators previous equation
		
		while (calcOn) {
			char operator;
		    Double number1 = null, number2;
		    String ccText;
		    boolean isAnswered = false; // Variable that defines if the end prompt has been answered
		    boolean num1Found = false;
		    
		    while (!num1Found) {
		    	if (!calcLooped) { // During the calculators first run, this runs
			    	System.out.println("Enter first number:");
				    number1 = input.nextDouble();
				    num1Found = true;
			    } else { // This code runs after the calculators first run
			    	System.out.println("Enter new number or ans (for previous answer):");
			    	
			    	String userInput = input.next(); // Takes input as a string
			    	
			    	switch (userInput.toLowerCase()) {
				    	default: // Runs if user inputs a number and not "ans"
				    		try {
				    			number1 = Double.parseDouble(userInput);// Converts the string input to a double
				    		} catch (Exception e){
				    			System.out.println("Something went wrong...");
				    			break;
				    		}
				    		num1Found = true;
				    		break;
				    	case "ans":
				    		number1 = result; 
				    		System.out.println(number1);
				    		num1Found = true; // Disables the loop to move on to the next prompt
				    		break;
			    	}
			    }
		    }
		    
		    
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0); // Only returns token of the first character in the input
		    
		    System.out.println("Enter second number:");
		    number2 = input.nextDouble();
		    
		    switch (operator) {
		    
			    case '+':
			    	result = number1 + number2;
			    	System.out.println(number1 + " + " + number2 + " = " + result);
			    	break;
			    case '-':
			    	result = number1 - number2;
			    	System.out.println(number1 + " - " + number2 + " = " + result);
			    	break;
			    case '*':
			    	result = number1 * number2;
			    	System.out.println(number1 + " * " + number2 + " = " + result);
			    	break;
			    case '/':
			    	result = number1 / number2;
			    	System.out.println(number1 + " / " + number2 + " = " + result);
			    	break;
			    default:
			    	System.out.println("Invalid operator!");
			    	break;
		    }
		    
		    while (!isAnswered) { // Checks to see if the program can run again
		    	System.out.println("Continue? (y or n)");
			    ccText = input.next();
		    	switch (ccText.toLowerCase()) {
			    default: 
			    	// If the user enters an invalid response, the question repeats until they enter a valid response
			    	System.out.println("Answer unrecognized, please enter a valid response...");
			    	isAnswered = false;
			    	break;
			    case "y":
			    	calcLooped = true; // Identifies that this will make the calculator looped
			    	isAnswered = true;
			    	break;
			    case "n":
			    	// If the user does not wish to continue, the program stops
			    	System.out.println("Calculator shutting down...");
			    	isAnswered = true;
			    	calcOn = false;
			    	break;
			    }
		    }
		    
		}
	    
		input.close();
	    
	}
}
