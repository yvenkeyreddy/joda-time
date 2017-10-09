// Program for displaying the current date and time

package com.java.jodatime;

import java.time.LocalDate;
import java.time.LocalTime;

public class SysDateTime {

	public static void main(String[] args) {
		
		// LocalDate.now() gives system date into LocalDate object
		LocalDate date = LocalDate.now();  // for generation of variable and object press (space+1)
 		System.out.println("Todays Date is : "+date);
 		
 		// LocalTime.now() gives system time into LocalTime object
 		LocalTime time = LocalTime.now();
 		System.out.println("Now Time is : "+time);
	}

}
