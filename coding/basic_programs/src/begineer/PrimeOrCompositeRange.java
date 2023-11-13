package begineer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOrCompositeRange {

	void Range(int start, int end) {
		int count = 0;
		List<Integer> prime = new ArrayList<>();
		List<Integer> composite = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			count=0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if(count==2) {
				prime.add(i);
			}else {
				composite.add(i);
			}
		}
		System.out.println("Prime : "+prime.toString());
		System.out.println("Composite : "+composite.toString());
	}
	
	public static void main(String[] args) {
		PrimeOrCompositeRange pcr=new PrimeOrCompositeRange();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range start point");
		int start=sc.nextInt();
		System.out.println("Enter range end point");
		int end=sc.nextInt();
		
		pcr.Range(start, end);
	}
}
