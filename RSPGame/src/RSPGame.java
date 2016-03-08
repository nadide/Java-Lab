//************************************************************
//Rock.java
//
//Play Rock, Paper, Scissors with the user
//************************************************************
import java.util.Scanner;
import java.util.Random;

public class RSPGame {
	public static void main(String[] args) {
		String personPlay; // User's play -- "R", "P", or "S"
		String computerPlay=""; // Computer's play -- "R", "P", or "S"
		int computerInt; // Randomly generated number used to determine
							// computer's play
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		// Get player's play -- note that this is stored as a string
		System.out.println("Enter your play: R, P, or S");
		personPlay = scan.nextLine();

		// Make player's play uppercase for ease of comparison
		personPlay.toUpperCase();

		// Generate computer's play (0,1,2)
		computerInt = generator.nextInt(3);

		// Translate computer's randomly generated play to string
		switch (computerInt) {
		case 0:
			computerPlay = "R";
			break;
		case 1:
			computerPlay = "S";
			break;
		case 2:
			computerPlay = "P";
		}

		// Print computer's play
		System.out.println("Computer play is " + computerInt);

		// See who won. Use nested ifs instead of &&.
		if (personPlay.equals(computerPlay))
			System.out.println("It's a tie!");
		else if (personPlay.equals("R") && computerPlay.equals("S"))
			System.out.println("Rock crushes scissors. You win!!");
		else if (personPlay.equals("S") && computerPlay.equals("P"))
			System.out.println("Scissor cuts papers. You win!!");
		else if (personPlay.equals("P") && computerPlay.equals("R"))
			System.out.println("Paper wraps rocks. You win!!");
	}
}