//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Nov. 3, 2016
//  Assign:    Assign 12
//  Program:   Design and Input
//  Purpose:
//    learning design and input, and doing calculations
//==========================================================================================
import java.util.*;
public class Traveler
{
	public static void main(String[] args)
	{
		//-------- Variables
		final int CITY_SPD = 40;
		int avgHighwaySpd = 0;
		int prcntInCity = 0;
		int totalMiles = 0;
		double cityPercnt = 0.00;
		double cityHrs = 0.000;
		double hiwayHrs = 0.000;
		double totalHrs = 0.000;
		double cityMiles = 0;
		double hiwayMiles = 0;
		double percent = 100;

		//-------- Scanner
		Scanner keyboard = new Scanner(System.in);

		//-------- start of program
		System.out.println("        Welcome to Traveler      ");
		System.out.println("");
		System.out.print("Enter total trip miles  : ");
		totalMiles = keyboard.nextInt();
		System.out.print("Enter avg highway speed : ");
		avgHighwaySpd = keyboard.nextInt();
		System.out.print("Enter percent in city   : ");
		prcntInCity = keyboard.nextInt();

		//-------- getting the total hours
		cityPercnt = prcntInCity / percent;
		cityMiles = totalMiles * cityPercnt;
		hiwayMiles = totalMiles - cityMiles;
		cityHrs = cityMiles / CITY_SPD;
		hiwayHrs = hiwayMiles / avgHighwaySpd;
		totalHrs = cityHrs + hiwayHrs;

		System.out.println(" ");
		System.out.println("- - - - - Trip summary - - -");
		System.out.println("Miles");
		System.out.println("           city  miles   :  " + cityMiles);
		System.out.println("           hiway miles   : " + hiwayMiles);
		System.out.println("           total miles   : " + totalMiles);
		System.out.println("Time :");
		System.out.println("           city  hours   :  " + cityHrs);
		System.out.println("           hiway hours   :  " + hiwayHrs);
		System.out.println("           total hours   :  " + totalHrs);
		System.out.println("* * Program End Successfully * *");
	}
}