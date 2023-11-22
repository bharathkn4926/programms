package basics;

import java.util.List;

public class FP_CoursesExcercise {
	
	private static void printCourses(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);
	}
	
	private static void printCoursesContain(List<String> courses) {
		courses.stream()
			.filter(str -> str.contains("Spring"))
			.forEach(System.out::println);
	}
	
	private static void printCoursesContainCount(List<String> courses) {
		courses.stream()
			.filter(str -> str.length()>=5)
			.forEach(System.out::println);
	}
	

	public static void main(String[] args) {
		
		List<String> courses = List.of("Java","Spring boot","Spring","Swing","Selenimu","AWS","Gcp","Angular","Docker");
		printCourses(courses); // to print the courses 
		System.out.println();
		printCoursesContain(courses); // to print the courses containing the word Spring
		System.out.println();
		printCoursesContainCount(courses); // to print the courses containing atleast 5 letters
	}

}
