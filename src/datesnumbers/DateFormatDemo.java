package datesnumbers;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {

		DateFormat d = DateFormat.getDateInstance();// abstract class
		Date date = new Date();// 1-jan-1970
		System.out.println(date);
		System.out.println(d.format(date));

		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dfShort.format(date));

		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dfMedium.format(date));

		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dfLong.format(date));

		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dfFull.format(date));

		System.out.println(date.getTime());

	}
}
