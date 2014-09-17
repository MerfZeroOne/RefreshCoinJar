/**
 * Specification: Write a program that determines the value of the coins in a jar and prints the total 
 * in dollars and scents. Read integer values that represent the number of quarters,dimes, nickels and pennies.
 * 
 * @author MerfZeroOne
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class CoinJarCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Declare variables
		 */
		int numQuarters, numDimes, numNickels, numPennies;
		double quarterTotal, dimeTotal, nickelTotal, pennyTotal, grandTotal;
		String answer;

		/**
		 * Create scanner and specify format for currency output
		 */
		Scanner scan1 = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
			/**
			 * do loop, to run until told otherwise
			 */
		do {
			/**
			 * solution: taking scanned values and multiplying them by the
			 * currency values, totaling them afterwards.
			 */
			System.out.println("Welcome to the coin counter, user!");
			System.out.println("Enter the amount of quarters :");
			numQuarters = scan1.nextInt();
			quarterTotal = (numQuarters * .25);

			System.out.println("Enter the amount of dimes :");
			numDimes = scan1.nextInt();
			dimeTotal = (numDimes * .1);

			System.out.println("Enter the amount of nickels :");
			numNickels = scan1.nextInt();
			nickelTotal = (numNickels * .05);

			System.out.println("Enter the amount of pennies :");
			numPennies = scan1.nextInt();
			pennyTotal = (numPennies * .01);

			grandTotal = (quarterTotal + dimeTotal + nickelTotal + pennyTotal);

			/**
			 * output for solution
			 */
			System.out.println("Amount in quarters: "
					+ currency.format(quarterTotal));
			System.out.println("Amount in dimes:    "
					+ currency.format(dimeTotal));
			System.out.println("Amount in nickels:  "
					+ currency.format(nickelTotal));
			System.out.println("Amount in pennies:  "
					+ currency.format(pennyTotal));
			System.out.println("Amount in total:    "
					+ currency.format(grandTotal));

			System.out.println("Count again? y/n");

			answer = scan1.next();
		/**
		 * do loop end condition
		 */
		} while (!answer.equals("n") || !answer.equals("n"));
		/**
		 * close the scanner scan1
		 */
		scan1.close();
		System.exit(0);
	}

}
