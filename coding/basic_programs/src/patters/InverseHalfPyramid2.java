package patters;

public class InverseHalfPyramid2 {
//	*****
//	 ****
//	  ***
//	   **
//	    *
	public static void main(String[] args) {
		int row=5;
		
		for(int i=row;i>=1;i--) {
			for(int j=row-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
