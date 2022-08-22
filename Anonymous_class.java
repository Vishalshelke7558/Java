package OOP;
interface Anonymous{
	void method_1();
	
	void method_2();
}
public class Anonymous_class {
public static void main(String[] args) {
	Anonymous obj = new Anonymous() {
		// Anonymous class is a class which we will create but we not created
		// we can take reference of interface and crate object of anonymous class
		@Override
		public void method_2() {
			System.out.println("This is method 1");
			
		}
		
		@Override
		public void method_1() {
			System.out.println("This is method 2");
			
		}
	};
	
	obj.method_1();
	obj.method_2();
	
}
}
