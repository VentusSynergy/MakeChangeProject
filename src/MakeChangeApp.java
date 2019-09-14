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
		System.out.println("--------------------------------------------\n");

		if (amountPaid < itemPrice) {
			System.out.println("      ** ERROR **        ");
			System.out.println("You are short on money!!!");
		} else if (amountPaid == itemPrice) {
			System.out.println("     - You paid the full amount -\n");
			System.out.println("*****************************************");
			System.out.println("* Thank you, and have a wonderfull day! *");
			System.out.println("*****************************************");
			sc.close();

		} else {
			customersChange(amountPaid, itemPrice);

		}

	}

	public static void customersChange(double amountPaid, double itemPrice) {
		int amountPaidPennies = (int) (amountPaid * 100  + 0.005);
		int amountPricePennies = (int) (itemPrice * 100  + 0.005);
		int changeOwed = (amountPaidPennies - amountPricePennies);
		double finChangedOwed = (double)(changeOwed) / 100;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		if (changeOwed >= 2000) {
			do {
				twenty++;
				changeOwed -= 2000;
			} while (changeOwed >= 2000);
			
		}
		if (changeOwed >= 1000) {
			do {
				ten++;
				changeOwed -= 1000;
			} while (changeOwed >= 1000);
			
		}
		if (changeOwed >= 500) {
			do {
				five++;
				changeOwed -= 500;
			} while (changeOwed >= 500);
			
		}
		if (changeOwed >= 100) {
			do {
				dollars++;
				changeOwed -= 100;
			} while (changeOwed >= 100);

		}


		if (changeOwed >= 25) {
			do {
				quarters++;
				changeOwed -= 25;
			} while (changeOwed >= 25);

		}

		if (changeOwed >= 10) {
			do {
				dimes++;
				changeOwed -= 10;
			} while (changeOwed >= 10);
		}

		if (changeOwed >= 5) {
			do {
				nickels++;
				changeOwed -= 5;
			} while (changeOwed >= 5);
		}
		
		if (changeOwed >= 1) {
			do {
				pennies++;
				changeOwed--;
			}while (changeOwed >= 1);
		}
		System.out.println("You gave me: " + amountPaid + ".\nNow I owe you: " + finChangedOwed);
		System.out.println("So this is what I'll give you back...\nTwenties : " + twenty);
		System.out.println("Tens: " + ten + "\nFives: " + five + "\nOnes: " + dollars + "\nQuarters: " + quarters);
		System.out.println("Dimes: " + dimes + "\nNickles: " + nickels + "\nPennies: " + pennies);
		System.out.println("\n*****************************************");
		System.out.println("* Thank you, and have a wonderfull day! *");
		System.out.println("*****************************************");

		

	}
}