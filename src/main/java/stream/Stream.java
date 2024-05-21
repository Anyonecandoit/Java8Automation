 package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {

		List<Integer>  numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		numbers
		.stream()
		.forEach(e -> System.out.print(e));

		System.out.println(" ");

		numbers
		.stream()
		.filter(e->e%2==0)
		.forEach(e -> System.out.print(e));

		System.out.println();

		numbers
		.stream()
		.filter(e->e%2==0)
		.map(e->e*e)
		.forEach(e -> System.out.print(e + " "));

		System.out.println();

		numbers
		.stream()
		.filter(e->e%2==0)
		.map(e-> "numbers :" + e*e)
		.forEach(e -> System.out.print(e + " "));

		System.out.println();

		numbers
		.stream()
		.filter(e->e%2==0)
		.map(e-> List.of(e*2, e*3, e*3))
		.forEach(e -> System.out.print(e + " "));


		System.out.println();
		// its not working 

		//		System.out.println();
		//		numbers
		//		.stream()
		//		.flatMap(e->List.of)
		//	.forEach(e -> System.out.print(e + " "));

		System.out.println();

		//reduce 
		System.out.println(numbers
				.stream()
				.filter(e->e%2==0)
				.map(e->e*e)
				.reduce(0, (a, b) -> a+b));

		System.out.println();

		// both ways we can use either a=b or sum with generics
		System.out.print(numbers
				.stream()

				.filter(e->e%2==0)
				.peek(e->System.out.println(e))
				.mapToInt(e->e*e)

				.reduce(0, Integer::sum));


		System.out.println();

		
		// it not returning array need to check
		int[] k = numbers
				.stream()
				.filter(e->e%2==0)
				.peek(e->System.out.println(e))
				.mapToInt(e->e*e)
				.toArray();
				System.out.println(k);
				

				System.out.println();

				List<Integer> k1 = numbers
						.stream()
						.filter(e->e%2==0)
						.peek(e->System.out.println(e))
						
						.toList();
						System.out.println(k1);

//allmatch , anymatch , none match , skip , limit,count, distinct,findany,findfirst,sorted
						//
						
						
	}

}
