# Java_Calculator_Program
The following java program consists of three classes: Main, UserInput and Calculator

The Main class acts as a user interface, where the user can
- choose to enter two or multiple numbers
- see a menu displaying which operations can be done
- select one operation to be performed
- choose to run the program again

input and calc are instances of the classes UserInput() and Calculator() respectively

The UserInput class uses both Scanner and BufferedReader
The methods used are:
- enterTwoNumbers():
 
Scanner is used to take in 2 numbers of double type

The numbers are then stored in an array

- enterMultipleNumbers(): 

BufferedReader is used to take in a string of numbers

The string is then split at every space and converted to an array of type double using Double.parseDouble()

The Calculator class handles the mathematical operations

For 2 numbers, the methods used are:
- addNumbers(): sum of two numbers is returned
- subtractNumbers(): difference of two numbers is returned
- multiplyNumbers(): product of two numbers is returned
- divideNumbers(): quotient of two numbers is returned

For multiple numbers, the methods used are:
- sumAllNumbers(): sum of all numbers is returned
- mean(): mean of all numbers is returned
- variance(): variance of all numbers is returned
- standardDeviation(): standard deviation of all numbers is returned

In Calculator, the default Math package is class is used
- variance() uses Math.pow to square the difference between the numbers and mean
- standardDeviation() uses Math.sqrt to calculate the square root of the variance
