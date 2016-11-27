//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Nov. 3, 2016
//  Assign:    Assign 14
//  Program:   selection Intro (IF statment
//  Purpose:
//    learning how to do If else statements, and doing calculations
//==========================================================================================
import java.util.*;
import java.text.*;
public class Shingle
{
	public static void main(String[] args)
	{
		//-------- Variables
		final int SHNGLD_HR = 35;
		final double DSCNT_BG = .2;
		final double DSCNT_SML = .05;
		final double HALF = .5;
		final double LBR_DSCNT = .1;
		final double SQ_FT_F = 750;
		final double SQ_FT_S = 850;
		final double TAX = .0575;
		final double LABR_RATE = 9.75;

		int height = 0;
		int length = 0;
		double shngleSqFt = 0;
		double shngleCost = 0;
		double shnglDscnt = 0;
		double SqFtRoof = 0;
		double totlRoofCst = 0;
		double labrHrs = 0;
		double labrCost = 0;
		double labrDscnt = 0;
		double totalLbrCst = 0;
		double subTotal = 0;
		double total = 0;
		double salesTax = 0;
		double hours = 0;

        //-------- format
        DecimalFormat df1 = new DecimalFormat ("$#,#00.00");
        DecimalFormat df2 = new DecimalFormat ("0.00");
		//-------- Scanner
		Scanner keyboard = new Scanner(System.in);

		//-------- start of program
		System.out.println(" * * * Welcome to Shingle! * * *");
		System.out.println("");
		System.out.println("For ONE side of the roof");
		System.out.print("       Enter the height: ");
		height = keyboard.nextInt();
		System.out.print("       Enter the length: ");
		length = keyboard.nextInt();
		SqFtRoof = height * length;
		System.out.print("Your roof is: " + SqFtRoof + " square feet");
		System.out.println(" ");
		System.out.println(" ");

		//-------- shingles
		System.out.print("Enter the cost (per sq ft) of the shingles: ");
		shngleSqFt = keyboard.nextDouble();
		shngleCost = shngleSqFt * SqFtRoof;
		System.out.println("       Initial shingle cost  : " + df1.format(shngleCost));

		//------ if statement
		if (SqFtRoof > SQ_FT_F)
		{
			shnglDscnt = shngleCost * DSCNT_BG;
		System.out.println("           quantity discount : " + df1.format(shnglDscnt));
			totlRoofCst = shngleCost - shnglDscnt;
		System.out.println("       Adjusted shingle cost : " + df1.format(totlRoofCst));
		}
		else
		{
			shnglDscnt = shngleCost * DSCNT_SML;
		System.out.println("         end season discount : " + df1.format(shnglDscnt));
			totlRoofCst = shngleCost - shnglDscnt;
		System.out.println("       Adjusted shingle cost : " + df1.format(totlRoofCst));

		}
		// Labor
		hours = SqFtRoof / SHNGLD_HR;
		labrHrs = hours * HALF;
		labrCost = labrHrs * LABR_RATE;
		totalLbrCst = labrCost;
		System.out.println("");
		System.out.println("Hours to complete installation, apprx: " + df2.format(labrHrs));
		System.out.println("         total labor cost : " + df1.format(labrCost));
		if (SqFtRoof > SQ_FT_S)
		{
			labrDscnt = labrCost * LBR_DSCNT;
		System.out.println("              labor discount : " + df1.format(labrDscnt));
			totalLbrCst = labrCost - labrDscnt;
		System.out.println("         adjusted labor cost : " + df1.format(totalLbrCst));
		System.out.println("         * roofs over 850 sq ft rcv discount.");
		}
		else
		{
		}
		//------- total cost
		System.out.println("");
		subTotal = totalLbrCst + totlRoofCst;
		System.out.println("subtotal (after discounts): " + df1.format(subTotal));
		salesTax = TAX * subTotal;
		System.out.println("Sale tax (at 5.75%) :       " + df1.format(salesTax));
		total = subTotal - salesTax;
		System.out.println("Final roof cost -----> :    " + df1.format(total));
		System.out.println(" ");

		System.out.println("* * * Enjoy your new roof * * *");
	}
}