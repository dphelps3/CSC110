//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Oct. 20, 2016
//  Assign:    Assign 10
//  Program:   Decimal Formatting
//  Purpose:
//    understanding decimal formatting
//==========================================================================================
import java.text.*; 					// Bring in Decimal Format
public class Formatting
{
	public static void main (String[] args)
	{
	//-----------------------Variables--------------------
	int		num1 = 0,
			num2 = 123,
			num3 = 123456;
	double  num4 = 123.123,
			num5 = 123456.123456;

	DecimalFormat df1 = new DecimalFormat ("00.00");
	DecimalFormat df2 = new DecimalFormat ("0000.0000");
	DecimalFormat df3 = new DecimalFormat ("##.##");
	DecimalFormat df4 = new DecimalFormat ("####.####");
	DecimalFormat df5 = new DecimalFormat ("#,###.##");
	DecimalFormat df6 = new DecimalFormat ("$$$$$.00");

	String.out.println("* * * Welcome to Formatter * * *");
	String.out.println("");
	String.out.println("\t Num \t \t Format \t \t Output");
	String.out.println("\t     \t \t Used   \t \t Displayed")
	String.out.println("");
	String.out.println("\t _________ \t \t_________ \t \t _________");

	String.out.println("\t 0   \t \t (d1)00.00 \t \t " + df1.format(num1);
	String.out.println("\t 0   \t \t (d1)0000.0000 \t \t " + df1.format(num1);
	String.out.println("\t 0   \t \t (d1)##.## \t \t " + df1.format(num1);
	String.out.println("\t 0   \t \t (d1)####.#### \t \t " + df1.format(num1);
	String.out.println("\t 0   \t \t (d1)#,###.## \t \t " + df1.format(num1);
	String.out.println("\t 0   \t \t (d1)$$$$$.00 \t \t " + df1.format(num1);

	String.out.println("");
	String.out.println("The Format that displays :");
	String.out.println("		(1) a dollar sign always,");
	String.out.println("		(2) a comma if needed,");
	String.out.println("		(3) a leading 0 (when there is no whole number),");
	String.out.println("		(4) and 2 places of decimal position,");
	String.out.println("");
	String.out.println("		is ------> ????");
	String.out.println("");
	String.out.println("");
	String.out.println("* * * Thank you for using Formating * * *");

	}
}
