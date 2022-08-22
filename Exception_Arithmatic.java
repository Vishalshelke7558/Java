package OOP;

public class Exception_Arithmatic {
 public static void main(String[] args) {
	 int a =4;
	 int b = 2;
	 int c;
	 try {
		  c = a/b;
		 System.out.println("The result is "+c);
	 }
	 catch(Exception e) {
		 System.out.println("We can not devide by zero");
		 System.out.println(e);
	 }
	}
}
