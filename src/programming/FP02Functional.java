package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> num = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int Number=printSumOfAllnumbersList(num);
		
		System.out.println(Number);
		
	}

//	private static int sum(int aggregate,int Nextnumber) {
//		return aggregate+Nextnumber;
//	}
	private static int printSumOfAllnumbersList(List<Integer> num) {
		
		//stream of result->One result Value
		//Combine them into one result=>value
		//0 and FP01Functional::sum
		 return num.stream()
//		   .reduce(0,FP02Functional::sum);//Using Method or creating method sum we can add all numbers
//				 .reduce(0, (x,y)->x+y);// on e more Apporach Using Lamba to make sum
				 .reduce(0,Integer::sum);//Already predefined function to do the Addition
	}

	

}
