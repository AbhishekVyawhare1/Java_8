package excercises;

import java.util.List;
import java.util.function.BinaryOperator;

public class Exercise12 {
	/*
	  Find Function interface behind the second argument of reduce method . Create
	  and implementation for the Functional interface
	  int sum=numbers.stream().reduce(0,Integer::sum);
	*/
	public static void main(String[] args) {
		List<Integer> numbers=List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		BinaryOperator<Integer> SumBinaryOperator = Integer::sum;
		
		BinaryOperator<Integer> SumBinaryOperator2=new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		int num =numbers.stream()
		       .reduce(0,SumBinaryOperator2);
		
		
		System.out.println(num);
	}
}
