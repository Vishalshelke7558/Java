package OOP;

import java.util.Scanner;

@SuppressWarnings("serial")
class MyException extends Exception{
	public String toString() {
		// executed when Sout(e) is run
		return   "I am toString()";
	}
	
	public String getMessage() {
		// prints the exception message
		return   "This is getMessage()";
	}
}


public class Exception_class {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	  int a;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Entre the value of a ");
	  a = sc.nextInt();
	  if(a < 9) {
		  try {
			  throw new MyException();
			  
			  //throw new ArithmeticException("This is arithmetic exception");
			  // we can throw default exception too
		  }
		  catch (Exception e) {
			  
			System.out.println(e.getMessage());// run when we call
			
			System.out.println(e.toString()); // we can call toString explicitly
			
			System.out.println(e); // Default toString()
			// get run
		}
	  }
}
}
