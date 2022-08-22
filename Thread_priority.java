package OOP;


class Mythread extends Thread{
	public Mythread(String name) {
		super(name);
		
	}
	
	public void run() {
		
		System.out.println("My thread name is "+ this.getName());
		
		}	
}

public class Thread_priority {
     public static void main(String[] args) {
    	 Mythread th1 = new Mythread("Thread_1: Min priority Thread");
         Mythread th2 = new Mythread("Thread_2");
         Mythread th3 = new Mythread("Thread_3 Norm priority Thread");
         Mythread th4 = new Mythread("Thread_4");
         Mythread th5 = new Mythread("Thread_5: Most important thread");
         
         th5.setPriority(Thread.MAX_PRIORITY);
         // as we set max priority of thread number 5
         // hence this will run at very first
         
         th1.setPriority(Thread.MIN_PRIORITY);
         // as we set minimum priority of thread number 5
         // hence this will run at very last
         
         th3.setPriority(Thread.NORM_PRIORITY);
         // Priority is normal hence it will run between maximum and minimum priority
         
         th1.start();
         th2.start();
         th3.start();
         th4.start();
         th5.start();
         
	}
  
   
    
}
