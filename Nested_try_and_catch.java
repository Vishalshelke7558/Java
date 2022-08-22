package OOP;

import java.util.Scanner;


public class Nested_try_and_catch {
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
	
	try {
		try {
			System.out.println("The element at index "+ind+" is "+arr[ind]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound");
			System.out.println("Exception occured at level 1");
		}
	}
	catch (Exception e) {
		System.out.println("Some other exception occured Level 2");
	}
}
}
