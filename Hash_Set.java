package OOP;

import java.util.HashSet;

public class Hash_Set {
public static void main(String[] args) {
	HashSet<Integer> hst = new HashSet<>();
	
	
	// adding element to HashSet
	hst.add(5);
	hst.add(8);
	hst.add(7);
	hst.add(15);
	hst.add(20);
	hst.add(21);
	
	System.out.println(hst);
	
	hst.remove(21);
	System.out.println(hst);
	
	
	//check HashSet is empty or not
	System.out.println(hst.isEmpty());
	
	// to remove all element form the HashSet.
	hst.clear();
	System.out.println(hst);
}
}
