package begineer;

import java.util.Scanner;

public class PallindromeNumber {

	void checkPallindrome(int number) {
		
		int input=number;
		int temp = input;
		int rem=0;
		int sum=0;
		
		while(input>0) {
			rem=input%10;
			sum=(sum*10)+rem;
			
			input=input/10;
		}
		
		if(temp==sum) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		PallindromeNumber pn=new PallindromeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		pn.checkPallindrome(number);
	}
}
