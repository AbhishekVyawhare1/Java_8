package excercises;

import java.util.List;

public class Exercise9 {

	public static void main(String[] args) {
		// find sum of All Odd numbers in List

		List<Integer> Numbers = List.of(1, 2, 5);
		int num = findOddNumbersAndThereSum(Numbers);
		System.out.println(num);
	}

	private static int findOddNumbersAndThereSum(List<Integer> numbers) {

		return numbers.stream().filter(no -> no % 2 == 1).reduce(0, Integer::sum);

	}
}
