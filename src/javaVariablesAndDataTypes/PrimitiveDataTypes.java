package javaVariablesAndDataTypes;

// Problem #1: Declare variables of all primitive data types and print them.
/*Expected Output:
byte: 100
short: 20000
int: 100000
long: 10000000000
float: 3.14
double: 3.14159265359
char: A
boolean: true
*/

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		// Primitive data types in Java
		byte b = 100; // 8-bit integer
		short s = 20000; // 16-bit integer
		int i = 100000; // 32-bit integer
		long l = 10000000000L; // 64-bit integer
		float f = 3.14f; // 32-bit floating point
		double d = 3.14159265359; // 64-bit floating point
		char c = 'A'; // 16-bit Unicode character
		boolean bool = true; // 1-bit (true/false)
		// Printing all variables
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		System.out.println("boolean: " + bool);
		}
// Discussion: This program demonstrates Java’s eight primitive data types by declaring variables for each and printing their values to the console.
}
