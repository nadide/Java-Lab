import java.util.Scanner;


public class Palindrome {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i, n = str.length();
		
		for (i=0; i<n/2; i++)
			if (str.charAt(i) != (str.charAt(n-i-1)) ) {
				System.out.println("Not palindrome");
				break;
			}
		if (i == n/2)
			System.out.println("Palindrome");
	}

}
