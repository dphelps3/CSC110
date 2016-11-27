//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Nov. 3, 2016
//  Assign:    Assign 12
//  Program:   Design and Input
//  Purpose:
//    learning design and input, and doing calculations
//==========================================================================================
import java.util.*;
public class Coffee
{
	public static void main(String[] args)
	{
		//-------- Variables
		final int JITTR_WGHT = 50;
		final int JITTR_GRM = 3;
		final double LGHT_ROAST = 2.5;
		final int BOLD_ROAST = 4;
		final int EXTRME_ROAST = 10;


		double weight = 0;
		double jitter = 0;
		double jitterLimit = 0;
		int lghtRstCups = 0;
		int boldRstCups = 0;
		int extrmRstCups = 0;

		//-------- Scanner
		Scanner keyboard = new Scanner(System.in);

		//-------- start of program
		System.out.println(" = = = = Welcome to Coffee = = = =");
		System.out.print("Enter your weight: ");
		weight = keyboard.nextDouble();

		//-------- getting the jitter limit
		jitter = weight / JITTR_WGHT;
		jitterLimit = jitter * JITTR_GRM;

		lghtRstCups = (int)(jitterLimit / LGHT_ROAST);
		boldRstCups = (int)(jitterLimit / BOLD_ROAST);
		extrmRstCups = (int)(jitterLimit / EXTRME_ROAST);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("To avoid the jitter today, you must");
		System.out.println("limit youself to one of the following:");
		System.out.println("              Light Roast:     " + lghtRstCups);
		System.out.println("               Bold Roast:     " + boldRstCups);
		System.out.println("            Extreme Roast:     " + extrmRstCups);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("- - - - End Program - - - -");


	}
}