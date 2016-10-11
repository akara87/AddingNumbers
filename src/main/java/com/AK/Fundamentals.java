/**
 * File Name: Fundamentals.java<br>
 * Akarapu, Sruthi<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 8, 2016
 */
package com.AK;

import java.util.*;

import com.AK.helpers.*;

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
public class Fundamentals {

	// String variable for application Name
	private static String appName = "Fundamentals Applications";

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
		numberGreater();
		monthChoice();
		// call the calculateGrade method
		calculateGrade();
		System.out.println("thanks for using this application : " + username);
	}

	private static void calculateGrade() {
		// to ask user for a set number of grades and then calculate grade
		// average, specify grade using if/else statements.
		int userNumber, totalGrades;
		double totalPoints = 0;
		double averageScore;
		totalGrades = Reqestinput.getInt("how many grades do you have to enter", 1, 10);
		for (int j = 0; j < totalGrades; j++) {
			totalPoints += Reqestinput.getInt("what is the value of grade" + j, 0, 100);
		}
		averageScore = totalPoints / totalGrades;
		if (averageScore > 90) {
			System.out.println("Your have passed with an A(" + averageScore + ")");
		} else if (averageScore > 80) {
			System.out.println("Your have passed with an B(" + averageScore + ")");
		} else if (averageScore > 70) {
			System.out.println("Your have passed with an C(" + averageScore + ")");
		} else if (averageScore > 60) {
			System.out.println("Your have passed with an D(" + averageScore + ")");
		} else if (averageScore > 50) {
			System.out.println("Your have passed with an E(" + averageScore + ")");
		} else {
			System.out.println("Fail");
		}
	}

	private static void monthChoice() {
		// TODO ask the user for a number, then state if it is
		// greater/leaserequa to 10 (is else)
		int userNumber;
		userNumber = Reqestinput.getInt("Please provide a month number", 1, 12);
		switch (userNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("Month number" + userNumber + " is not supported");
			break;
		}
	}

	private static void numberGreater() {
		/**
		 * todo ask the user for a month number, display this month related
		 * name, 1-12 (Switch statement)
		 */
		int userNumber;
		userNumber = Reqestinput.getInt("Please provide a number");
		// based on the number specify if it is greater then less then == 10
		if (userNumber > 10) {
			System.out.println(userNumber + " is greater than 10.");
		} else if (userNumber < 10) {
			System.out.println(userNumber + " is less than 10.");
		} else {
			System.out.println("Number is 10");
		}
	}
}
