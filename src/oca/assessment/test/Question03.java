package oca.assessment.test;

/**
 * What is the output of the following code? (Choose all that apply)
 *
 * A. 2
 * B. 4
 * C. The code will not compile because of line 21.
 * D. The code will not compile because of line 27.
 * E. The code will not compile because of line 31.
 * F. The code will not compile because of line 35.
 * G. The output cannot be determined from the code provided.
 */
interface HasTail
{
	int getTailLength();
}

abstract class Puma implements HasTail
{
	protected int getTailLength()
	{
		return 4;
	}
}

public class Cougar extends Puma
{
	public static void main(String[] args)
	{
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
	}

	public int getTailLength(int length)
	{
		return 2;
	}
}