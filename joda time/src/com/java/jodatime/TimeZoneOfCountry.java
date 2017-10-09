// To know the time zone of our country

package com.java.jodatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneOfCountry {

	public static void main(String[] args) {
		// To get the default time zone.  My current time zone is India
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("Current timezone is INDIA : "+zoneId);
		
		// To get date and time in default time zone 
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date and time is : "+dateTime);
		
		// To get the zone identification for some others countrys for example LosAngeles
		ZoneId id = ZoneId.of("America/Los_Angeles");
		
		// To get date and time in Loa Angeles
		ZonedDateTime zdt = ZonedDateTime.now(id);
		System.out.println("Date and time in Los Angels is : "+zdt);

	}

}
