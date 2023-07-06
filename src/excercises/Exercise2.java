package excercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

	// Print All Courses Individually
	public static void main(String[] args) {

		List<String> courses = List.of("spring", "springBoot", "API", "microservices", "AWS", "PCF", "DOCKER",
				"KUBERNATES");

		printOnlySpringContails(courses);

	}

	private static void printOnlySpringContails(List<String> courses) {

		courses.stream().forEach(System.out::println);

	}

}
