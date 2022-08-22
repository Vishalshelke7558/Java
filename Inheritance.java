package OOP;

class Base{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}


class derived extends Base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
public class Inheritance {
	public static void main(String[] args) {
		// here we creating object of based class and setting value of base class
		derived obj =new  derived();
		obj.setX(5);
		obj.setY(10);
		System.out.println("The value of X from base class is "+obj.getX());
		System.out.println("The value of Y from the derived class is "+obj.getY());
		
	}
	
	
}
