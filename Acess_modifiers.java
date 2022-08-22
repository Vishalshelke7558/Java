package OOP;
class MyEmployee{
	public int a =5;
	private int b = 10;
	protected int c =15;
	int d = 20; // Default 
	
	void display()
	{
		System.out.println("We are displaying the properties of access modifiers in same class");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
	}
}

public class Acess_modifiers {
public static void main(String[] args) {
	MyEmployee vishal = new MyEmployee();
	
	vishal.display();
	System.out.println("We are displaying in same package but in different class");
	System.out.println("a : "+vishal.a);
	System.out.println("b : It is private hence we are not able to use this in same package but different class"); // B is private hence it is not possible to use in same package too
	System.out.println("c : "+vishal.c);
	System.out.println("d : "+vishal.d);
	
	// If another class of another package tries to inherit the properies of another class present in another package
	// then in such case only public and protected can be exicuted
	// default and private can not accessible 
}
}
