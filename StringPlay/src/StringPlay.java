//**************************************************
//StringPlay.java
//
//Play with String objects
//**************************************************

public class StringPlay {
	public static void main(String[] args) {
		String college = new String("PoDunk College");
		String town = new String("Anytown, USA");
		int stringLength;
		String change1, change2, change3;

		stringLength = college.length();
		System.out.println(college + " contains " + stringLength
				+ " characters.");

		change1 = college.toUpperCase();
		change2 = college.toUpperCase().replace('O', '*');
		change3 = college.concat(town);
		System.out.println("The final string is " + change3);
	}
}