package datesnumbers;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		// Date --> sql , util
		// Cal
		// DateFormat

		Date d = new Date();// current date

		System.out.println(d);
		System.out.println(d.getHours());// 18 -- depricated
		System.out.println(d.getMonth());// 0-jan

		Calendar c = Calendar.getInstance();

		System.out.println(c);

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));

//		c.roll(Calendar.DATE, 80);
		c.add(Calendar.DATE, 80);

		System.out.println(c.get(Calendar.MONTH));

		Date future = new Date(c.getTimeInMillis());
		System.out.println(future);

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter date of birth");
		String userDate = scr.next();

		// DateFormat

	}
}
