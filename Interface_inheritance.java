package OOP;

interface sampleinterface{
	void method_1();
	void method_2();
}

// interface inheritance
interface childSampleInterface extends sampleinterface{
	void method_3();
	void method_4();
}


// interface implementation
class mySampleClass implements childSampleInterface{
	public  void method_1() {
		System.out.println("This is method 1");
	}
	
	public  void method_2() {
		System.out.println("This is method 2");
	}
	
	public  void method_3() {
		System.out.println("This is method 3");
	}
	
	public  void method_4() {
		System.out.println("This is method 4");
	}
}

public class Interface_inheritance {
	public static void main(String[] args) {
		mySampleClass obj_1 = new mySampleClass();
		obj_1.method_1();
		obj_1.method_2();
		obj_1.method_3();
		obj_1.method_4();
	}

}
