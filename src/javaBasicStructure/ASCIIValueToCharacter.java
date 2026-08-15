package javaBasicStructure;

// Problem #7: Write a program to display the ASCII value of a character.
// Expected Output: [Character] to [Number]

public class ASCIIValueToCharacter {
public static void main(String[] args) {
        
        //Declaration
        char ch = 'A';   
        
        //Process
        int asciiValue = (int) ch;  // convert to ASCII
        
        //Output
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
// Discussion: This program declares a character variable and converts it into its ASCII value by type casting.
}
