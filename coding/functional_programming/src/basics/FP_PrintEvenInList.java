package basics;

import java.util.List;

public class FP_PrintEvenInList {
	
	private static void evenNumbers(List<Integer> numbers) {
		System.out.println("Even numbers: ");
		numbers.stream()
			.filter(number->number%2==0) // lambda expression to find even or odd
			.forEach(System.out::println);// method refrence
	}
	
	private static void oddNumbers(List<Integer> numbers) {
		System.out.println("Odd numbers: ");
		numbers.stream()
			.filter(number->number%2!=0) // lambda expression to find even or odd
			.forEach(System.out::println);// method refrence
	}

	public static void main(String[] args) {
		
		evenNumbers(List.of(12,31,5477,98,7657,0123));
		oddNumbers(List.of(12,31,5477,98,7657,0123));

	}

}
