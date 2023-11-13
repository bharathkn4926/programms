package advancedpatterns;

public class NumberTriangle {
	
	//     1
	//    2 2
	//   3 3 3
	//  4 4 4 4
	// 5 5 5 5 5

	public static void main(String[] args) {
		int n=9;
		
		for(int i=1;i<=n;i++) {
			int spaces=n-i;
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
