package begineer;
// Fibonacci series 0 1 1 2 3 5 8 13 ......
// input n (number of series required)
public class FibonacciSeries {
	
	
	void Fibonacci(int n) {
		int intialfibo=0;
		int nextfibo=1;
		System.out.print(intialfibo+" "+nextfibo+" ");
		
		for(int i=0;i<=n;i++) {
			int fibo=intialfibo + nextfibo;
			System.out.print(fibo+" ");
			intialfibo=nextfibo;
			nextfibo=fibo;
			
		}
	}
	public static void main(String[] args) {
		FibonacciSeries fb=new FibonacciSeries();
		fb.Fibonacci(20);
	}
	

}
