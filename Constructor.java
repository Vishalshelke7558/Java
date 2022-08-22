package OOP;


class mymainEmployee{
	private int id;
	private String name;
	
	
	//Default constructor
	public mymainEmployee() {
		id = 45;
		name = "vishal";
	}
	
	
	// parameterize constructor
	public mymainEmployee(int myid, String myname)
	{
		id = myid;
		name = myname;
	}
	
	public int  getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

public class Constructor {
 public static void main(String[] args) {
	 
	 // initiating object with default constructor
	mymainEmployee vishal = new mymainEmployee();
	System.out.println("Name of employee is "+vishal.getName());
	System.out.println("Id of the employee is "+vishal.getId());
	
	// initiating object with parameterize constructor
	mymainEmployee vishal_1 = new mymainEmployee(12, "shelke");
	System.out.println("Name of employee is "+vishal_1.getName());
	System.out.println("Id of the employee is "+vishal_1.getId());
	
}
  
}
