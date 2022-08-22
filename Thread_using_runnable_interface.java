package OOP;

class RunnableThread_1 implements Runnable{
	public void run() {
		int i = 0;
		while(i < 4000) {
			System.out.println("Runnable thread 1");
			i++;
		}
	}
}

class RunnableThread_2 implements Runnable{
	public void run() {
		int i = 0;
		while(i < 4000) {
			System.out.println("Runnable thread 2");
			i++;
		}
	}
}

public class Thread_using_runnable_interface {
public static void main(String[] args) {
	
	// here we have to create our own class object and Thread class object also
	// we have to use our class object as argument in Thread class object and 
	//Thread class object to use the thread
	//i.e. ThreadclassObject.start()
	RunnableThread_1 bullet1 = new RunnableThread_1();
	Thread gun1 = new Thread(bullet1);
	
	RunnableThread_2 bullet2 = new RunnableThread_2();
	Thread gun2 = new Thread(bullet2);
	
	gun1.start();
	gun2.start();
	
}
}
