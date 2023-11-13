package qspiders;

import java.util.Scanner;

public class EvenOdd {
	
	String checkEvenOdd(int number) {
		if(number%2==0) return "Even number";
		else return "Odd number";
	}
	
	public static void main(String[] args) {
		EvenOdd eo=new EvenOdd();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		String output=eo.checkEvenOdd(number);
		System.out.println(output);
	}

}
