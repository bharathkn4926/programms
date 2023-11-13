package qspiders;

import java.util.Scanner;

public class Factorial {

	long Factorial(int number) {
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Factorial fac=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println( fac.Factorial(number));
	}
}
