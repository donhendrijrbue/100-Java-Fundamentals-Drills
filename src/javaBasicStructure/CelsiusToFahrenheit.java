package javaBasicStructure;

// Problem #9: Write a program to convert Celsius to Fahrenheit.
// Expected Output: [Fahrenheit Value] - with your inputted Celsius.

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		
		//Input 
		double celsius=23.5; 
		double fahrenheit= celsius * 9/5 + 32;
		
		 //Output 
		System.out.println(celsius + "C = " + fahrenheit + "F");
			
	}
// Discussion: This program converts a temperature from Celsius to Fahrenheit using the formula F = (C × 9/5) + 32. 
}
