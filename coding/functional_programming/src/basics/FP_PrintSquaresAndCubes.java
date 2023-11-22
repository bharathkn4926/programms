package basics;

import java.util.ArrayList;
import java.util.List;

public class FP_PrintSquaresAndCubes {

	public static void main(String[] args) {
		List<Integer> numbers= List.of(1,2,3,4,5,6,7,8,9);
		System.out.println("Squares :");
		printSquaers(numbers);
		System.out.println();
		System.out.println("Cubes :");
		printCubes(numbers);
	}

	private static void printCubes(List<Integer> numbers) {
		numbers.stream()
		.map(number -> number*number*number)
		.forEach(System.out::println);
		
	}

	private static void printSquaers(List<Integer> numbers) {
		
		numbers.stream()
			.map(number -> number*number)
			.forEach(System.out::println);                     
	}

}
