package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long currentTime1 = System.currentTimeMillis();
		System.out.println("Current time is : ");
		System.out.println(currentTime1);

		Date date = new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat();
		simpledateformat.applyPattern("EEE, d MMM yyyy HH:mm:ss Z");
		String currentTime = simpledateformat.format(date);
		System.out.println(currentTime);

		Date secondDate = new Date(2015, 11, 23, 16, 40, 30);
		int year = date.getYear();
		int motnh = secondDate.getMonth();
		int day = secondDate.getDate();
		System.out.println("Today date is: " + year + " " + motnh + " " + day);

		String Time = simpledateformat.format(secondDate);
		System.out.println("Second Date: " + Time);

	}

}
