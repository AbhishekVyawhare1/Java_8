package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
//		printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		List<Integer>numbers=List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListStructured(numbers);
		printAllEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {

		// How to Loop the Numbers
		for (int num : numbers) {
			System.out.print(num);
		}
	}

	
	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {

		// How to Loop the Numbers
		for (int num : numbers) {
			if(num%2==0)
			System.out.print(num);
		}
	}
}
