package begineer;

import java.util.Scanner;

// print hello world n number of times , n is provided by the user . 
//create a non static method for that.
public class HelloWorld {

 void PrintHelloWorld(int n) {
	 for(int i=1;i<=n;i++) {
		 System.out.println("Hello World!");
	 }
 }
 
 public static void main(String[] args) {
	
	 HelloWorld hw=new HelloWorld();
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=s.nextInt();
	 
	 hw.PrintHelloWorld(n);
}
	
}
