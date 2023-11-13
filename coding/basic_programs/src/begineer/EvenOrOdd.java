package begineer;

import java.util.Scanner;

// check the enterned number is even or odd

// if user enter 0
// if user enter -10
// if user enter 0.5
public class EvenOrOdd {

	void CheckEvenOrOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("Entered number " + n + " is a Even Number");
		} else {
			System.out.println("Entered number " + n + " is a Odd Number");
		}
	}

	public static void main(String[] args) {
		EvenOrOdd check = new EvenOrOdd();
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the number to check");
			int number = s.nextInt();

			if (number == 0) {
				System.out.println("0 is a even number");
			} else if (number < 0) {
				System.out.println("Even number starts from 0 , so please enter number greater than 0");
			} else {

				check.CheckEvenOrOdd(number);
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid real number");
		}
	}

}
