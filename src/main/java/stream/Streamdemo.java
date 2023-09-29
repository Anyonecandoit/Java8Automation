package stream;

import java.util.List;
import java.util.OptionalDouble;

public class Streamdemo {

	public static void main(String[] args) {


		List<Employee> employeeList = EmployeeManager.get();

		// employeeList.stream().forEach(e->System.out.println(e));


		//		 employeeList.stream().filter(e->e.getSalary()>47000)
		//		.filter(e->e.getFirstName().startsWith("A"))
		//		 .forEach(e->System.out.println(e));
		//		 

		System.out.println();


		//When you use two consecutive sorted operations as you have done, the second sorted operation will override the sorting order established by the first one. To sort by both first name and last name, you can use a single sorted operation with a combined comparator. 
		//		 employeeList.stream()
		//		 .sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
		//		    .sorted((e1, e2) -> e1.getLastName().compareTo(e2.getLastName()))
		//		    .filter(e -> e.getSalary() > 47000)
		//		    .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));


		//		 employeeList.stream()
		//		    .sorted(Comparator.comparing(Employee::getLastName)
		//		        .thenComparing(Employee::getFirstName))
		//		    .filter(e -> e.getSalary() > 47000)
		//		    .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

		System.out.println();
		//				
		//				employeeList.stream()
		//			    .sorted(Comparator.comparing(Employee::getFirstName)
		//			        .thenComparing(Employee::getLastName))
		//			    .filter(e -> e.getSalary() > 47000)
		//			    .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));
		// we can call sort method like this also  
		System.out.println();
		//		 employeeList.stream()
		//		    .sorted((e1, e2) -> {
		//		        int lastNameComparison = e1.getLastName().compareTo(e2.getLastName());
		//		        if (lastNameComparison == 0) {
		//		            return e1.getFirstName().compareTo(e2.getFirstName());
		//		        }
		//		        return lastNameComparison;
		//		    })
		//		    .filter(e -> e.getSalary() > 47000)
		//		    .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

		System.out.println();

		long c = 	employeeList.stream()
				.filter(e -> e.getSalary()>45000)
				.map(e -> e.getFirstName())
				.distinct()
				.sorted()
				.count();

		// how can i print names also ????

		System.out.println(c  );
		//.forEach(e -> System.out.println(e + " " ));


		System.out.println();

		// using reduce

		Double 	salary =   employeeList.stream()
				.filter(e -> e.getDepartment().equals("IT"))
				.map(e -> e.getSalary())
				.reduce( (double) 0, (a, b) -> a+b);

		System.out.println(salary);


		//using sum  -- specialised reduce 

		Double 	salary1 =   employeeList.stream()
				.filter(e -> e.getDepartment().equals("IT"))
				.mapToDouble(e -> e.getSalary())

				.sum();

		System.out.println(salary1);


		System.out.println();

		// what is optional double ????


		OptionalDouble maxsalary = employeeList.stream().mapToDouble(e -> e.getSalary())
				.max();

		System.out.println(maxsalary);



	}

}
