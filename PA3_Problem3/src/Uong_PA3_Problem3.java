import java.util.Scanner;

public class Uong_PA3_Problem3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = new String[] {"Family", "Sleep", "Food" , "Politics", "Environment"};
		int [][] responses = new int[5][10];
		int [] average = new int[5];
		
		int i; 
		int j;
		
		int numPeople;
		int value;
		
		int highestPoints = 0;
		int lowestPoints = 0;
		
		String highestRatedTopic = "";
		String lowestRatedTopic = "";

		// Asks the user for how many people.
		
		System.out.println("How many people are rating the topics?");
		numPeople = scnr.nextInt();
		
		// Keep looping the ratings until everyone has had a chance to rate the topics.
		
		for (i = 0; i < numPeople; ++i) {
			System.out.println("Hello, Person " + (i+1) + "! Please enter your ratings for each topic.");
			for (j = 0; j < 5; ++j) {
				System.out.println("Rate " + topics[j] + " from 1 (least important) to 10 (most important)");
				do {
					value = scnr.nextInt();
				} 
				while ((value < 1) || (value > 10));
				
				responses[j][value-1]++;
			}
		}
		
		// Loop to get the highest/lowest points and topics.

		for (i = 0; i < 5; ++i) {
			
			//Makes sure that the average for each row is rest to zero every time we loop.
			
			average[i] = 0;
			
			// Loop that adds up all the total points from each column of the row.
			
			for (j = 0; j < 10; ++j) {
				average[i] = average[i] + (responses[i][j] * (j+1));
			}
			
			if(i == 0) {
				highestRatedTopic = topics[i];
				lowestRatedTopic = topics[i];			
				highestPoints = average[i];
				lowestPoints = average[i];			
			}
			
			// If the average for a topic is higher than the current average, then update
			// so that it is now the highestPoints.
			// Also make the topic of that average the highest rated topic.
				
			if(average[i] > highestPoints) {
				highestPoints = average[i];
				highestRatedTopic = topics[i];
			}
				
			//Same thing if the average for a topic is lower than the current average
				
			if (average[i] < lowestPoints) {
				lowestPoints = average[i];
				lowestRatedTopic = topics[i];
			}
			
			//Calculation of the average by dividing total points in each row by the number of people
			
			average[i] = (average[i] / numPeople);
		}
	
		
		//Displays the data in tabular form 
		
		//The number row on the top
		
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage");
		
		// Displaying the numbers by row and column
		
		for (i = 0; i < 5; ++i) {
			System.out.print(topics[i]);
			
			// Some extra tabs to make the table straight
			
			if(i == 0) {
				System.out.print("\t");
			}
			if(i == 1) {
				System.out.print("\t");
			}
			if(i == 2) {
				System.out.print("\t");
			}
			
			for(j = 0; j < 10; ++j) {
				System.out.print("\t" + responses[i][j]);
			}
			System.out.print("\t" + average[i]);
			System.out.print("\n");
		}

		// Prints out the topics with the highest points and lowest points
		
		System.out.print("\n");
		System.out.println(highestRatedTopic + " received the highest total points.");
		System.out.println(highestRatedTopic + " has " + highestPoints + " points.");
		System.out.print("\n");
		System.out.println(lowestRatedTopic + " received the lowest total points.");
		System.out.println(lowestRatedTopic + " has " + lowestPoints  + " points.");

		scnr.close();
	}
	
}
