package OOP;

class Mythr extends Thread{
	public Mythr(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("I am thread");
	}
}

public class Thread_Class_Constructor {
public static void main(String[] args) {
	Mythr th = new Mythr("Vishal");
	th.start();
	System.out.println("The id of thread is "+th.getId());
	//gives id of thread
	
	
	System.out.println("The name of thread is "+th.getName());
	// gives name of thread
}
}
