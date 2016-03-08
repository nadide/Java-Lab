//************************************************************
//Grades.java
//
//Use Student class to get test grades for two students
//and compute averages
//
//************************************************************

public class Grades {
	public static void main(String[] args) {
		Students student1 = new Students("Mary");
		Students student2 = new Students("Mike");
		double average;

		// input grades for Mary
		student1.inputGrades();

		// print average for Mary
		average = student1.getAverage();
		System.out.println("The average for " + student1.getName() + " is "
				+ average);

		System.out.println("Student 1: \t" + student1);

		// input grades for Mike
		student2.inputGrades();

		// print average for Mike
		average = student2.getAverage();
		System.out.println("The average for " + student2.getName() + " is "
				+ average);

		System.out.println("Student 2: \t" + student2);
	}
}