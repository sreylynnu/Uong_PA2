import java.util.Scanner;

public class Uong_PA2_Problem2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userResponse;
		
		double inches;
		double pounds;
		double standardBMI;
		
		double centimeters;
		double meters;
		double kilograms;
		double metricBMI;
		
		System.out.println("Hello!");
		System.out.println("This program will calculate your BMI (Body Mass Index).");

		do {
			
			System.out.println("Do you want to measure in standard or metric?");
			System.out.println("(Type 1 for standard and 2 for metric)");
			
			userResponse = scnr.nextInt();
			
			if(userResponse == 1) {
				System.out.println("Okay! We will need a few information about you.");
				System.out.println("What is your height? (in inches)");
				inches = scnr.nextDouble();
				
				System.out.println("What is your weight? (in pounds)");
				pounds = scnr.nextDouble();
				
				standardBMI = ((703 * pounds) / Math.pow(inches, 2));
				
				System.out.printf("Your BMI is " + "%.1f" + ".", standardBMI);
				break;
			}
			else if (userResponse == 2) {
				System.out.println("Okay! We will need a few information about you.");
				System.out.println("What is your height? (in centimeters)");
				centimeters = scnr.nextDouble();
				
				System.out.println("What is your weight? (in kilograms)");
				kilograms = scnr.nextDouble();
				
				meters = centimeters / 100;
				
				metricBMI = ((kilograms) / Math.pow(meters, 2));
				
				System.out.printf("Your BMI is " + "%.1f" + ".", metricBMI);
				break;
			}	
		}
		while ((userResponse != 1) || (userResponse != 2));
		
		System.out.println("\n");
		System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	
		scnr.close();
	}
}
