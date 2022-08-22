package OOP;


import java.util.Scanner;

public class Specific_Exception {
public static void main(String[] args) {
	int [] arr = new int[4];
	arr[0]= 5;
	arr[1]= 10;
	arr[2]= 15;
	arr[3]= 20;
	
	@SuppressWarnings("resource")  // to avoid warning
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Entre the index which you want to print");
	int ind = sc1.nextInt();
	
	System.out.println("Entre the number you want to devide with ");
	int number = sc1.nextInt();
	
	
	try {
		System.out.println("Element at index "+ind+" is "+arr[ind]);
		System.out.println("The value of array value/number is "+arr[ind]/number);
	}
	
	catch (ArithmeticException e) {
		System.out.println("We can not devide by zero");
		System.out.println(e);
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Index is out of range");
		System.out.println(e);
	}
	
	
}
}
