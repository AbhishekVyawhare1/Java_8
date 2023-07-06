package excercises;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise13 {

	
	public static void main(String[] args) {
		/*
		  Do Behaviour Parameterization for the mapping logic 
		  List Squarednumbers=numbers.stream().map(j->j*j).collect(Collectors.toList);
		 */
		
		List<Integer> numbers=List.of(10,20,30,30,405,023,34,34);
		
		
		
		mapandcreate(numbers, e->e);
		
		mapandcreate(numbers, e->e*e);
	}

	private static void Lismapandcreate(List<Integer> numbers, Object object) {
		// TODO Auto-generated method stub
		
	}

	private static void mapandcreate(List<Integer> numbers, Function<Integer, Integer> mappingfunction) {
		numbers.stream()
		       .map(mappingfunction)
		       .forEach(System.out::println);
	}
}
