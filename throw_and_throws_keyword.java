package OOP;
import java.util.Scanner;


@SuppressWarnings("serial")
class NegativeRadiusException extends Exception{
	@Override
	public String getMessage() {
		return "Radius can not be negative";
	}
}


public class throw_and_throws_keyword {
	
	public static double Area(int r) throws NegativeRadiusException {
		//Example for custom exception
		if(r < 0) {
			throw new NegativeRadiusException();
		}
		else {
			double area = 3.14*r*r;
			return area;
		}
		
	}
	
	public static float divide(int x, int y) throws ArithmeticException {
		// function created by person:1
		float result = x/y;
		return result;
		
	}
	public static void main(String[] args) {
		
		// person:2 using person:1's function
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number1");
		int number1 = sc.nextInt();
		
		System.out.println("Entre number:2");
		int number2 = sc.nextInt();
		
		try {
			float dev = divide(number1, number2);
			System.out.println("The division is :"+dev);
		} catch (Exception e) {
			System.out.println("You can not divide by zero");
		}
		
		
		
		// use of Area function
		System.out.println("Entre the radius of circle");
		int rds = sc.nextInt();
		
		
		// function is throwing custom exception hence we have to handle it
		try {
			System.out.println("The area of the circle is :"+Area(rds));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
