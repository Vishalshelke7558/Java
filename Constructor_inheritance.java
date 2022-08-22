package OOP;


class base_1{
	public int x;
	
	base_1(){
		System.out.println("I am default contsructor of base_1");
		//get called before derived class constructor
	}
	
	base_1(int a)
	{
		System.out.println("I am paraterize constructor "+ a);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}

class derived_1 extends base_1{
	
	public int y;
	
    derived_1() {
    	//super(0); // for calling parameterize constructor
		System.out.println("I am constructor of derived class");
		//get class after calling base class constructor
	}
    
    derived_1(int c, int d)
    {
    	
    	System.out.println("I am overloaded parametrized constructor from derived class");
    }
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
public class Constructor_inheritance {
	public static void main(String[] args) {
		derived_1 d = new derived_1(5,4);
		d.setX(5);
		d.setY(10);
		System.out.println("The value of X from base class is "+d.getX());
		System.out.println("The value of Y from the derived class is "+d.getY());
		
		
		
	}

}
