package OOP;

class Thread4 extends Thread{
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println("I am Thread 1");
			i++;
		}
		
	}
}

class Thread5 extends Thread{
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println("I am Thread 2");
			i++;
		}
}
}

public class Thread_sleep_method {
	public static void main(String[] args) {
		Thread4 th1 = new Thread4();
		
		Thread5 th2 = new Thread5();
		
		th1.start();
		
		try {
			Thread.sleep(800);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		th2.start();
		
	}

}
