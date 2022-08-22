package OOP;


@FunctionalInterface
interface Lambda{
	void method_1();
}

// Parameterize lambda expression
@FunctionalInterface
interface Para_Lambda{
	void method_2(int a);
}

public class Lambda_expressions {
	public static void main(String[] args) {
		
		// lambda expression
		Lambda obj = ()->{
			System.out.println("This is lambda expression");
		};
		
		obj.method_1();
		
		
		// Use of parameterize lambda expression
		Para_Lambda obj_1 = (a)->{
			System.out.println("This is Parameterize lambda expression And value of a is "+a);
		};
		
		obj_1.method_2(5);
		
		
	}
}
