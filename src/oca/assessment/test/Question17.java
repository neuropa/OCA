package oca.assessment.test;

import java.util.function.Predicate;

/**
 * Which of the following lines can be inserted at line 11 to print true? (Choose all that apply)
 *
 * A. System.out.println(test(i -> i == 5));
 * B. System.out.println(test(i -> {i == 5;}));
 * C. System.out.println(test((i) -> i == 5));
 * D. System.out.println(test((int i) -> i == 5);
 * E. System.out.println(test((int i) -> {return i == 5;}));
 * F. System.out.println(test((i) -> {return i == 5;}));
 */
public class Question17
{
	public static void main(String[] args)
	{
		System.out.println(test(i -> i == 5));
		// System.out.println(test(i -> {i == 5;}));
		System.out.println(test((i) -> i == 5));
		// System.out.println(test((int i) -> i == 5);
		// System.out.println(test((int i) -> {return i == 5;}));
		System.out.println(test((i) ->
		{
			return i == 5;
		}));
	}

	private static boolean test(Predicate<Integer> p)
	{
		return p.test(5);
	}
}