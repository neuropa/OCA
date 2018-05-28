package oca.assessment.test.Question04;

/**
 * What is the output of the following program?
 *
 * A. 4
 * B. 5
 * C. 6
 * D. 7
 * E. 13
 * F. The code will not compile because of line 22.
 */
public class FeedingSchedule
{
	public static void main(String[] args)
	{
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while (count++ < 3)
		{
			int y = (1 + 2 * count) % 3;
			switch (y)
			{
				default:
				case 0:
					x -= 1;
					break;
				case 1:
					x += 5;
			}
		}
		System.out.println(x);
	}
}