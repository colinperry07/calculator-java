package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Creates a new object using the java.util.Scanner package
		// (System.in) references the InputStreamReader class for the Scanner class object
		Scanner input = new Scanner(System.in); 
		
		// Defines the variables
	    char operator;
	    Double number1, number2, result;
		
	    // Takes first number as input
	    System.out.println("Enter first number:");
	    number1 = input.nextDouble();
	    
	    // Takes operator as input
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    
	    // Takes second number as input
	    System.out.println("Enter second number:");
	    number2 = input.nextDouble();
	    
	    // Acts as a more refined alternative to multiple if/else if... statements
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
	    
	    input.close(); // Tbh not sure what this does, just know that it gives me a warning if I don't
	    
	}
}
