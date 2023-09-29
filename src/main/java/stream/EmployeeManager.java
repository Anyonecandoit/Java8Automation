package stream;


import java.util.ArrayList;
import java.util.List;





public class EmployeeManager {

	public static List<Employee> get() {
		// Create a list of 45 Employee objects with different details, including some repetitions
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "John", "Doe", "IT", "Software Engineer", 60000.00, 28));
		employees.add(new Employee(2, "Alice", "Smith", "HR", "HR Manager", 55000.00, 32));
		employees.add(new Employee(3, "Michael", "Johnson", "Finance", "Financial Analyst", 58000.00, 30));
		employees.add(new Employee(4, "Emily", "Brown", "Marketing", "Marketing Specialist", 54000.00, 27));
		employees.add(new Employee(5, "Daniel", "Wilson", "Sales", "Sales Representative", 56000.00, 29));
		employees.add(new Employee(6, "Sophia", "Lee", "IT", "Web Developer", 62000.00, 26));
		employees.add(new Employee(7, "Oliver", "Anderson", "Finance", "Financial Manager", 62000.00, 33));
		employees.add(new Employee(8, "Chloe", "Martin", "Marketing", "Marketing Manager", 59000.00, 31));
		employees.add(new Employee(9, "William", "Taylor", "Sales", "Sales Manager", 63000.00, 34));
		employees.add(new Employee(10, "Mia", "Johnson", "IT", "Data Scientist", 65000.00, 28));
		employees.add(new Employee(11, "James", "Williams", "Finance", "Financial Analyst", 58000.00, 29));
		employees.add(new Employee(12, "Charlotte", "Wilson", "Marketing", "Marketing Specialist", 54000.00, 27));
		employees.add(new Employee(13, "Liam", "Smith", "Sales", "Sales Representative", 56000.00, 30));
		employees.add(new Employee(14, "Ava", "Johnson", "IT", "Web Developer", 62000.00, 26));
		employees.add(new Employee(15, "Benjamin", "Davis", "Finance", "Financial Manager", 62000.00, 33));
		employees.add(new Employee(16, "Harper", "Brown", "Marketing", "Marketing Manager", 59000.00, 31));
		employees.add(new Employee(17, "Lucas", "Martin", "Sales", "Sales Manager", 63000.00, 34));
		employees.add(new Employee(18, "Ella", "Anderson", "IT", "Data Scientist", 65000.00, 28));
		employees.add(new Employee(19, "Alexander", "Lee", "Finance", "Financial Analyst", 58000.00, 29));
		employees.add(new Employee(20, "Grace", "Taylor", "Marketing", "Marketing Specialist", 54000.00, 27));

		// Repeated employees
		employees.add(new Employee(21, "John", "Doe", "IT", "Software Engineer", 60000.00, 28));
		employees.add(new Employee(22, "Alice", "Smith", "HR", "HR Manager", 55000.00, 32));
		employees.add(new Employee(23, "Michael", "Johnson", "Finance", "Financial Analyst", 58000.00, 30));
		employees.add(new Employee(21, "Sarah", "Anderson", "Finance", "Financial Analyst", 58000.00, 29));
		employees.add(new Employee(22, "Noah", "Wilson", "Marketing", "Marketing Specialist", 54000.00, 27));
		employees.add(new Employee(23, "Lily", "Martin", "Sales", "Sales Representative", 56000.00, 30));
		employees.add(new Employee(24, "Ethan", "Smith", "IT", "Web Developer", 62000.00, 26));
		employees.add(new Employee(25, "Sophia", "Brown", "Finance", "Financial Manager", 62000.00, 33));
		employees.add(new Employee(26, "James", "Davis", "Marketing", "Marketing Manager", 59000.00, 31));
		employees.add(new Employee(27, "Olivia", "Lee", "Sales", "Sales Manager", 63000.00, 34));
		employees.add(new Employee(28, "Liam", "Johnson", "IT", "Data Scientist", 65000.00, 28));
		employees.add(new Employee(29, "Mia", "Taylor", "Finance", "Financial Analyst", 58000.00, 29));
		employees.add(new Employee(30, "William", "Smith", "Marketing", "Marketing Specialist", 54000.00, 27));
		employees.add(new Employee(31, "Ava", "Wilson", "Sales", "Sales Representative", 56000.00, 30));
		employees.add(new Employee(32, "Harper", "Anderson", "IT", "Web Developer", 62000.00, 26));
		employees.add(new Employee(33, "Benjamin", "Brown", "Finance", "Financial Manager", 62000.00, 33));
		employees.add(new Employee(34, "Charlotte", "Davis", "Marketing", "Marketing Manager", 59000.00, 31));
		employees.add(new Employee(35, "Lucas", "Martin", "Sales", "Sales Manager", 63000.00, 34));
		employees.add(new Employee(36, "Ella", "Lee", "IT", "Data Scientist", 65000.00, 28));
		employees.add(new Employee(37, "Alexander", "Johnson", "Finance", "Financial Analyst", 58000.00, 29));
		employees.add(new Employee(38, "Grace", "Taylor", "Marketing", "Marketing Specialist", 54000.00, 27));
		employees.add(new Employee(39, "Daniel", "Wilson", "IT", "Software Engineer", 60000.00, 28));
		employees.add(new Employee(40, "Sophia", "Smith", "HR", "HR Manager", 55000.00, 32));
		employees.add(new Employee(41, "Michael", "Johnson", "Finance", "Financial Analyst", 58000.00, 30));
		employees.add(new Employee(42, "Emily", "Brown", "Marketing", "Marketing Specialist", 54000.00, 27));
		employees.add(new Employee(43, "Daniel", "Wilson", "Sales", "Sales Representative", 56000.00, 29));
		employees.add(new Employee(44, "Sophia", "Lee", "IT", "Web Developer", 62000.00, 26));
		employees.add(new Employee(45, "Oliver", "Anderson", "Finance", "Financial Manager", 62000.00, 33));

		return employees;
	}

	public static void main(String[] args) {
		List<Employee> employeeList = get();

		// Print the list of employees
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}


