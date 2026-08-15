
package javaVariablesAndDataTypes;
import java.util.Scanner; // USE THIS IMPORT, IT LET YOUR PROGRAM RECIEVES INPUT FROM THE KEYBOARD

// Problem #6: Write a program to calculate simple interest.
/*Expected Output: 
Enter Principal Amount: 430
Enter Annual Interest Rate (%): 5
Enter Time (in years): 8
Simple Interest = 172.0
 */
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declaration
		double principal, rate, time, interest;
		
		// Input
		System.out.print("Enter Principal Amount: ");
		principal = input.nextDouble();
		System.out.print("Enter Annual Interest Rate (%): ");
		rate = input.nextDouble();
		System.out.print("Enter Time (in years): ");
		time = input.nextDouble();
		// Process: Simple Interest formula
		interest = (principal * rate * time) / 100;
		// Output
		System.out.println("Simple Interest = " + interest);
		input.close();
		}
}
