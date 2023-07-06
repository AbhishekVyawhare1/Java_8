package excercises;

import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		List<String> courses = List.of("spring", "springBoot", "API", "microservices", "AWS", "PCF", "DOCKER",
				"KUBERNATES");
		PrintSpringcontainingLetters(courses);
	}

	
//	private static boolean OnlySpring(String S) {
//		return S.contains("spring");
//	}
	private static void PrintSpringcontainingLetters(List<String> courses) {

		// First appro by creating method OnlySpring
//		courses.stream()
//		       .filter(Exercise3::OnlySpring)
//		       .forEach(System.out::println);
		
		
		//second Approch Using Lambda Expression
		courses.stream()
	           .filter(C->C.contains("spring"))       
		       .forEach(System.out::println);
	}
}
