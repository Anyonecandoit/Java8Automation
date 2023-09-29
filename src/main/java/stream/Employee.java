package stream;



	
	public class Employee {
	    // Fields
	    private int id;
	    private String firstName;
	    private String lastName;
	    private String department;
	    private String jobTitle;
	    private double salary;
	    private int age;

	    // Constructor
	    public Employee(int id, String firstName, String lastName, String department, String jobTitle, double salary, int age) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.department = department;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	        this.age = age;
	    }

	    // Getter methods
	    public int getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public int getAge() {
	        return age;
	    }

	    // Setter methods (optional)
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
	                + ", jobTitle=" + jobTitle + ", salary=" + salary + ", age=" + age + "]";
	    }
	}


