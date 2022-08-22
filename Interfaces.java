package OOP;

interface Bicycle{
	 void applyBreak();
	 void speedUp();
}

interface HornCycle{
	void blowHorn();
	void stopHorn();
}

class avonCycle implements Bicycle,HornCycle{
	public void applyBreak() {
		System.out.println("Use break to reduce the speed");
	}
	public void speedUp() {
		System.out.println("speed up when required");
	}
	
	public void blowHorn() {
		System.out.println("Blow Horn");
	}
	
	public void stopHorn() {
		System.out.println("stop the horn");
	}
}

public class Interfaces {
 public static void main(String[] args) {
	 avonCycle cycle_1 = new avonCycle();
	 cycle_1.applyBreak();
	 cycle_1.speedUp();
	 cycle_1.blowHorn();
	 cycle_1.stopHorn();
}
 }
