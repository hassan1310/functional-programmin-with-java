package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(1,2,3,4,8,6,7,8,9);
		  System.out.println("Print All Numbers");
		  printAllNumbersInListFunctional(numbers);
		  
		  System.out.println("Print Even Numbers Only");
		  printEvenNumbersInListFunctional(numbers);
		  
		  System.out.println("Print Odd Numbers Only");
		  printOddNumbersInListFunctional(numbers);
		 
		
		
		  System.out.println("PrintSquare of Odd Numbers Only");
		  printDquareofOddNumbersInListFunctional(numbers);
		 
		
		
		  List<String>courses=List.of("Spring","Spring Boot","Microservices","AWS","Docker");
		  
		  
		  System.out.println("Print All Courses"); 
		  printAllCourses(courses);
		  System.out.println("Print Courses Contains Spring");
		  printCoursesContainsSpring(courses);
		  
		  System.out.println("Print Courses More Than 4 Letters");
		  printCoursesMoreThan4Letters(courses);
		 
		
		
		 System.out.println("Print Courses Character Length");
		 printCoursesCharLength(courses);
		 

	}
	

	private static void printCoursesCharLength(List<String> courses) {
		courses.stream().map(course->course+": "+course.length()).forEach(System.out::println);
		
	}


	private static void printCoursesMoreThan4Letters(List<String> courses) {
		courses.stream().filter(c->c.length()>4).forEach(System.out::println);
		
	}

	private static void printCoursesContainsSpring(List<String> courses) {
		courses.stream().filter(c->c.contains("Spring")).forEach(System.out::println);
		
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}


	private static void printAllNumbersInListFunctional(List<Integer>numbers) {
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer>numbers) {
		numbers.stream().filter(n-> n%2==0).forEach(System.out::println);
	}
	
	
	private static void printOddNumbersInListFunctional(List<Integer>numbers) {
		numbers.stream().filter(n-> n%2!=0).forEach(System.out::println);
	}
	
	private static void printDquareofOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(n-> n%2!=0).map(n->n*n).forEach(System.out::println);
		
	}
	
	

}
