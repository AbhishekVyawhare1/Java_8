package programming;

import java.util.List;

public class FP01Stuctured2 {

	public static void main(String[] args) {

		List<Integer> num = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int Number=printSumOfAllnumbersList(num);
		System.out.println(Number);
	}

	private static int printSumOfAllnumbersList(List<Integer> num) {

		//How to Loop?
		//How to Store the sum?
		int sum = 0;
		for (int n : num) {
			sum = sum + n;
		}
		return sum;

	}

}
