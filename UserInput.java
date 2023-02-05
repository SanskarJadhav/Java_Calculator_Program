import java.util.Scanner;
import java.io.*;

public class UserInput{
	// Scanner can be used for single inputs (when entering 2 numbers each)
	Scanner scan = new Scanner(System.in);
	// BufferedReader handles a stream of inputs (useful for array of numbers)
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// storing numbers in an array of type double and size 2
	double[] numbers = new double[2];
	public double[] enterTwoNumbers(){
		System.out.println("Enter first number: ");
		// to read a number of type double
		numbers[0] = scan.nextDouble();
		System.out.println("Enter second number: ");
		numbers[1] = scan.nextDouble();
		return numbers;
	}
	public double[] enterMultipleNumbers(){
		System.out.println("Enter Size of Array: ");
		int size = scan.nextInt();
		// to create an array with size entered by the user
		double array[] = new double[size];
		// handling IOexception with try catch
		try{
			// to read a line of inputs
			String str = br.readLine();
			// divides a string separated by spaces into an array
			String[] array_numbers = str.trim().split("\\s+");
			// slash is an escape character
			for(int i = 0; i < size; i++){
				// converting every string in the array to a double
				array[i] = Double.parseDouble(array_numbers[i]);
			}
		} catch (IOException e) {
			// for diagnosing exceptions
			e.printStackTrace();
		}
		return array;
	}	
}
