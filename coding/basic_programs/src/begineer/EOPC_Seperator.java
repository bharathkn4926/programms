package begineer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//input 0 to 10 
/*output : 
	even [0,2,4,8,10]
	odd [1,3,5,7,9]
	Prime [3,5,7]
	Composite [2,4,6,8,9,10]*/

// edge cases , 1 is not prime nor composite 
public class EOPC_Seperator {
	
	void EPOC(int a,int b) {
		if(a<0||b<0 ||b<a) {
			System.out.println("enter proper range");
		}else {
		getEvenOdd( a,b);
		getPrimeComposite(a,b);
		}
	}

	void getPrimeComposite(int a, int b) {
		int count=0;
		List<Integer> prime=new ArrayList<>();
		List<Integer> composite=new ArrayList<>();
		
		for(int i=a;i<=b;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				prime.add(i);
			}else if(count>2){
				composite.add(i);
			}
		}
		System.out.println("Prime : "+prime.toString());
		System.out.println("Composite : "+composite.toString());	
	}

	void getEvenOdd(int a, int b) {
		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		System.out.println("Even : "+even.toString());
		System.out.println("Odd : "+odd.toString());		
	}
	
	public static void main(String[] args) {
		EOPC_Seperator sp=new EOPC_Seperator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range start");
		int start=sc.nextInt();
		System.out.println("Enter the range end");
		int end=sc.nextInt();
		
		sp.EPOC(start, end);
	}

}
