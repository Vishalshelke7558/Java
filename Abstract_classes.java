package OOP;

// abstract class
abstract class Base_2{
	Base_2(){
			System.out.println("This is constructor");
	}
	
	public void hello() {
		System.out.println("this is hello from base class");
	}
	
	// abstract method
	abstract public void greet();
}

class derived_2 extends Base_2{
	
	// we must have to implement the abstract methods
	// in derived class
	public void greet() {
		System.out.println("This is abstract method which is derived is derived_2 class");
		
	}
}

public class Abstract_classes {

	public static void main(String[] args) {
		derived_2 obj = new derived_2();
		obj.greet();
		
		// we are not able to create object abstract class
		// but we can create object of derived class of
		// abstract class which are implementing the methods of derived class
		
	}
}
