package qspiders;

import java.util.Scanner;

public class ArmStrong {
	
	void checkArmStrong(int number) {
		
		//abc=a^3+b^3+c^3
		
		int digits=0;
		int temp=number;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		
		double sum=0;
		int temp2=number;
		int rem=0;
		while(temp2>0) {
			rem=temp2%10;
			sum=sum+(Math.pow(rem, digits));
			temp2=temp2/10;
		}
		
		if(sum==number) {
			System.out.println("This is a armstrong number");
		}else System.out.println("Not armstrong");
	}
public static void main(String[] args) {
	ArmStrong arm=new ArmStrong();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	
	arm.checkArmStrong(number);
}
}
