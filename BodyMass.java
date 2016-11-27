//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Dec. 1, 2016
//  Assign:    Assign 16
//  Program:   Nested Intro
//  Purpose:
//    learning how to nest if statements
//==========================================================================================
import java.util.*;
import java.text.*;
public class BodyMass
{
	public static void main(String[] args)
	{
		//Variables
		int
		          age = 0,
		    xrciseHrs = 0;

		double         bmi = 0,
		            weight = 0,
		            height = 0,
	    		 underWght = 18.5,
		 		   ovrWght = 25;

		boolean overWt = false;

		//Scanner
		Scanner keyboard = new Scanner(System.in);

		//-------- Format
  		DecimalFormat df1 = new DecimalFormat ("#0.#");

		//Program
		System.out.println("			Welcome to the BodyMass Program");
		System.out.print("Enter the number of hours you exercise per week: ");
		xrciseHrs = keyboard.nextInt();

		//Calculations
		height = height * height;
		height = 703 / height;
		bmi = weight * height;

		 if (bmi > 25)
		 	overWt = true;

		//nested if
		if (xrciseHrs < 3)
			{
				System.out.print("\n Enter your weight (in pounds): ");
				weight = keyboard.nextInt();

				System.out.print(" Enter your height (in inches): ");
					height = keyboard.nextInt();

				if (bmi < 25)
					System.out.println("\nYour BMI of " + df1.format(bmi) + " indicates you are optimal.");

				else if (bmi < 18.5)
					System.out.println("\nYour BMI of " + df1.format(bmi) + " indicates you are underweight.");

				else
					System.out.println("\nYour BMI of " + df1.format(bmi) + " indicates you are overweight.");
			}

		else


		// Program

		 if (overWt == true)
			 {
				System.out.print("Enter your age: ");
					 age = keyboard.nextInt();


		 	if (age > 18)
		 		System.out.println("\nAt your weight, see a doctor for assistence in losing weight.");

		 	else
		 		System.out.println("At your weight, begin exercising and watch your calories.");
			}

		else
			System.out.println("\n Continue to excercise.");

		System.out.println(" \n Hope you are on your way to good health!");




	}
}