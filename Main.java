// Sanskar Jadhav AIML B1 PRN 21070126076

import java.util.Scanner;
public class Main {
	static double[] numbers;
	static double[] result;
	public static void main(String[] args){
		// creating objects for classes in a uses-a-relationship
		UserInput input = new UserInput();
		Calculator calc = new Calculator();
		char choice;
		int run;
		// do while loop: run again until a condition is no longer satisfied
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Two Numbers or Multiple Numbers? 2/m");
			// to read a character
			choice = sc.next().charAt(0);
			if (choice=='2'){
				// calling an instance method
				numbers = input.enterTwoNumbers();
				System.out.println("\nMENU\n====");
				System.out.println("Type + for addition");
				System.out.println("Type - for subtraction");
				System.out.println("Type * for multiplication");
				System.out.println("Type / for division");
				char operator = sc.next().charAt(0);
				// creating a switch case for each input
				switch(operator){
					case '+':
						result = calc.addNumbers(numbers);
						System.out.println("Sum is " + result[0]);
						break;
					case '-':
						result = calc.subtractNumbers(numbers);
						System.out.println("Difference is " + result[0]);
						break;
					case '*':
						result = calc.multiplyNumbers(numbers);
						System.out.println("Product is " + result[0]);
						break;
					case '/':
						result = calc.divideNumbers(numbers);
						System.out.println("Quotient is " + result[0]);
						break;
					default:
						System.out.println("wrong input");
				}
			}
			// if user entered 'm' instead of '2'
			else{
				numbers = input.enterMultipleNumbers();
				System.out.println("\nMENU\n====");
				System.out.println("Type + for the sum of all numbers");
				System.out.println("Type m for the mean of all numbers");
				System.out.println("Type v for the variance of all numbers");
				System.out.println("Type s for the standard deviation of all numbers");
				char operator = sc.next().charAt(0);
				switch(operator){
					case '+':
						result = calc.sumAllNumbers(numbers);
						System.out.println("Sum is " + result[0]);
						break;
					case 'm':
						result = calc.mean(numbers);
						System.out.println("Mean is " + result[0]);
						break;
					case 'v':
						result = calc.variance(numbers);
						System.out.println("Variance is " + result[0]);
						break;
					case 's':
						result = calc.standardDeviation(numbers);
						System.out.println("Standard deviation is " + result[0]);
						break;
					default:
						System.out.println("wrong input");
				}
			}
			System.out.println("Run again? Yes - 1, No - 0");
			// to read an integer
			run = sc.nextInt();
		} while (run==1);
	}
}