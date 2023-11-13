package begineer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOrOddRange {
	
	void EvenOdd(int a , int b) {
		List<Integer> evenlist=new ArrayList<>();
		List<Integer> oddList=new ArrayList<>();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				evenlist.add(i);
			}
			else {
				oddList.add(i);
			}
		}	
	System.out.println("Even numbers of the range "+evenlist.toString());
	System.out.println("Odd numbers of the range "+oddList.toString());
	}
	
	
	public static void main(String[] args) {
		EvenOrOddRange eo=new EvenOrOddRange();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the range start number");
		int start=s.nextInt();
		System.out.println("Enter the range end number");
		int end=s.nextInt();
		
		eo.EvenOdd(start, end);
	}

}
