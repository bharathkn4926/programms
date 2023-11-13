package begineer;

import java.util.Scanner;

public class PrimeOrComposite {

	void CheckPrimeOrComp(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Enterned number " + n + " is a prime number");
		} else {
			System.out.println("Enterned number " + n + " is a composite number");
		}
	}

	public static void main(String[] args) {
		PrimeOrComposite pc = new PrimeOrComposite();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int number = sc.nextInt();
			if (number <= 0) {
				System.out.println("Please enter number more than 1");
			} else if (number == 1) {
				System.out.println("Enterned number " + number + " is a prime number");
			} else {
				pc.CheckPrimeOrComp(number);
			}
		} catch (Exception e) {
			System.out.println("please enter a valid number greater than 1");
		}
	}
}
