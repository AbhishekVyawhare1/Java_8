package excercises;

import java.util.List;

public class Exercise5 {

	
	//Print a Cube of ODD Numbers
	public static void main(String[] args) {
		List<Integer> Numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		FindOddNumbersCube(Numbers);
	}

	
	private static void FindOddNumbersCube(List<Integer> numbers) {
		
		/*
		 * numbers.stream() .filter(num -> num % 2 == 1) .map(x-> x*x*x)
		 * .forEach(System.out::println);
		 */

	
	numbers.stream()
	       .reduce(0,Integer::sum);
	       
	}
}
