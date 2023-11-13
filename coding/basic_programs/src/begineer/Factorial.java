package begineer;

import java.util.Scanner;

// input : 7
//operation : 7*6*5*4*3*2*1;

// edge condition: 
public class Factorial {

	int Fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int n = s.nextInt();
			if (n == 0) {
				System.out.println("Factorial : " + 0);
			} else if (n < 0) {
				System.out.println("Enter the number greater than 0");
			} else
				System.out.println("Factorial : " + fact.Fact(n));

		} catch (Exception e) {
			System.out.println("Please enter a valid real number");
		}

	}
}
