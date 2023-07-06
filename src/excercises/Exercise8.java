package excercises;

import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
		//Cube Every number In A List And Sum All Cubes
		
		List<Integer> cubeNumber=List.of(1,2,3,4,5,0);
		int sum=CubeAndSumofAllCubes(cubeNumber);
		System.out.println(sum);
	}

	private static int CubeAndSumofAllCubes(List<Integer> cubeNumber) {

		
		return cubeNumber.stream()
		          .map(x->x*x*x)
		          .reduce(0,Integer::sum);
	}
}
