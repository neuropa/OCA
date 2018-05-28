package oca.assessment.test.Question16;

/**
 * Which of the following statements can be inserted in the blank line so that the code will
 * compile successfully? (Choose all that apply)
 *
 * A. The code compiles without issue.
 * B. Remove the default method modifier and method implementation on line 1.
 * C. Remove the default method modifier and method implementation on line 2.
 * D. Remove the default method modifier and method implementation on lines 1 and 2.
 * E. Change the return value on line 1 from null to "Animal".
 * F. Override the getName() method with an abstract method in the Otter class.
 * G. Override the getName() method with a concrete method in the Otter class.
 */
interface Animal
{
	public default String getName()
	{
		return null;
	}

	// public String getName();
}

interface Mammal
{
	public default String getName()
	{
		return null;
	}

	// public String getName();
}

public abstract class Otter implements Mammal, Animal
{
	// @Override
	// public abstract String getName();

	/*@Override
	public String getName()
	{
		return "";
		// return Animal.super.getName();
		// return Mammal.super.getName();
	}*/

}