package sipe_p1;

import java.util.Scanner;

public class sipe_p2 
{
	public static void main(String[] args) 
	{
		// Declares new Scanner, some ints and a double.
		Scanner scnr = new Scanner(System.in);
		int userHeight, userWeight, userChoice;
		double userBMI;
		
		// Prompts the user for which System they want to use.
		System.out.println("Calculate your BMI using the Standard system or the Metric System:");
		System.out.println("Please enter the number 1 for Standard or enter the number 2 for Metric:");
		userChoice = scnr.nextInt();
		
		if (userChoice == 1)
		{
			System.out.println("Please enter your height (in inches) as a whole number:");
			userHeight = scnr.nextInt();
			System.out.println("Please enter your weight (in pounds) as a whole number:");
			userWeight = scnr.nextInt();
			
			// This is the formula to calculate BMI for the standard system.
			userBMI = (703.0 * (double)userWeight) / (Math.pow(userHeight, 2));
			
			System.out.printf("------------------------------------------------------\n");
			System.out.println("BMI Categories:");
			System.out.printf("Underweight = <18.5\nNormal Weight = 18.5 - 24.9\n");
			System.out.printf("Overweight = 25 - 29.9\nObesity = BMI of 30 or greater\n");
			System.out.printf("------------------------------------------------------\n");
			
			System.out.printf("You entered:\nHeight: %d inches\nWeight: %d pounds\n", userHeight, userWeight);
			
			// These print out what BMI the User is.
			if (userBMI > 0.0 && userBMI < 18.5)
			{
				System.out.printf("Your BMI is: %.1f, which means you are underweight.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
			else if (userBMI >= 18.5 && userBMI <= 24.9)
			{
				System.out.printf("Your BMI is: %.1f, which means you are normal weight.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
			else if (userBMI >= 25.0 && userBMI <= 29.9)
			{
				System.out.printf("Your BMI is: %.1f, which means you are overweight.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
			else if (userBMI >= 30)
			{
				System.out.printf("Your BMI is: %.1f, which means you are obese.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
		}
		else if (userChoice == 2)
		{
			System.out.println("Please enter your height (in meters) as a whole number:");
			userHeight = scnr.nextInt();
			System.out.println("Please enter your weight (in kilograms) as a whole number:");
			userWeight = scnr.nextInt();
			
			// This is the BMI formula for the Metric System.
			userBMI = (double)(userWeight) / Math.pow(userHeight, 2);
			
			System.out.printf("------------------------------------------------------\n");
			System.out.println("BMI Categories:");
			System.out.printf("Underweight = <18.5\nNormal Weight = 18.5 - 24.9\n");
			System.out.printf("Overweight = 25 - 29.9\nObesity = BMI of 30 or greater\n");
			System.out.printf("------------------------------------------------------\n");
			
			System.out.printf("You entered:\nHeight: %d meters\nWeight: %d kilograms\n", userHeight, userWeight);
			
			// These print out what BMI the User is.
			if (userBMI > 0.0 && userBMI < 18.5)
			{
				System.out.printf("Your BMI is: %.1f, which means you are underweight.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
			else if (userBMI >= 18.5 && userBMI <= 24.9)
			{
				System.out.printf("Your BMI is: %.1f, which means you are normal weight.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
			else if (userBMI >= 25.0 && userBMI <= 29.9)
			{
				System.out.printf("Your BMI is: %.1f, which means you are overweight.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
			else if (userBMI >= 30)
			{
				System.out.printf("Your BMI is: %.1f, which means you are obese.\n", userBMI);
				System.out.printf("------------------------------------------------------");
			}
		}
		else
		{
			System.out.println("Those are not valid numbers to choose from.");
		}
		

	}

}
