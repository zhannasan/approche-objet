package fr.diginamic.dates;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TestCalendar {

	public static void main(String[] args) {
		Calendar calend = Calendar.getInstance();
		Date date = calend.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		System.out.println(formatter.format(date));
		
		calend.set(Calendar.HOUR_OF_DAY, 23);
		calend.set(Calendar.MINUTE, 30);
		calend.set(Calendar.SECOND, 59);
		
		Date date2 = calend.getTime();
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		System.out.println(formatter2.format(date2));
		
		Calendar calendNow = Calendar.getInstance();
		Date date3 = calendNow.getTime();
		System.out.println(formatter2.format(date3));
	}

}
