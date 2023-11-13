package qspiders;

import java.util.Scanner;

public class Pallindrome {

	void checkPallindrome(int number) {
		int temp=number;
		int sum=0;
		int rem=0;
		while(temp>0) {
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(sum==number) System.out.println("It is a pallindrome number");
		else System.out.println("Not a pallindrome");
	}
	public static void main(String[] args) {
		Pallindrome p=new Pallindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int number=sc.nextInt();
		p.checkPallindrome(number);
	}
}
