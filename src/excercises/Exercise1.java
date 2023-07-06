package excercises;

import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		PrintAllOddNumbersFromList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

//	private static boolean OodNum(int N) {
//		return N%2==0;
//		
//	}
	private static void PrintAllOddNumbersFromList(List<Integer> numbers) {

		
		numbers.stream()
		       .filter(N->N%2!=0)//Lambda Expression
		       .forEach(System.out::println);//method reference
	}
}
