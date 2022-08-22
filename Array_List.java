package OOP;

import java.util.ArrayList;

public class Array_List {
public static void main(String[] args) {
	ArrayList<Integer> l1 = new ArrayList<>();
	
	
	l1.add(5);
	l1.add(10);
	l1.add(15);
	l1.add(20);
	l1.add(25);
	
	
	for(int i = 0; i < l1.size();i++) {
		System.out.print(l1.get(i));
		System.out.print(" ");
	}
	System.out.println("\n");
	
	ArrayList<Integer> l2 = new ArrayList<>();
	l2.add(25);
	l2.add(30);
	l2.add(35);
	l2.add(40);
	
	
	// adding one array list to another
	l1.addAll(l2);
	System.out.println(l1);
	
	// contains method
	boolean var = l1.contains(10);
	System.out.println(var);
	
	//indexOf method
	int var_1 = l1.indexOf(15);
	System.out.println(var_1);
	
	//removing element from particular index
	l1.remove(7);
	System.out.println(l1);
	
	// adding element to particular index
	l1.set(0,1);
	System.out.println(l1);
	
	// method used to clear the array list
	l2.clear();
	System.out.println(l2);
}
}
