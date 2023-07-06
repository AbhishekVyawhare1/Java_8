package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 2, 13, 4, 6, 4, 12, 15);
	
		
		filterandprint(numbers, x->x%2==0);
		
		filterandprint(numbers,  x->x%2==1);
		
		filterandprint(numbers,  x->x%3==0);
		//we are passing the alogorithim, hte strategy as a parameter. we are externalazing this strategy 
		
	}

	private static void filterandprint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
	       .filter(predicate)
	       .forEach(System.out::println);
	}
}


  
