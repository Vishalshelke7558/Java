package OOP;

public class Finally_block {
public static void main(String[] args) {
	
//	finally block contain the code which is always exicuted whether
//	the exception handled or not


	try {
		int a = 15;
		int b = 0;
		int c = a/b;
		System.out.println("the division is :"+c);
	}
	catch (Exception e) {
		System.out.println("You can not divide with zero");
	}
	finally {
		System.out.println("Program ends here");
	}
}
}
