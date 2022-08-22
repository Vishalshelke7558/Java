package OOP;

// custom class
class Employee{
	int id;
	String name;
	
	//class method
	public void giveDetail() {
		System.out.println("The id of Employee is "+id);
		System.out.println("The name of Employee is "+name);

	}
}
public class First_class {
	
public static void main(String[] args) {
	Employee vishal = new Employee();
	vishal.id = 1;
	vishal.name = "Vishal";
	
	//we can access object detail manually also
	System.out.println("Id of Employee is "+vishal.id);
	System.out.println("Name of Employee is "+vishal.name);
	
	// we can access object detail by using class method also
	vishal.giveDetail();
}
}
