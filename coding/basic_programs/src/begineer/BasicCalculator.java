package begineer;
// calculator to do basic "+","-","*","/" operations.should handle decimals .
// basic need for only 2 numbers.


public class BasicCalculator {

	void Add(double a , double b) {
		double c =a+b;
		System.out.println("Sum : "+c);
	}
	void Sub(double a , double b) {
		double c=a-b;
		System.out.println("Sub : "+c);
	}
	void Mul(double a , double b) {
		double c=a*b;
		System.out.println("Mul : "+c);
	}
	void Div(double a , double b) {
		double c=a/b;
		System.out.println("Div : "+c);
	}
	
	
	//Same methods using lambda
	public static void main(String[] args) {
		BasicCalculator cal =new BasicCalculator();
		cal.Add(10, 20);
		cal.Sub(20,15);
		cal.Mul(10, 3);
		cal.Div(10, 2);
	}
	
}


