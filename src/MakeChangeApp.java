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
		double changeOwed = (amountPaid - itemPrice);
		double dollars = 0;
		double quarters = 0;
		double dimes = 0;
		double nickels = 0;
		double pennies = 0;

		changeOwed = changeOwed * 100;
		Math.floor(changeOwed);
		int j = (int) changeOwed;
		double b = (double) j;
		b = b / 100;

		if (b >= 1) {
			do {
				dollars++;
				b -= 1;
			} while (b >= 1);

		}
		b = b * 100;
		Math.floor(b);
		j = (int) b;
		b = (double) j;
		b = b / 100;

		if (b >= 0.25) {
			do {
				quarters++;
				b -= 0.25;
			} while (b >= 0.25);

		}
		b = b * 100;
		Math.floor(b);
		j = (int) b;
		b = (double) j;
		b = b / 100;

		if (b >= 0.10) {
			do {
				dimes++;
				b -= 0.10;
			} while (b >= 0.10);
		}
		b = b * 100;
		Math.floor(b);
		j = (int) b;
		b = (double) j;
		b = b / 100;

		if (b >= 0.05) {
			do {
				nickels++;
				b -= 0.05;
			} while (b >= 0.05);
		}
//		b = b * 100;
//		Math.floor(b);
//		j = (int) b;
//		b = (double) j;
//		pennies = b;
//		System.out.println(b);
		
		System.out.println("\n" + dollars);
		System.out.println(quarters);
		System.out.println(dimes);
		System.out.println(nickels);
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