import java.util.Scanner;


public class EvenOddNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%2 == 1)
			System.out.println("Odd number");
		else
			System.out.println("Even number");
	}

}
