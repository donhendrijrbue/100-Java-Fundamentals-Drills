package javaVariablesAndDataTypes;

// Problem #4: Write a program that calculates the area of a circle (use double).
// Expected Output: The area of a circle with radius 2.5 is 19.625.

public class AreaOfCircleUsingDoubles {
	public static void main(String[] args) {
		//Declaration
		double radius = 2.5, pi = 3.14, area=0;
		//Process
		area = pi * radius * radius;
		//Output
		System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
		}
// Discussion: This program computes the area of a circle using the formula area = π × radius × radius. It uses the double data type to handle decimal values accurately.
}
