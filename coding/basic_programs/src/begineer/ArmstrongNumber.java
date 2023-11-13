package begineer;

import java.util.Scanner;

// number is abc , abc=a^3+b^3+c^3.
public class ArmstrongNumber {
	
	void CheckArmstrongNumber (int n) {
		int number=n;
		int digits=0;
		
		while(number>0) {
			number=number%10;
			digits++;
		}
		
	
		int temp=n;
		double sum=0;
		int rem=0;

		
		
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, digits);
			temp=temp/10;
		}
		
		if(sum==n) {
			System.out.println("The number is armstrong number");
		}
		else {
			System.out.println("The number is not a arm strong number");
		}
	}
	
	public static void main(String[] args) {
		ArmstrongNumber rem=new ArmstrongNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for armstrong");
		int number=sc.nextInt();
		rem.CheckArmstrongNumber(number);
	}

}
