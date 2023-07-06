package excercises;

import java.util.List;

public class Exercise7 {

	public static void main(String[] args) {
		//Square every number in a List and a find the sum of squares
		
		List<Integer> numbers=List.of(1,2,3);
		
		int sum=printSquareandSumofThatSquareS(numbers);
		System.out.println(sum);
	}

	private static Integer printSquareandSumofThatSquareS(List<Integer> numbers) {

		
	return 	numbers.stream()
		.map(x->x*x)
		.reduce(0,Integer::sum);
	}
}
