/**
 * File Name: Fundamentals.java<br>
 * Akarapu, Sruthi<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 8, 2016
 */
package com.AK;

import java.util.*;

/**
 * Fundamentals //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Akarapu, Sruthi
 * @version 1.0.0
 * @since 1.0
 */
public class Loops {

	// String variable for application Name
	private static String appName = "Loops Applications";

	// Scanner object to capture input from user;
	private static Scanner scanner;

	// private static string username;
	private static String username;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initial Scanner object scanner
		scanner = new Scanner(System.in);
		// Greet the user
		System.out.println("Welcome to the " + appName);
		// Ask the user for their name
		System.out.println("could I please get your name?");
		// Capture the user name into the class variable username
		username = scanner.nextLine();
		// Farewell user by name
		// call the number greater method
		countRegNumbers();
		countDivNumbers();
		// call the calculateGrade method
		calculateGrade();
		System.out.println("thanks for using this application : " + username);
	}

	/**
	 * Write a Java program which prints the grade average for a user based on a
	 * user supplied set of grade values. Repeat execution until user has no
	 * more items to be graded. Use a do while for this exercise. You will also
	 * have to use two variables to hold the current accumulated grade points as
	 * well as the total number of grades entered so that the average will be
	 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
	 * Scanner, Integer.parseInt.
	 */
	private static void calculateGrade() {
	}
	/*
	 * Write a Java program which prints all even number from 1 to 100 , then
	 * all odd numbers between 300 and 400, and finally prints 30-333 with only
	 * numbers evenly distributes by 3. use a while loop for this exercise . you
	 * will also want to use an if conf and use the % operator to check if
	 * anumber % 2 is equal to 0 and print it if what is the case.
	 */

	/**
	 * Write a Java program which prints out a count from 1 to 100 , than prints
	 * the numbers 200 -100 and finally prints 10-1000 with only numbers evenly
	 * divided by 10. use the for loop to do these and do not use the % operator
	 */
	private static void countDivNumbers() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Print numbers 1 to 100: " + (i + 1));
			if ((i + 1) % 10 == 0) {
				System.out.println("..............");
			}
		}
		for (int i = 200; i >= 100; i--) {
			System.out.println("Print numbers 200 to 100: " + (i--));
		}
		for (int i = 10; i < 1000; i += 10) {
			System.out.println("Print numbers 200 to 100:" + (i));
			if ((i + 10) % 100 == 0) {
				System.out.println("..............");
			}
		}
	}

	private static void countRegNumbers() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + ",");
			}
		}
		System.out.println("\n");
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + ",");
			}
			System.out.print("\n");
		}
		for (int i = 300; i <= 400; i++) {
			if (i % 2 != 0) {
				System.out.println(" this is odd number: " + i);
			}
			for (int j = 33; j <= 333; j++) {
				if (j % 3 == 0) {
					System.out.println(" this is divisible by 3:" + i);
				}
			}
		}
	}
}
