package javaVariablesAndDataTypes;

// Problem #8: Write a program to check whether a given number is even or odd.
// Expected Output: Number: 8 = Even
public class OddEven {
	public static void main(String[] args) {
		//Declaration
		int n =8, r=0;
		//Using if-else statements
		if (n % 2 == 0) {
		System.out.println("Number: " + n + " = Even");
		} else {
		System.out.println("Number: " + n + " = Odd");
		}
		}
// Discussion: This program checks if a number is divisible by 2 using the modulus operator (%). If the remainder is zero, the number is even; otherwise, it is odd.
}
