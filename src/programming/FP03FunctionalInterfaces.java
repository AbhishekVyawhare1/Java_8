package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//another way at backend for filter
/*
  boolean isEven(int x) {
  	return f%2==0;
  }
*/

//Backend working map method
/*
  int Squared(int x){
    return x*x;
  }
*/ 
public class FP03FunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 2, 13, 4, 6, 4, 12, 15);
		
		Predicate< Integer> isEvenpredicate = f->f%2==0;
		
		//As Predicate instance created behind the filter which is stream method 
		//And behind predicate below method get execute 
		Predicate< Integer> isEvenpredicate2=new Predicate<Integer>() {

			@Override
			public boolean test(Integer f) {
				// TODO Auto-generated method stub
				return f%2==0;
			}
		};
    		
		Function< Integer,  Integer> Squaremapper = g->g*g;
		
		Function< Integer,  Integer> Squaremapper2=new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer g) {
				return g*g;
			}
		};
		
		Consumer< Integer> sysoutConsumer = System.out::println;
		
		Consumer< Integer> sysoutConsumer2=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		numbers.stream()
		       .filter(isEvenpredicate2)// backend of filter method Predicate instance is created we can look at line no 26
		       .map(Squaremapper2)//Backend of map method Function method instance is created  
		       .forEach(sysoutConsumer2);//Backend of forEach method Consumer instance is created 
		       
	}
}


  
