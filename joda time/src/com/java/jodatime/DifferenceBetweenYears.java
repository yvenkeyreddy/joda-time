package com.java.jodatime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DifferenceBetweenYears {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1996, Month.APRIL, 23);
		
	    LocalDate currentDate = LocalDate.now();

	    Period betweenDates = Period.between(dateOfBirth, currentDate);

//	    int diffInDays = betweenDates.getDays();
//	    int diffInMonths = betweenDates.getMonths();
	    int diffInYears = betweenDates.getYears();
	  	    
	    System.out.print(diffInYears+" years ");
//	    System.out.print(diffInMonths+"months, ");
//	    System.out.print(diffInDays+"days");
	
	}

}
