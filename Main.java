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
				    			System.out.println("Invalid Input!");
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
		    operator = input.next().charAt(0);
		    
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
		    
		    System.out.println("Continue? (y or n)");
		    ccText = input.next();
		    
		    switch (ccText.toLowerCase()) {
		    default:
		    	System.out.println("Answer unrecognized, shutting down...");
		    	calcOn = false;
		    case "y":
		    	calcLooped = true;
		    	break;
		    case "n":
		    	System.out.println("Calculator shutting down...");
		    	calcOn = false;
		    }
		}
	    
		input.close();
	    
	}
}
