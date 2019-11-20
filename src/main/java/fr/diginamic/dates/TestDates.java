package fr.diginamic.dates;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date(); 
		System.out.println(formatter.format(date)); 
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date time = new Date();
		time.setTime(1574289059000L);
		System.out.println(formatter2.format(time));
		
		Date timeNow = new Date(System.currentTimeMillis());
		System.out.println(formatter2.format(timeNow));
	
	}

}
