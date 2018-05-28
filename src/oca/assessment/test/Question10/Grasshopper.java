package oca.assessment.test.Question10;

// import java.util.*;

/**
 * Which are true of the following code? (Choose all that apply)
 * 
 * A. Immediately after line 27, no grasshopper objects are eligible for garbage collection.
 * B. Immediately after line 28, no grasshopper objects are eligible for garbage collection.
 * C. Immediately after line 27, only one grasshopper object is eligible for garbage collection.
 * D. Immediately after line 28, only one grasshopper object is eligible for garbage collection.
 * E. Immediately after line 29, only one grasshopper object is eligible for garbage collection.
 * F. The code compiles.
 * G. The code does not compile.
 */
public class Grasshopper
{
	public Grasshopper(String n)
	{
		name = n;
	}

	public static void main(String[] args)
	{
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");
		one = two;
		two = null;
		one = null;
	}

	private String name;
}