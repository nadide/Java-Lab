import java.util.Scanner;

public class TrackSale {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int sold;
		
		System.out.println("Please enter band boosters' name: ");
		name = scan.nextLine();
		BandBooster booster1 = new BandBooster(name);
		name = scan.nextLine();
		BandBooster booster2 = new BandBooster(name);
		
		System.out.println("Enter the number of boxes sold by " + booster1.getName() + " this week:");
		sold = scan.nextInt();
		booster1.updateSales(sold);

		System.out.println("Enter the number of boxes sold by " + booster2.getName() + " this week:");
		sold = scan.nextInt();
		booster2.updateSales(sold);
		
		System.out.println("Enter the number of boxes sold by " + booster1.getName() + " this week:");
		sold = scan.nextInt();
		booster1.updateSales(sold);

		System.out.println("Enter the number of boxes sold by " + booster2.getName() + " this week:");
		sold = scan.nextInt();
		booster2.updateSales(sold);

		System.out.println(booster1.toString());
		System.out.println(booster2.toString());
	}
}
