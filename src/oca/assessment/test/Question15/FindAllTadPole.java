package oca.assessment.test.Question15;

import java.util.ArrayList;
import java.util.List;

/**
 * Which of the following statements can be inserted in the blank line so that the code will
 * compile successfully? (Choose all that apply)
 *
 * A. CanSwim
 * B. Long
 * C. Amphibian
 * D. Tadpole
 * E. Object
 */
interface CanSwim
{
}

class Amphibian implements CanSwim
{
}

class Tadpole extends Amphibian
{
}

public class FindAllTadPole
{
	public static void main(String[] args)
	{
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for (Amphibian amphibian : tadpoles)
		{
			_____ tadpole = amphibian;
		}
	}
}