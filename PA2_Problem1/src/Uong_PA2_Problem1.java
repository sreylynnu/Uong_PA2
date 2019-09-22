import java.util.Scanner;

public class Uong_PA2_Problem1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Declaring integer variables for each digit of the four-digit integer and its encryption version.
		
		int digitOne;
		int digitTwo;
		int digitThree;
		int digitFour;
		
		int encryptOne;
		int encryptTwo;
		int encryptThree;
		int encryptFour;

		char userResponse;
		
		System.out.println("Hello!");
		System.out.println("This program will encrypt your four-digit integer for you.");
		
		// Prompts user to enter each digit of their four-digit integer.
		
		System.out.println("Please enter the first digit:");
		digitOne = scnr.nextInt();
		
		System.out.println("Please enter the second digit:");
		digitTwo = scnr.nextInt();
		
		System.out.println("Please enter the third digit:");
		digitThree = scnr.nextInt();
		
		System.out.println("Please enter the fourth digit:");
		digitFour = scnr.nextInt();
		
		System.out.println("Thank you!");
		
		// Digits that the user entered will go through the encryption algorithm
		// And the value will be put into the digit's encrypt variable
		
		encryptOne = digitOne + 7;
		encryptOne = encryptOne % 10;

		encryptTwo = digitTwo + 7;
		encryptTwo = encryptTwo % 10;

		encryptThree = digitThree + 7;
		encryptThree = encryptThree % 10;

		encryptFour = digitFour + 7;
		encryptFour = encryptFour % 10;
		
		// Prints out the encrypted integer to the user and then asks user if they want to decrypt that integer
		
		System.out.println("Your encrypted integer is now " + encryptThree + encryptFour
				+ encryptOne + encryptTwo + ".");
		
		System.out.println("Would you like to decrypt your integer? (Type Y or N)");
	
		do {
			userResponse = scnr.next().charAt(0);
			
			if (userResponse == 'Y') {
				System.out.println("Your decrypted integer is " + digitOne + digitTwo + digitThree + digitFour + ".");
			}
			else if (userResponse == 'N') {
				System.out.println("Bye!");
			}
		}
		while ((userResponse != 'Y') || (userResponse != 'N'));
					
		scnr.close();
	}

}
