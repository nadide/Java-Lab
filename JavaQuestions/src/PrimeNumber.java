import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt();

		for (i = 2; i < n; i++)
			if (n % i == 0) {
				System.out.println("Not prime");
				break;
			}
		if (i == n)
			System.out.println("Prime");

	}

}
