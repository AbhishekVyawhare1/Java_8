package excercises;

import java.util.List;

public class Exercise6 {

	public static void main(String[] args) {
		List<String> courses=List.of("spring", "springBoot", "API", "microservices", "AWS", "PCF", "DOCKER",
				"KUBERNATES");

	
		
		printAllLengthcourses(courses);
	}

	private static void printAllLengthcourses(List<String> courses) {
		courses.stream().map(a->a+" "+a.length()).forEach(System.out::println);
		
	}
}
