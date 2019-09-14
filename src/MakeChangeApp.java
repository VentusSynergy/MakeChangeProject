import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double itemPrice;
		double amountPaid;

		System.out.println("How much does the item cost?: ");
		itemPrice = sc.nextDouble();
		System.out.println("\nHow much $ is being paid?: ");
		amountPaid = sc.nextDouble();

		if (amountPaid < itemPrice) {
			System.out.println("You are short on $ $ $ !");
		} else if (amountPaid == itemPrice) {
			System.out.println("You paid the full amount, thank you!");

		} else {
			customersChange(amountPaid, itemPrice);

		}

	}

	public static void customersChange(double amountPaid, double itemPrice) {
		int amountPaidPennies = (int) (amountPaid * 100  + 0.005);
		int amountPricePennies = (int) (itemPrice * 100  + 0.005);
		int changeOwed = (amountPaidPennies - amountPricePennies);
		int five = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		System.out.println(changeOwed);
		int j = (int) changeOwed;
		double b = (double) j;
		System.out.println(j);
		b = b / 100;
		
		if (changeOwed >= 500) {
			do {
				five++;
				changeOwed -= 500;
			} while (changeOwed >= 500);
			
		}
		System.out.println( "fives" + five);
		if (changeOwed >= 100) {
			do {
				dollars++;
				changeOwed -= 100;
			} while (changeOwed >= 100);

		}
		System.out.println( "dollars" + dollars);


		if (changeOwed >= 25) {
			do {
				quarters++;
				changeOwed -= 25;
			} while (changeOwed >= 25);

		}
		System.out.println("quarters" +quarters);

		if (changeOwed >= 10) {
			do {
				dimes++;
				changeOwed -= 10;
			} while (changeOwed >= 10);
		}
		System.out.println("dimes" + dimes);

		if (changeOwed >= 5) {
			do {
				nickels++;
				changeOwed -= 5;
			} while (changeOwed >= 5);
		}
		System.out.println("nickels" + nickels);
		
		if (changeOwed >= 1) {
			do {
				pennies++;
				changeOwed--;
			}while (changeOwed >= 1);
		}
		System.out.println("pennies" + pennies);
//		b = b * 100;
//		Math.floor(b);
//		j = (int) b;
//		b = (double) j;
//		pennies = b;
//		System.out.println(b);
		

//		System.out.println(pennies);
//		b = b / 100;

//		if (b >= 0.01) {
//			do {
//				pennies++;
//				b -= 0.01;
//			} while (b >= 0.01);
//		}

	}
}