package OOP;

class Phone{
	public void on()
	{
		System.out.println("Phone is on...");
	}
	
	public void showTime()
	{
		System.out.println("Show time");
	}
	
}

class smartphone extends Phone{
	public void on()
	{
		System.out.println("Smartphone is on...");
	}
	
	public void music()
	{
		System.out.println("You can play music..");
	}
}


public class Dynamic_method_dispatch {
    public static void main(String[] args) {
	Phone obj = new smartphone();
	obj.on(); // run the method related to smartphone
	
}
}
