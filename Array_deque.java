package OOP;

import java.util.ArrayDeque;

public class Array_deque {
public static void main(String[] args) {
	ArrayDeque<Integer> ad1 = new ArrayDeque<>();
	ad1.add(5);
	ad1.add(10);
	ad1.add(15);
	ad1.add(20);
	ad1.add(25);
	
	//use to add element at the starting of the array dequeue
	ad1.addFirst(1);
	
	//use to add element at the last of the array dequeue
	ad1.addLast(30);
	
	
	//gives first element
	System.out.println(ad1.getFirst());
	
	//gives last element
	System.out.println(ad1.getLast());
	
	System.out.println(ad1);
	
}
}
