package oca.assessment.test;

/**
 * What is the output of the following code snippet?
 *
 * A. abe
 * B. abce
 * C. abde
 * D. abcde
 * E. The code does not compile.
 * F. An uncaught exception is thrown.
 */
public class Question05
{
	public static void main(String[] args)
	{
		System.out.print("a");
		try
		{
			System.out.print("b");
			throw new IllegalArgumentException();
		}
		catch (RuntimeException e)
		{
			System.out.print("c");
		}
		finally
		{
			System.out.print("d");
		}
		System.out.print("e");
	}
}