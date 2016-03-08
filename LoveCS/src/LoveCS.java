//****************************************************************
//LoveCS.java
//
//Use a while loop to print many messages declaring your
//passion for computer science
//****************************************************************
import java.util.Scanner;

public class LoveCS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit, sum = 0;
		int count = 1;

		limit = scan.nextInt();
		while (count <= limit) {
			sum += count;
			System.out.println(count + " I love Computer Science!!");
			count++;
		}
		System.out.println("Printed this mesage " + (count - 1)
				+ " times. The sum of the numbers from 1 to " + limit + " is "
				+ sum);
	}
}