package oca.assessment.test.Question14;

import java.util.List;

/**
 * Assuming we have a valid, non-null HenHouse object whose value is initialized by the
 * blank line shown here, which of the following are possible outputs of this application?
 * (Choose all that apply)
 *
 * A. The code will not compile because of line 29.
 * B. The code will not compile because of lines 30.
 * C. The application will compile but not produce any output.
 * D. The application will output Cluck exactly once.
 * E. The application will output Cluck more than once.
 * F. The application will compile but produce an exception at runtime.
 */
class Chicken
{
}

interface HenHouse
{
	public java.util.List<Chicken> getChickens();
}

public class ChickenSong
{
	public static void main(String[] args)
	{
		HenHouse house = new HenHouseImpl();
		Chicken chicken = house.getChickens().get(0);
		for (int i = 0; i < house.getChickens().size(); chicken = house.getChickens().get(i++))
		{
			System.out.println("Cluck");
		}
	}
}

class HenHouseImpl implements HenHouse
{
	@Override
	public List<Chicken> getChickens()
	{
		return null;
		// return new ArrayList<>();
		// return Arrays.asList(new Chicken[] {});
		// return Arrays.asList(new Chicken[] { new Chicken() });
		// return Arrays.asList(new Chicken[] { new Chicken(), new Chicken() });
	}

}