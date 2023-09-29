package stream;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

		System.out.println();


		// this is list 
		List<String> ep = 	employeeList.stream()
				.map(e -> e.getFirstName())
				.distinct()
				.sorted().toList();

		System.out.println(ep);    /// how can i count how many are there ???? in this list  ?? how can get count and firstnames in console

		// this is collect to list 

		// mutable list 

		List<String> ep1 = 	employeeList.stream()
				.map(e -> e.getFirstName())
				.distinct()
				.sorted()
				.collect(Collectors.toList());

		ep1.add("jhansi");
		System.out.println(ep1);




		/// immutable list 

		List<String> ep11 = 	employeeList.stream()
				.map(e -> e.getFirstName())
				.distinct()
				.sorted()
				.collect(Collectors.toUnmodifiableList());

		//ep11.add("jhansi");    // this is throwing error
		System.out.println(ep11);


		System.out.println();

		// here if we have a duplicate in a map , it generally wont print throws error 

		
		// printing only a 
	Map<String, Double> em = 	employeeList.stream()
		.collect(Collectors.toMap(e -> e.getFirstName(), e -> e.getSalary(),
				
				(a,b) -> a
				
				));
System.out.println(em);

System.out.println();


// printing only b
Map<String, Double> em1 = 	employeeList.stream()
.collect(Collectors.toMap(e -> e.getFirstName(), e -> e.getSalary(),   // use comma for and use that formula to get values  based on it return type will change
		
		(a,b) -> b
		
		));
System.out.println(em1);

System.out.println();


// prinint both 
Map<Object, Object> em11 = 	employeeList.stream()
.collect(Collectors.toMap(e -> e.getFirstName(), e -> e.getSalary(),   // its printing values only for salary 
		
		(a,b) -> a  + "," + b
		
		));


System.out.println(em11);

//{Alexander=58000.0, Charlotte=54000.0, Grace=54000.0, John=60000.0, Lily=56000.0, Emily=54000.0, Sarah=58000.0, Michael=58000.0, Ella=65000.0, Ethan=62000.0, James=58000.0, Mia=65000.0, Oliver=62000.0, Alice=55000.0, Lucas=63000.0, Benjamin=62000.0, Daniel=56000.0, William=63000.0, Noah=54000.0, Harper=59000.0, Ava=62000.0, Liam=56000.0, Olivia=63000.0, Chloe=59000.0, Sophia=62000.0}
//
//{Alexander=58000.0, Charlotte=59000.0, Grace=54000.0, John=60000.0, Lily=56000.0, Emily=54000.0, Sarah=58000.0, Michael=58000.0, Ella=65000.0, Ethan=62000.0, James=59000.0, Mia=58000.0, Oliver=62000.0, Alice=55000.0, Lucas=63000.0, Benjamin=62000.0, Daniel=56000.0, William=54000.0, Noah=54000.0, Harper=62000.0, Ava=56000.0, Liam=65000.0, Olivia=63000.0, Chloe=59000.0, Sophia=62000.0}
//
//{Alexander=58000.0,58000.0, Charlotte=54000.0,59000.0, Grace=54000.0,54000.0, John=60000.0,60000.0, Lily=56000.0, Emily=54000.0,54000.0, Sarah=58000.0, Michael=58000.0,58000.0,58000.0, Ella=65000.0,65000.0, Ethan=62000.0, James=58000.0,59000.0, Mia=65000.0,58000.0, Oliver=62000.0,62000.0, Alice=55000.0,55000.0, Lucas=63000.0,63000.0, Benjamin=62000.0,62000.0, Daniel=56000.0,60000.0,56000.0, William=63000.0,54000.0, Noah=54000.0, Harper=59000.0,62000.0, Ava=62000.0,56000.0, Liam=56000.0,65000.0, Olivia=63000.0, Chloe=59000.0, Sophia=62000.0,62000.0,55000.0,62000.0}

	}

}
