package patters;

public class SolidRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
  output: 
  
**********
**********
**********
**********
**********
		 
		 */
		
		int row=5;
		int column=10;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
