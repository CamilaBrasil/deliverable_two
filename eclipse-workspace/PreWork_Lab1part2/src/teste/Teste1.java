package teste;

import java.time.temporal.*;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {

			int year;
			int month;
			int day;
			 date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			
			Scanner scnr = new Scanner(System.in);
			
			//Asking the user to input the first date and rewriting the date1 with it.
			System.out.println("Please type the year for the first date.");
			year = scnr.nextInt();
			
			System.out.println("Please type the month for the first date.");
			month = scnr.nextInt();
			/* The Calendar class recognizes 0 being January and 1 being February, 
			so is necessary to substract one from the users input to get the right month */
			month = month - 1;
			
			System.out.println("Please type the day for the first date.");
			day = scnr.nextInt();
			
			date1.set(year, month, day);
			
			//Asking the user to input the second date and rewriting the date1 with it.
			System.out.println("Please type the year for the second date.");
			year = scnr.nextInt();
			
			System.out.println("Please type the month for the second date.");
			month = scnr.nextInt();
			month = month - 1;
			
			System.out.println("Please type the day for the second date.");
			day = scnr.nextInt();
			
			date2.set(year, month, day);
			
			//System.out.println("Date1: " + date1.getTime().toLocaleString() + " Date2: " + date2.getTime().toLocaleString());
			
			date2.getTimeInMillis();
			date1.getTimeInMillis();
			
			
		}

	}
