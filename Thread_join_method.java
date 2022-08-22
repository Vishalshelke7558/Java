package OOP;

class Thread2 extends Thread{
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println("I am Thread 1");
			i++;
		}
		
	}
}

class Thread3 extends Thread{
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println("I am Thread 2");
			i++;
		}
}
}

public class Thread_join_method {
public static void main(String[] args) {
	Thread2 th1 = new Thread2();
	
	Thread3 th2 = new Thread3();
	
	th1.start();
	
	try {
		th1.join();
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	th2.start();
	
}
}