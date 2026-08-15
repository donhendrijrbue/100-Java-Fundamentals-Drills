package javaVariablesAndDataTypes;

// Problem #5: Write a program to demonstrate type casting (int double, double int).
/* Expected Output: 
Original int: 56
After converting int to double: 56.0
Original double: 12.75
After converting double to int: 12
*/

public class TypeCastingDemo {
	public static void main(String[] args) {
		//Declaration
		int intNum = 56;
		double doubleNum = 12.75;
		// int to double
		double convertedDouble = intNum;
		// double to int
		int convertedInt = (int) doubleNum;
		// Output, Print results
		System.out.println("Original int: " + intNum);
		System.out.println("After converting int to double: " + convertedDouble);
		System.out.println("Original double: " + doubleNum);
		System.out.println("After converting double to int: " + convertedInt);
		}
// Discussion: This program demonstrates type casting between int and double. An integer is automatically promoted to a double (widening conversion), while converting a double to an int requires explicit casting (narrowing conversion).
}
