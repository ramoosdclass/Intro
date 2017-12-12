package switchCasw;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter number 1: ");
		int num1 = new Scanner(System.in).nextInt();
		
		System.out.println("Please enter number 2: ");
		int num2 = new Scanner(System.in).nextInt();
		
		System.out.println("Please enter an operation to be performed: ");
		String operator = new Scanner(System.in).nextLine();
		
		Calculate(num1, num2, operator);
		
	}



public static void Calculate(int num1, int num2, String operation) {
	int result;
	switch(operation) {
	case "+":
		result = num1+ num2;
		System.out.println("The sum is " + result);
		break;
	case "-":
		result = num1 - num2;
		System.out.println("The difference is " + result);
		break;
	case "*":
		result = num1 * num2;
		System.out.println("The product is " + result);
		break;
	case "/":
		result = num1 / num2;
		System.out.println("The quoitent is " + result);
		break;
	default:
		if(num1 > 2) {
		System.out.println("Please enter a valid operator" 
	+ "Example: +, - , * , /");
		}	
	}
}
	
}
