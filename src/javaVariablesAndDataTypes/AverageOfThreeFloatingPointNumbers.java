package javaVariablesAndDataTypes;
import java.util.Scanner;

// Problem #9: Write a program to compute the average of three floating-point numbers.
/*Expected Output: 
Enter 1st number: 40.50
Enter 2nd number: 32.98
Enter 3rd number: 55.90
Average = 43.126666666666665
 */

public class AverageOfThreeFloatingPointNumbers {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		// Declaration
		double num1, num2, num3, average;
		// Input
		System.out.print("Enter 1st number: ");
		num1 = data.nextDouble();
		System.out.print("Enter 2nd number: ");
		num2 = data.nextDouble();
		System.out.print("Enter 3rd number: ");
		num3 = data.nextDouble();
		// Process
		average = (num1 + num2 + num3) / 3.0;
		// Output
		System.out.println("Average = " + average);
		data.close();
		}
}
