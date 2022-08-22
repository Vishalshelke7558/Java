package OOP;

class mythreading_1 extends Thread{
	public void run() {
		int i = 0;
		while(i < 4000) {
			System.out.println("thread 1");
			i++;
		}
	}
}

class mythreading_2 extends Thread{
	public void run() {
		int i = 0;
		while(i < 4000) {
			System.out.println("thread 2");
			i++;
		}
	}
}


public class Thread_using_thread_class {
public static void main(String[] args) {
	mythreading_1 obj_1 = new mythreading_1();
	mythreading_2 obj_2 = new mythreading_2();
	obj_1.start();
	obj_2.start();
}
}
