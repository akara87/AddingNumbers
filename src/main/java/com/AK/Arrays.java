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
public class Arrays {

	// String variable for application Name
	private static String appName = "Arrayss Applications";

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
		displayCharArray();
		displayIntArray();
		// call the calculateGrade method
		printSizeArray();
		printStringArray();
		System.out.println("thanks for using this application : " + username);
	}

	/**
	 * Write a Java program which prints out a count from 1 to 100 , than prints
	 * the numbers 200 -100 and finally prints 10-1000 with only numbers evenly
	 * divided by 10. use the for loop to do these and do not use the % operator
	 */
	private static void displayCharArray() {
		// m1
		char[] myChar = new char[3];
		myChar[0] = 'A';
		myChar[1] = 'B';
		myChar[2] = 'C';
		// m2
		char[] myChar2 = new char[] { '1', '2', '3' };
		// m3
		char myChar3[];
		myChar3 = new char[3];
		myChar3[0] = 'x';
		myChar3[1] = 'y';
		myChar3[2] = 'z';
		for (char c : myChar) {
			System.out.println(c);
		}
		int i = 0;
		while (i < myChar2.length) {
			System.out.println(myChar2[i]);
			i++;
		}
		for (int j = 0; j < myChar3.length; j++) {
			System.out.println(myChar3[j]);
		}
		System.out.println();
	}

	private static void displayIntArray() {
	}

	private static void printSizeArray() {
	}

	private static void printStringArray() {
	}
	/*
	 * Write a Java program which prints all even number from 1 to 100 , then
	 * all odd numbers between 300 and 400, and finally prints 30-333 with only
	 * numbers evenly distributes by 3. use a while loop for this exercise . you
	 * will also want to use an if conf and use the % operator to check if
	 * anumber % 2 is equal to 0 and print it if what is the case.
	 */
}
