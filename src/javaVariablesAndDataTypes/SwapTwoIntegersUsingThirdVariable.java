package javaVariablesAndDataTypes;

// Problem #2: Write a program to swap two integers using a third variable.
/*Expected Output: Before swapping: a = 10, b = 20 
After swapping: a = 20, b = 10
*/

public class SwapTwoIntegersUsingThirdVariable {
	public static void main(String[] args) {
		//Declaration
		int a = 10;
		int b = 20;
		//Before
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		// Process: swapping using a third variable
		int temp = a;
		a = b;
		b = temp;
		//After
		System.out.println("After swapping: a = " + a + ", b = " + b);
		}
// Discussion: This program demonstrates how to swap the values of two integers by using a temporary variable.
}
