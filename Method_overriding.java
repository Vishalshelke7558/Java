package OOP;

class A{
	public int a;
	public void display() {
		System.out.println("This is method from class A");
	}
}

class B extends A{
	public void display() {
		System.out.println("This is method from class B");
	}
	
}

public class Method_overriding {
 public static void main(String[] args) {
	B b = new B();
	b.display();
}
	
}
