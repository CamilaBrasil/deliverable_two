import java.util.Calendar;
import java.util.Scanner;

public class PreWork_Lab1part2Main {

	public static void main(String[] args) {

		int millisDay = 86400000;
		int year;
		int month;
		int day;
		Calendar calendar = Calendar.getInstance();
		long epoch1;
		long epoch2;
		long differenceInDays;
		long yearsDiff;
		long daysDiff;

		Scanner scnr = new Scanner(System.in);

		// Asking the user to input the first date and rewriting the date1 with it.
		System.out.println("Please type the year for the first date.");
		year = scnr.nextInt();

		System.out.println("Please type the month for the first date.");
		month = scnr.nextInt();

		// Loop used to confirm that is a valid month.
		while (month < 1 || month > 12) {
			System.out.println("This is not a valid month, please enter another month");
			month = scnr.nextInt();
		}

		System.out.println("Please type the day for the first date.");
		day = scnr.nextInt();

		// In case the amount of days is not valid for the month entered, asks for
		// another day.
		while (!validateDay(year, month, day)) {
			System.out.println("This is not a valid day for this month, please enter another day");
			day = scnr.nextInt();
		}

		/*
		 * The Calendar class recognizes 0 being January and 1 being February, so is
		 * necessary to subtract one from the users input to get the right month
		 */
		month = month - 1;

		// Putting the input in a calendar setting.
		calendar.set(year, month, day);
		// Transforming the calendar value to epoch time.
		epoch1 = calendar.getTimeInMillis();

		// Asking the user to input the second date and rewriting the date1 with it.
		System.out.println("Please type the year for the second date.");
		year = scnr.nextInt();

		System.out.println("Please type the month for the second date.");
		month = scnr.nextInt();

		// Loop used to confirm that is a valid month.
		while (month < 1 || month > 12) {
			System.out.println("This is not a valid month, please type");
			month = scnr.nextInt();
		}

		System.out.println("Please type the day for the second date.");
		day = scnr.nextInt();

		// In case the amount of days is not valid for the month entered, asks for
		// another day.
		while (!validateDay(year, month, day)) {
			System.out.println("This is not a valid day for this month, please enter another day");
			day = scnr.nextInt();
		}

		/*
		 * The Calendar class recognizes 0 being January and 1 being February, so is
		 * necessary to subtract one from the users input to get the right month
		 */
		month = month - 1;

		// Putting the input in a calendar setting.
		calendar.set(year, month, day);
		// Transforming the calendar value to epoch time.
		epoch2 = calendar.getTimeInMillis();

		/*
		 * Subtracting the two epoch times and dividing by the amount of milliseconds
		 * per day, to get the amount of days. Taking the absolute value of it in case
		 * that the second date input is bigger then the first.
		 */
		differenceInDays = Math.abs((epoch1 - epoch2) / millisDay);

		// With the remainder of this modulus, we will have the amount of days that are
		// less then a year.
		daysDiff = differenceInDays % 365;

		// Subtracting the amount of days, to get the number that will divide evenly by
		// 365.
		differenceInDays = differenceInDays - daysDiff;

		// Dividing the mount of days left, and getting a round amount of years.
		yearsDiff = differenceInDays / 365;

		System.out.println(yearsDiff + " years and " + daysDiff + " days.");
	}

	// Method that it will test if days input are valid, based on leap years and
	// days in each month.
	public static boolean validateDay(int year, int month, int day) {

		// Checking if is a leap year.
		boolean leapYear = false;
		if ((year % 4) == 0) {
			leapYear = true;
		}

		boolean isValidDay = true;

		// Checking if is a valid amount of days for the month entered.
		switch (month) {

		case 1:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		case 2:
			// Checking if, in case of a leap year, the input is within the parameters.
			if (leapYear) {
				if (day > 29 || day < 1) {
					isValidDay = false;
				}
			} else {
				if (day > 28 || day < 1) {
					isValidDay = false;
				}
			}
			break;
		case 3:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		case 4:
			if (day > 30 || day < 1) {
				isValidDay = false;
			}
			break;
		case 5:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		case 6:
			if (day > 30 || day < 1) {
				isValidDay = false;
			}
			break;
		case 7:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		case 8:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		case 9:
			if (day > 30 || day < 1) {
				isValidDay = false;
			}
			break;
		case 10:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		case 11:
			if (day > 30 || day < 1) {
				isValidDay = false;
			}
			break;
		case 12:
			if (day > 31 || day < 1) {
				isValidDay = false;
			}
			break;
		default:
			System.out.println("This is not a valid month");
			break;
		}

		return isValidDay;
	}

}
