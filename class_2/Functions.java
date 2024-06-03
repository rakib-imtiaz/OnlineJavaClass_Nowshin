package class_2;

import java.util.Scanner;

public class Functions {

	/*
	 * 
	 * Enter student name _1 : Nowshin Enter student name _2 : rakib Enter student
	 * name _3 : nafisa
	 * 
	 * Enter marks_no_1: 34 Enter marks_no_2: 70 Enter marks_no_3: 100
	 * 
	 * 
	 * 
	 * Nowshin got : F rakib got : B nafisa got : A
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String std_1;
		String std_2;
		String std_3;

		double std_1_marks;
		double std_2_marks;
		double std_3_marks;

		System.out.println("Enter student _1 Name : ");
		std_1 = scan.nextLine();

		System.out.println("Enter student _2 Name : ");
		std_2 = scan.nextLine();

		System.out.println("Enter student _3 Name : ");
		std_3 = scan.nextLine();

		System.out.println("Enter " + std_1 + " Marks");
		std_1_marks = scan.nextDouble();

		System.out.println("Enter " + std_2 + " Marks");
		std_2_marks = scan.nextDouble();

		System.out.println("Enter " + std_3 + " Marks");
		std_3_marks = scan.nextDouble();
		
		
		
	
		System.out.println(std_1+" GOT: ");
		grade(std_1_marks);
		
		System.out.println(std_2+" GOT: ");
		grade(std_2_marks);
		
		System.out.println(std_3+" GOT: ");
		grade(std_3_marks);
		
		

		/*
		 * 
		 * 100-90 = A 70-89 = B 40-69 = c <40 =F
		 * 
		 * 
		 * 
		 * 
		 */

		
	}

	 static void grade(double marks) {
		if (marks >= 90 && marks <= 100) {
			System.out.println("A");
		} else if (marks <= 89 && marks >= 70) {
			System.out.println("B");
		} else if (marks >= 40 && marks < 70) {

			System.out.println("C");

		} else {
			System.out.println("F");
		}

	}
	
}
