import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

public class PreWork_Lab1part2Main {

	public static void main(String[] args) {

		int year;
		int month;
		int day;
		LocalDate date1;
		LocalDate date2;
		Period period;

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

		// Creating a LocalDate variable from the input.
		date1 = LocalDate.of(year, month, day);

		// Asking the user to input the second date and rewriting the date1 with it.
		System.out.println("Please type the year for the second date.");
		year = scnr.nextInt();

		System.out.println("Please type the month for the second date.");
		month = scnr.nextInt();

		// Loop used to confirm that is a valid month.
		while (month < 1 || month > 12) {
			System.out.println("This is not a valid month, please enter another month");
			month = scnr.nextInt();
		}

		System.out.println("Please type the day for the second date.");
		day = scnr.nextInt();

		// In case the day entered is not valid for the month entered, asks for
		// another day.
		while (!validateDay(year, month, day)) {
			System.out.println("This is not a valid day for this month, please enter another day");
			day = scnr.nextInt();
		}

		// Creating a LocalDate variable from the input.
		date2 = LocalDate.of(year, month, day);

		/*
		 * Checking which date is smaller then the other and getting the difference
		 * between the two dates in the right order.
		 */
		if (date2.isBefore(date1)) {
			period = Period.between(date2, date1);
		} else {
			period = Period.between(date1, date2);
		}

		// Extracting the values from the period variable and transforming in readable
		// information.
		System.out.println("There are " + period.get(ChronoUnit.YEARS) + " years, " + period.get(ChronoUnit.MONTHS)
				+ " months and " + period.get(ChronoUnit.DAYS) + " days between these dates.");

		scnr.close();

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
