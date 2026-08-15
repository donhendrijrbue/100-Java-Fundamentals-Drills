package javaBasicStructure;

// Problem #10: Write a program to print your initials in a triangular pattern.
// Expected Output: [Tree like initials]

public class InitialsTriangularPattern {
	public static void main(String[] args) {
        //Declaration, inputting initials
        String initials = "HJCB"; 

        //Process
        for (int i = 0; i < initials.length(); i++) {
         
            for (int j = 0; j <= i; j++) {
                System.out.print(initials.charAt(i) + " ");
            }
            
            //Output
            System.out.println();
        }
    }
// Discussion: This program prints a user’s initials in a triangular pattern using nested for loops. 
}
