public class Calculator {
	// array of size one to store the result from each operation
	static double[] result = new double[1];
	public double[] addNumbers(double[] numbers){
		result[0] = numbers[0] + numbers[1];
		return result;
	}
	public double[] subtractNumbers(double[] numbers){
		result[0] = numbers[0] - numbers[1];
		return result;
	}
	public double[] multiplyNumbers(double[] numbers){
		result[0] = numbers[0] * numbers[1];
		return result;
	}
	public double[] divideNumbers(double[] numbers){
		result[0] = numbers[0] / numbers[1];
		return result;
	}
	public double[] sumAllNumbers(double[] numbers){
		result[0] = 0;
		for (int i = 0; i < numbers.length; i++){
			result[0] += numbers[i];
		}
		return result;
	}
	public double[] mean(double[] numbers){
		// calling the sumAllNumbers method from the same class
		result = sumAllNumbers(numbers);
		result[0] = result[0]/numbers.length;
		return result;
	}
	public double[] variance(double[] numbers){
		// easier to use result from the method mean()
		double mean = mean(numbers)[0];
		result[0] = 0;
		for (int i = 0; i < numbers.length; i++){
			// Math.pow(a, b) calculates a to the power of b 
			result[0] += Math.pow((numbers[i] - mean), 2);
		}
		result[0] = result[0]/numbers.length;
		return result;
	}
	public double[] standardDeviation(double[] numbers){
		// easier to use result from the method variance()
		double var = variance(numbers)[0];
		// Math.sqrt(a) calculates the square root of a
		result[0] = Math.sqrt(var);
		return result;
	}
}
		