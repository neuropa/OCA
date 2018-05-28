package oca.assessment.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * Which of the following print out a date representing April 1, 2015? (Choose all that apply) 
 *
 * A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
 * B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));
 * C. System.out.println(LocalDate.of(2015, 3, 1));
 * D. System.out.println(LocalDate.of(2015, 4, 1));
 * E. System.out.println(new LocalDate(2015, 3, 1));
 * F. System.out.println(new LocalDate(2015, 4, 1));
 */
public class Question18
{
	public static void main(String[] args)
	{
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
		System.out.println(LocalDate.of(2015, 3, 1));
		System.out.println(LocalDate.of(2015, 4, 1));
		// System.out.println(new LocalDate(2015, 3, 1));
		// System.out.println(new LocalDate(2015, 4, 1));
	}
}