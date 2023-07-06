package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
//		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

		List<Integer> num = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListFunctional(num);
		printAllEvenNumbersSuareInListFunctional(num);
	}

//	private static void print(int num) {
//		System.out.println(num);
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
//convert List into stream
		// [12, 9, 13, 4, 6, 2, 4, 12, 15]
		// 12
		// 9
		// 13
		// 4
		// 6
		// 2
		// 4
		// 12
		// 15

		// What to Do?
		numbers.stream().forEach(System.out::println);// Method Reference
	}

//	private static boolean isEven(int num) {
//		return num % 2 == 0;
//	}

	private static void printAllEvenNumbersSuareInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(num -> num % 2 == 0)// lambda Expression
				// mapping- x->x*x
				.map(x -> x * x).forEach(System.out::println);// Method Reference
//		numbers.stream()
//		       .filter(FP01Functional::isEven)// Filter: Only Allow Even Numbers
//			   .forEach(System.out::print);// Method Reference
	}

}
