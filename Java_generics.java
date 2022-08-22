package OOP;

class MyGeneric<T1,T2>{
	int val;
	private T1 t1;
	private T2 t2;
	
	public MyGeneric(int val, T1 t1, T2 t2) {
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}
	
	
	public T1 gett1() {
		return t1;
	}
	
	
	public T2 gett2() {
		return t2;
	}
	
	public int getval() {
		return val;
	}
}

public class Java_generics {
  public static void main(String[] args) {
	
	  
	  MyGeneric<String,Integer> obj = new MyGeneric(5,"mystring",10);
	  
	  String t_1 = obj.gett1();
	  
	  Integer t_2 = obj.gett2();
	  
	  int val_1 = obj.val; 
	  
	  System.out.println("tha value of t1 is :"+t_1);
	  System.out.println("the value of t2 is :"+t_2);
	  System.out.println("the value of val is :"+val_1);
	  
	  
}
}
