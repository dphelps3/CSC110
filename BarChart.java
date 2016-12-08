import java.util.*;
public class BarChart
{
	public static void main(String[] arg)
	{
		//----- Declared Variables
		String asterix = "*",
			   barLine = "|";


		int  count = 0,
		  numCount = 0,
			sales1 = 0,
			sales2 = 0,
		    sales3 = 0;

		Scanner keyboard = new Scanner(System.in);

		//----- Program Start
		System.out.println("\t* * * Welcome to Sales Bar Chart * * *");
		System.out.print("\nEnter sales for store-1: ");
		sales1 = keyboard.nextInt();
		System.out.print("Enter sales for store-2: ");
		sales2 = keyboard.nextInt();
		System.out.print("Enter sales for store-3: ");
		sales3 = keyboard.nextInt();
		System.out.println("\nSALES BAR CHART");

		//----- Calculations
		while ( numCount <= sales1)
		{
			if (count == 9){
			System.out.print("|");
			 numCount += 1000;
			 count = 0;
	       }else
			System.out.print("*");
			 numCount += 100;
			 count ++;

		}
	}// --- end main
}// --- end pgm