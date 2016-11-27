//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Nov. 3, 2016
//  Assign:    Assign 12
//  Program:   If statement intro
//  Purpose:
//    learning how to use if statements
//==========================================================================================
import java.util.*;
import java.text.*;
public class Bonus
{
	public static void main(String[] args)
	{
	//---------Variables
		String fName = "";
		String lName = "";
		int monthOne = 0;
		int monthTwo = 0;
		int monthThree = 0;
  final	int DIV_AVG = 3;
  final int AMT_SUCCEED = 7500;
  		double totalSales = 0;
        double avgSales = 0;
  		double salesAvg = 0;
  		double bonus = 0;
  final double PRCNT_BONUS = .05;
  	//-------- Format
  	DecimalFormat df1 = new DecimalFormat ("$#,#00.00");

	//-------- Scanner
		Scanner keyboard = new Scanner(System.in);

	//-------- Start of Program
	System.out.println(" * * * Welcome to Bonus * * *");
	System.out.println(" ");
	System.out.print("What is your first name? ");
	fName = keyboard.nextLine();
	System.out.print("What is your last name?  ");
	lName = keyboard.nextLine();

	System.out.println("Enter your Monthly Sales :");
	System.out.print("                Month-1: ");
	monthOne = keyboard.nextInt();
	System.out.print("                Month-2: ");
	monthTwo = keyboard.nextInt();
	System.out.print("                Month-3: ");
	monthThree = keyboard.nextInt();
	System.out.println(" ");

	System.out.println("Quarterly Report for: " + fName + " " +  lName);
	System.out.println("         Month-1 Sales: " + df1.format(monthOne));
	System.out.println("         Month-2 Sales: " + df1.format(monthTwo));
	System.out.println("         Month-3 Sales: " + df1.format(monthThree));
	totalSales = (monthOne + monthTwo) + monthThree;
	avgSales = totalSales / DIV_AVG;
	System.out.println("         Average Sales: " + df1.format(avgSales));
	bonus = avgSales * PRCNT_BONUS;

	if (avgSales > AMT_SUCCEED)
	System.out.println(fName + " earned a bonus of " + df1.format(bonus)
								+ " this quarter.");
	System.out.println(" ");
    System.out.println("--------- ended successfully ----------");
	}
}