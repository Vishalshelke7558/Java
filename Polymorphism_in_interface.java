package OOP;
interface Camera_1{
	void takesnap();
}

interface CellPhone_1{
	void callNumber();
}

interface wifi_1{
	void useNetwork();
}

class smartphone_1 implements Camera_1,CellPhone_1,wifi_1{
	public void takesnap() {
		System.out.println("take picture");
	}
	
	public void callNumber() {
		System.out.println("Call the number");
	}
	
	public void useNetwork() {
		System.out.println("Use the network");
	}
}


public class Polymorphism_in_interface {
public static void main(String[] args) {
	Camera_1 cam = new smartphone_1();
	cam.takesnap(); // we are allowed to use only functions of camera
	//cam.callNumber(); // this will give error as we are only allowed to use function of camera
	
	// for using all functions of the smartphone we have to reference an object to smartphone class
	// which implementing all interfaces
	
	smartphone_1 sam = new smartphone_1();
	sam.takesnap();
	sam.callNumber();
	sam.useNetwork();
	// here we are able to use all the methods of interface by using reference of the smartphone
	// class
}
}