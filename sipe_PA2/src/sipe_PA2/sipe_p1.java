package sipe_PA2;

import java.util.Scanner;

public class sipe_p1 
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int i, readIn, tempVar; 
		int[] dataArray = new int[4];
		String encryptOrDecrypt;
		
		// I wasn't too sure on how to make it two separate classes, so I just made it an option to scan in,
		// and depending on if they put encrypt or decrypt, it'd take you to eiher algorithm.
		System.out.println("Would you like to encrypt or decrypt a pin?");
		encryptOrDecrypt = scnr.next();
	
		if (encryptOrDecrypt.compareTo("encrypt") == 0 || encryptOrDecrypt.compareTo("Encrypt") == 0)
		{
			System.out.println("Enter your 4-digit pin:");
			readIn = scnr.nextInt();
			dataArray[0] = readIn / 1000;
			dataArray[1] = (readIn % 1000) / 100;
			dataArray[2] = ((readIn % 1000) % 100) / 10;
			dataArray[3] = readIn % 10;
			
			for (i = 0; i < 4; i++)
			{
				dataArray[i] = (dataArray[i] + 7) % 10;
			} 
			
			// This puts the first digit in a temp variable, then puts the third variable in the first spot,
			// then puts the stored temp variable (the original first number) in the third spot.
			
			tempVar = dataArray[0];
			dataArray[0] = dataArray[2];
			dataArray[2] = tempVar;
			
			// This puts the second digit in a temp variable, then puts the fourth variable in the fourth spot,
			// then puts the stored temp variable (the original second number) in the fourth spot.
			
			tempVar = dataArray[1];
			dataArray[1] = dataArray[3];
			dataArray[3] = tempVar;
			
			System.out.print("Your encrypted pin is: " + dataArray[0] + dataArray[1] + dataArray[2] + dataArray[3]);
		}
		else if (encryptOrDecrypt.compareTo("decrypt") == 0 || encryptOrDecrypt.compareTo("Decrypt") == 0)
		{
			System.out.println("Enter your encrypted 4-digit pin:");
			readIn = scnr.nextInt();
			dataArray[0] = readIn / 1000;
			dataArray[1] = (readIn % 1000) / 100;
			dataArray[2] = ((readIn % 1000) % 100) / 10;
			dataArray[3] = readIn % 10;
			
			for (i = 0; i < 4; i++)
			{
				// The way the decryption works is that if the number is 7 or greater (Because we chose to add 7 
				// to the original number in the encryption algorithm), we just subtract 7, since that will just
				// give us the original number (i.e. 9 + 7 = 16 -> 16 - 7 = 9). 
				if (dataArray[i] >= 7)
				{
					dataArray[i] = dataArray[i] - 7;
				}
				else
				{	
					// If the number is less than 7, then we just add 3, since that is the difference between 10 and 7.
					// (i.e. if the encrypted number is 6, then we just add 3 and we get 9. Which works out because
					// 9 + 7 = 16 and then 16 % 10 gives you 6.
					dataArray[i] = dataArray[i] + 3;
				}
			}
			
			// This puts the first digit in a temp variable, then puts the third variable in the first spot,
			// then puts the stored temp variable (the original first number) in the third spot.
			tempVar = dataArray[0];
			dataArray[0] = dataArray[2];
			dataArray[2] = tempVar;
			
			// This puts the second digit in a temp variable, then puts the fourth variable in the second spot,
			// then puts the stored temp variable (the original second number) in the fourth spot.
			
			tempVar = dataArray[1];
			dataArray[1] = dataArray[3];
			dataArray[3] = tempVar;
			
			System.out.print("Your decrypted pin is: " + dataArray[0] + dataArray[1] + dataArray[2] + dataArray[3]);
		}
		else
		{
			System.out.println("Those are not valid options. Goodbye.");
		}

	}

}
