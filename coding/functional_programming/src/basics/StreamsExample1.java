package basics;

import java.util.List;

// print the numbers of list
public class StreamsExample1 {
	
	private static void printTheNumberOfTheList(List<Integer> numbers) {
		//normal approach
		/*
		 * for(int number:numbers) { System.out.println(number); }
		 */
		
		//funtional approach
		
		numbers.stream().forEach(StreamsExample1::print); // method reference
	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		
		
		printTheNumberOfTheList(List.of(12,3,4,5,6,7,9,111,234,435));

	}

}
