package qspiders;

import java.util.Scanner;

//1st 10 fibonacci series numbers 
//0 1 1 2 3 ....... 
public class Fibonacci {

	void fiboSeries(int number) {
			int intial=0;
			int next=1;
			int fibo=0;
			System.out.print(intial+" "+next+" ");
			for(int i=1;i<=number-2;i++) {
				fibo=intial+next;
				System.out.print(fibo+" ");
				intial=next;
				next=fibo;
			}
	}
	
	public static void main(String[] args) {
		Fibonacci fb=new Fibonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of fibonacci series required");
		int number=sc.nextInt();
		fb.fiboSeries(number);
	}
	
}
