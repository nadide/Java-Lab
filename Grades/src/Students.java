//************************************************************
//Students.java
//
//Define a student class that stores name, score on test 1, and
//score on test 2. Methods prompt for and read in grades,
//compute the average, and return a string containing student's info.
//************************************************************

import java.util.Scanner;

public class Students {
	// declare instance data
	// ---------------------------------------------
	private String name;
	private Double test1;
	private Double test2;

	// constructor
	// ---------------------------------------------
	public Students(String studentName) {
		name = studentName;
	}

	// ---------------------------------------------
	// inputGrades: prompt for and read in student's grades for test1 and test2.
	// Use name in prompts, e.g., "Enter's Joe's score for test1".
	// ---------------------------------------------
	public void inputGrades() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter's " + name + "'s score for test 1");
		test1 = scan.nextDouble();
		System.out.println("Enter's " + name + "'s score for test 2");
		test2 = scan.nextDouble();
	}

	// ---------------------------------------------
	// getAverage: compute and return the student's test average
	// ---------------------------------------------
	public double getAverage() {
		return (test1 + test2) / 2;
	}

	// ---------------------------------------------
	// getName: print the student's name
	// ---------------------------------------------
	public String getName() {
		return name;
	}

	// ---------------------------------------------
	// toString: returns a string containing the student’s name and test scores
	// ---------------------------------------------
	public String toString() {
		return "Name: " + name + "\tTest1: " + test1 + "\tTest2: " + test2;
	}
}