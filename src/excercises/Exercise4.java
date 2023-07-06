package excercises;

import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {
		List<String> courses=
				List.of("spring", "springBoot", "API", "microservices", "AWS", "PCF", "DOCKER", "KUBERNATES");
	
	
		PrintAllCoursesContaningAtLeast$Letters(courses);
	}

	private static void PrintAllCoursesContaningAtLeast$Letters(List<String> courses) {

		courses.stream()
		.filter(A -> A.length()>=4)
		.forEach(System.out::println);
	}
}
