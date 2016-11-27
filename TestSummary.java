import java.util.*;
import java.text.*;
public class TestSummary
{
	public static void main(String[] args)
	{
		//---- variables and others
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("00.#");
		boolean earnedPts = false;

	final double AVERAGE = 3;
	final int  A_CUTTOFF = 90;
	final int  B_CUTTOFF = 80;
	final int  C_CUTTOFF = 70;
	final int  D_CUTTOFF = 60;
		double testScore1 = 0;
		double testScore2 = 0;
		double testScore3 = 0;
		double    testAvg = 0;
		double  highScore = 0;
		double   lowScore = 0;
 		String   highTest = "";
		String    lowTest = "";
		   String    name = "";
		   String   grade = "A";

		//Program Start
		System.out.println("* * * * * Welcome to Grader * * * * *");
		System.out.print("Enter you name: ");
		name = keyboard.nextLine();

		System.out.println(name + " enter your scores for");
		System.out.print("        Test-1: ");
		testScore1 = keyboard.nextInt();
		System.out.print("        Test-2: ");
		testScore2 = keyboard.nextInt();
		System.out.print("        Test-3: ");
		testScore3 = keyboard.nextInt();
		System.out.println("");

		//calculations
		testAvg = (testScore1 + testScore2) + testScore3;
		testAvg = testAvg / AVERAGE;

		if (testAvg < D_CUTTOFF)
		{
			earnedPts = false;
			 grade = "F";
		}
		else if (testAvg < C_CUTTOFF)
		{
			earnedPts = false;
			grade = "D";
		}
		else if (testAvg < B_CUTTOFF)
		{
			earnedPts = false;
			grade = "C";
		}
		else if (testAvg < A_CUTTOFF)
		{
			earnedPts = true;
			grade = "B";
		}
		else
		{
			earnedPts = true;
			grade = "A";
		}
//-------- finding high test scores
		if (testScore1 > testScore2)
		{
			if (testScore1 > testScore3)
			{
				highScore = testScore1;
				highTest = "Test-1";
			}
		}
		else if (testScore2 > testScore3)
			{
				highScore = testScore2;
				highTest = "Test-2";
			}
		else
		{
			highScore = testScore3;
			highTest = "Test-3";
		}
//-------- finding low test scores
		if (testScore1 < testScore2)
		{
			if (testScore1 < testScore3)
			{
				lowScore = testScore1;
				lowTest = "Test-1";
			}
		}
		else if (testScore2 < testScore3)
			{
				lowScore = testScore2;
				lowTest = "Test-2";
			}
		else
		{
			lowScore = testScore3;
			lowTest = "Test-3";
		}
		//Program continued
		System.out.println("- - - - " + name + "'s Test Summary - - - -");
		System.out.println("         Test Average:             "
													+ df1.format(testAvg));
		System.out.println("         Grade (for Avg):          " + grade);
		System.out.println("         Low  Test was:          " + lowTest
											+ "," + df1.format(lowScore));
		System.out.println("         High Test was:          " + highTest
											+ "," + df1.format(highScore));

		if (earnedPts == true)
		{
			System.out.println("         Points were earned toward High Success Reward");
		}
		System.out.println("");
		System.out.println("Thanks for using the test summary program");
	}
}