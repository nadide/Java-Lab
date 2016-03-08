//************************************************************
// IntegerClass.java	
//
// Understanding Integer class
//************************************************************
import java.util.Scanner;

public class IntegerClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer num;
		String number1, number2;

		System.out.println("Please enter an integer: ");
		num = scan.nextInt();

		System.out.println("Binary: " + num.toBinaryString(num));
		System.out.println("Hex:    " + num.toHexString(num));
		System.out.println("Octal:  " + num.toOctalString(num));

		System.out.println("Max value: " + Integer.MAX_VALUE);
		System.out.println("Min value: " + Integer.MIN_VALUE);

		System.out.println("Please enter two decimal integers: ");
		number1 = scan.next();
		number2 = scan.next();
		System.out.println("Sum: "
				+ (Integer.valueOf(number1) + Integer.valueOf(number2)));

	}
}