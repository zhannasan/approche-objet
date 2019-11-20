package fr.diginamic.dates;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date(); 
		System.out.println(formatter.format(date)); 

		SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss"); 
		Date time = new Date();
		Date fulldate = new Date();
		long seconds = java.util.concurrent.TimeUnit.MINUTES.toSeconds(600);
		time.setTime(seconds);
		System.out.println(formatter2.format(time));
	}

}
