//HEY THIS IS MY MIDTERM EXAM. I GOT PERFECT OF COURSE!

import java.util.Scanner;

public class Calculator{
	public static int addition(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	public static int subtract(int num1, int num2){
		int difference = num1 - num2;
		return difference;
	}
	public static int multiply(int num1, int num2){
		int product = num1 * num2;
		return product;
	}
	public static double divide(int num1, int num2){
		int quotient = num1 / num2;
		return quotient;
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter your second number: ");
		int secondNum = input.nextInt();
		System.out.println("Please choose an operator: \n1.Addition\n2.Subtraction\n3.Multiply\n4.Divide");
		int operator = input.nextInt();
		
		if (operator == 1){
		int result = addition(firstNum, secondNum);
		System.out.println(result);
		} else if (operator == 2) {
		int result1 = subtract(firstNum, secondNum);
		System.out.println(result1);	
		} else if (operator == 3){
		int result2 = multiply(firstNum, secondNum);
		System.out.println(result2);	
		} else if (operator == 4){
		double result3 = divide(firstNum, secondNum);
		System.out.println(result3);	
		} else{
		System.out.print("Invalid number");
		}
		
		
	}
}