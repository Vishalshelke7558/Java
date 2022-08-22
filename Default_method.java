package OOP;

interface Camera{
	void takesnap();
	
	default void recordVidio() {
		System.out.println("Recording in progress");
	}
}

interface wifi{
	void getNetwork();
	}

class Mycellphone{
	void callnumber() {
		System.out.println("calling phone number");
	}
}

class mySmartPhone extends Mycellphone implements Camera,wifi{
	public void takesnap() {
		System.out.println("We are taking snap");
	}
	
	public void getNetwork() {
		System.out.println("We are able to get network");
	}
	
}
public class Default_method {
public static void main(String[] args) {
	mySmartPhone obj = new mySmartPhone();
	obj.takesnap();
	obj.getNetwork();
	obj.callnumber();
	
	// calling default method
	// we can override default method
	obj.recordVidio();
}
}
