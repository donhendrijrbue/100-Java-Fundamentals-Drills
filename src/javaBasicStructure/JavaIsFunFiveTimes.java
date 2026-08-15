package javaBasicStructure;

// Problem #5: Write a program to print "Java is fun!" five times.
/*Expected Output: 
Java is Fun!
Java is Fun!
Java is Fun!
Java is Fun!
Java is Fun!
*/

public class JavaIsFunFiveTimes {
	public static void main(String[] args) {
		//Declaration
		int fun =0; 
		
		//Process, Output
		while (fun < 5) {
			System.out.println("Java is Fun!"); 
			fun++; 
		}
	}
// Discussion: This program uses a while loop to repeatedly print the phrase "Java is Fun!" five times. It illustrates iteration and loop control in Java by incrementing a counter until the condition is no longer true.
}
