package javaVariablesAndDataTypes;
import java.util.Scanner;

// Problem #7: Write a program that stores a student's details (name, age, grade) in variables. and prints them.
/*Expected Output:
 Enter Name: Henry Jr Bue
Enter Age: 19
Enter Grade: 1.75
===Output===
Student: Henry Jr Bue | Age: 19 | Grade: 1.75
*/

public class StudentDetails {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		// Declaration
		String name;
		int age;
		double grade;
		// Input
		System.out.print("Enter Name: ");
		name = data.nextLine();
		System.out.print("Enter Age: ");
		age = data.nextInt();
		System.out.print("Enter Grade: ");
		grade = data.nextDouble();
		// Output
		System.out.println("===Output===");
		System.out.println("Student: " + name + "| " + "Age: " + age + " | " + "Grade: " + grade);
		data.close();
		}
// Discussion: This program stores a student’s details such as name, age, and grade using appropriate variables and prints them to the console.
}
