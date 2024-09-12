package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Creates a new object using the java.util.Scanner package
		// (System.in) references the InputStreamReader class for the Scanner class object
		Scanner input = new Scanner(System.in); 
		boolean calcOn = true;
		boolean calcLooped = false;
		Double result = null;
		boolean isAnswered = false;
		
		while (calcOn) {
			// Defines the variables
			char operator;
		    Double number1 = null, number2;
		    String ccText;
		    
		    boolean resultFound = false;
		    
		    while (!resultFound) {
		    	if (!calcLooped) {
			    	System.out.println("Enter first number:");
				    number1 = input.nextDouble();
				    resultFound = true;
			    } else {
			    	System.out.println("Enter new number or ans (for previous answer):");
			    	
			    	String userInput = input.next(); // Takes input as a string
			    	
			    	switch (userInput.toLowerCase()) {
				    	default:
				    		try {
				    			number1 = Double.parseDouble(userInput); // Converts the string input to a double
				    		} catch (Exception e){ // if anything except for Ans/ANs/ANS/ans, will give error
				    			System.out.println("Something went wrong...");
				    			break;
				    		}
				    		break;
				    	case "ans":
				    		number1 = result;
				    		System.out.println(number1);
				    		resultFound = true;
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
		    
		    while (!isAnswered) {
		    	System.out.println("Continue? (y or n)");
			    ccText = input.next();
		    	switch (ccText.toLowerCase()) {
			    default: 
			    	// If the user enters an invalid response, the question repeats until they enter a valid response
			    	System.out.println("Answer unrecognized, please enter a valid response...");
			    	isAnswered = false;
			    	break;
			    case "y":
			    	// If the user wishes to continue, the program will loop back around with a new input prompt
			    	calcLooped = true;
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
