public class Fly {

	// private instance variables
	private double mass;
	private double speed;
	
	//public static variables
	public static final int mass_default = 5;
	public static final int speed_default = 10;
	
	//constructors
	public Fly(double mass, double speed) {
		this.mass = mass;
		this.speed = speed;
	}
	
	public Fly(mass) {
		this(mass, speed_default);
	}
	
	public Fly() {
		this(mass_default, speed_default);
	}
	
	//getters or accessors
	public double getMass() {
		return mass;
	}
	
	public double getSpeed() {
		return speed;
	}

	//toString overriding
	public String toString() {
		if (mass == 0) {
			return "I'm dead, but I used to be a fly with a speed of " + speed + ".";
		}
		else {
			return "I'm a speedy fly with " + speed + "speed and " + mass + " mass.";
		}
	}
	
	public boolean isDead() {
		if (mass == 0) {
			return true;
		}	
		else {
			return false;
		}
	}
	
}