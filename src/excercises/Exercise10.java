package excercises;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

	
	public static void main(String[] args) {
		//create a List with even Numbers Filtered from the Number List
		
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> EvenNujmbersList=numbers.stream()
				                              .filter(num->num%2==0)
				                              .collect(Collectors.toList());
		System.out.println(EvenNujmbersList);
	}

	
}
