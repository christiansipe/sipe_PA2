package sipe_PA2;

import java.util.Scanner;

public class sipe_p3 
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int userResponse1,userResponse2, userResponse3, userResponse4, userResponse5;
		int[][] responseArray = new int[5][10];
		int[] sumArray = new int[5];
		int i, j, count = 0, sum = 0, avg, max, min, minNumIssue = 0, maxNumIssue = 0;
		
		System.out.println("Hello, today you will rate 5 topics from 1 (least important) to 10 (most important).");
	
		// This prompts 10 users to rate the 5 topics.
		while (count < 10)
		{
			System.out.println("Response number: " + (count + 1));
			for (i = 0; i < 5; i++)
			{		
				if (i == 0)
				{
					System.out.println("First Topic: How important is Space Tourism?");
					userResponse1 = scnr.nextInt();
					(responseArray[i][userResponse1 - 1])++;
				}
				else if (i == 1)
				{
					System.out.println("Second Topic: How important is AI Development?");
					userResponse2 = scnr.nextInt();
					(responseArray[i][userResponse2 - 1])++;
				}
				else if (i == 2)
				{	
					System.out.println("Third Topic: How important is Global Warming?");
					userResponse3 = scnr.nextInt();
					(responseArray[i][userResponse3 - 1])++;
				}
				else if (i == 3)
				{
					System.out.println("Fourth Topic: How important is colonizing the Moon?");
					userResponse4 = scnr.nextInt();
					(responseArray[i][userResponse4 - 1])++;
				}
				else if (i == 4)
				{
					System.out.println("Fifth Topic: How important is the fast food industry?");
					userResponse5 = scnr.nextInt();
					(responseArray[i][userResponse5 - 1])++;
				} 	
			}
			count++;
		}
		
		// This begins to print out the 5x10 table. It accounts for the sum and avg as well as prints everything.
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("| Topics & Ratings |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10  |  Average  |");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.print("| Space Tourism:   |");
		
		for (j = 0; j < 10; j++)
		{
			System.out.print("  " + responseArray[0][j] + "  |");
			sum += responseArray[0][j] * (j + 1);
		}
		
		sumArray[0] = sum;
		avg = sum / 10;
		System.out.println("     " + avg + "     |");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		System.out.print("| AI Development:  |");
		sum = 0;
		for (j = 0; j < 10; j++)
		{
			System.out.print("  " + responseArray[1][j] + "  |");
			sum += responseArray[1][j] * (j + 1);
		}
		
		sumArray[1] = sum;
		avg = sum / 10;
		System.out.println("     " + avg + "     |");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		System.out.print("| Global Warming:  |");
		sum = 0;
		for (j = 0; j < 10; j++)
		{
			System.out.print("  " + responseArray[2][j] + "  |");
			sum += responseArray[2][j] * (j + 1);
		}
		
		sumArray[2] = sum;
		avg = sum / 10;
		System.out.println("     " + avg + "     |");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		System.out.print("| Lunar Colony:    |");
		sum = 0;
		for (j = 0; j < 10; j++)
		{
			System.out.print("  " + responseArray[3][j] + "  |");
			sum += responseArray[3][j] * (j + 1);
		}
		
		sumArray[3] = sum;
		avg = sum / 10;
		System.out.println("     " + avg + "     |");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		System.out.print("| Fast-Food:       |");
		sum = 0;
		for (j = 0; j < 10; j++)
		{
			System.out.print("  " + responseArray[4][j] + "  |");
			sum += responseArray[4][j] * (j + 1);
		}
		
		sumArray[4] = sum;
		avg = sum / 10;
		System.out.println("     " + avg + "     |");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		max = 0;
		min = 101; 
		for (i = 0; i < 5; i++)
		{
			if (sumArray[i] > max)
			{
				max = sumArray[i];
				maxNumIssue = i;
			}
		}
		
		for (i = 0; i < 5; i++)
		{
			if (sumArray[i] < min)
			{
				min = sumArray[i];
				minNumIssue = i;
			}
		}
		
		// This prints out the highest and lowest amount of points based off of the sums.
		if (maxNumIssue == 0)
		{
			System.out.println("Space Tourism received the highest amount of points, which was: " + max);
		}
		else if (maxNumIssue == 1)
		{
			System.out.println("AI Development received the highest amount of points, which was: " + max);
		}
		else if (maxNumIssue == 2)
		{
			System.out.println("Global Warming received the highest amount of points, which was: " + max);
		}
		else if (maxNumIssue == 3)
		{
			System.out.println("Lunar Colonization received the highest amount of points, which was: " + max);
		}
		else if (maxNumIssue == 4)
		{
			System.out.println("Fast Food received the highest amount of points, which was: " + max);
		}
		
		if (minNumIssue == 0)
		{
			System.out.println("Space Tourism received the lowest amount of points, which was: " + min);
		}
		else if (minNumIssue == 1)
		{
			System.out.println("AI Development received the lowest amount of points, which was: " + min);
		}
		else if (minNumIssue == 2)
		{
			System.out.println("Global Warming received the lowest amount of points, which was: " + min);
		}
		else if (minNumIssue == 3)
		{
			System.out.println("Lunar Colonization received the lowest amount of points, which was: " + min);
		}
		else if (minNumIssue == 4)
		{
			System.out.println("Fast Food received the lowest amount of points, which was: " + min);
		}
	}
}