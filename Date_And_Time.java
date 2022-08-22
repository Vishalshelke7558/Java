package OOP;

import java.util.Date;

public class Date_And_Time {
	public static void main(String[] args) {
		
		// This function returns the number of milliseconds passed from i January 1970
		System.out.println(System.currentTimeMillis());
		
		Date d = new Date();
		
		System.out.println(d);
		
		System.out.println(d.getTime());
		
//		System.out.println(d.getDate());
//		
//		System.out.println(d.getYear());
//		
	}

}
