import java.util.Scanner;

public class PreWork_Lab1Main {

	public static void main(String[] args) {

		String userInput1;
		String userInput2;
		int userNum1 = 0;
		int userNum2 = 0;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter first number with three digits:");
		userInput1 = scnr.next();

		// Loop used to confirm that the first number has three digits.
		while (userInput1.length() != 3) {
			System.out.println("The number must have three digits, please enter again");
			userInput1 = scnr.next();
		}

		// Type-casting, string to integer.
		userNum1 = Integer.parseInt(userInput1);
		// System.out.println(userNum1);

		System.out.println("Please enter the second number with three digits:");
		userInput2 = scnr.next();

		// Loop used to confirm that the second number has three digits.
		while (userInput2.length() != 3) {
			System.out.println("The number must have three digits, please enter again");
			userInput2 = scnr.next();
		}

		// Type-casting (string to integer), it fails if is not a number.
		userNum2 = Integer.parseInt(userInput2);

		scnr.close();
		
		//Calling the method and iniciating a boolean with the value returned from it.
		boolean allSumEqual = allSumEqual(userNum1, userNum2);		
		
		//Printing the result of the boolean.
		System.out.println(allSumEqual);
		
	}

	public static boolean allSumEqual(int userNum1, int userNum2) {
		
		int sum1 = 0;
		int sum2 = 0;
		int temp1;
		int temp2;
		
		//Starting the response as true, and it will be rewritten false when it fails the if test.
		boolean allSumEqual = true;

		// Extrating the third digit of each number.
		temp1 = userNum1 % 10;
		temp2 = userNum2 % 10;

		// Adding the two third digits.
		sum1 = temp1 + temp2;

		// Eliminating the third digit from the original number.
		userNum1 = (userNum1 - temp1) / 10;
		userNum2 = (userNum2 - temp2) / 10;

		// It will loop twice, extracting, adding and comparing the second and the third
		// digits.
		for (int i = 0; i <= 1; i++) {
			// Extrating the second/third digit of each number.
			temp1 = userNum1 % 10;
			temp2 = userNum2 % 10;

			// Adding the two second/third digits.
			sum2 = temp1 + temp2;

			// Eliminating the second/third from the original number.
			userNum1 = (userNum1 - temp1) / 10;
			userNum2 = (userNum2 - temp2) / 10;

			/* It will test this condition while it loops, and it will break out if the two
			numbers are not equal, if it happens, it will rewrite the boolean*/
			if (sum1 != sum2) {
				allSumEqual = false;
				break;
			}
		}
		
		return allSumEqual;

	}
}