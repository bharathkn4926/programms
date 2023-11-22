package streams;

import java.util.List;

//input = List<Integer> numbers= List.of(1,2,3,55,32,67,89,9,22,43,55,31234);
//output = sum of list elements;
public class AddNumbersOfList {

	private static void sumOfElements(List<Integer> numbers) {
		
		// normal approach
		/*
		 * int sum =0; 
		 * for(int number:numbers) { 
		 * sum =sum+number; 
		 * }
		 * System.out.println(sum);
		 */
		int sum=numbers.stream().
				reduce(0,AddNumbersOfList::sum);
		System.out.println(sum);
	}
	 
	private static int sum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers= List.of(1,2,3,55,32,67,89,9,22,43,55,31234);
		sumOfElements(numbers);
	}
}
