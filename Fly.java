import java.text.DecimalFormat;

public class Fly {

	// private instance variables
	private double mass;
	private double speed;
	
	//public static variables
	public static final double mass_default = 5.0;
	public static final double speed_default = 10.0;
	
	//constructors
	public Fly(double mass, double speed) {
		this.mass = mass;
		this.speed = speed;
	}
	
	public Fly(double mass) {
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
	
	//setters or mutators
	public void setMass(int newMass) {
		this.mass = newMass;
	}
	
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}

	//toString overriding
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#.00");
			
		if (mass == 0) {
			return "I'm dead, but I used to be a fly with a speed of " + df.format(speed) + ".";
		}
		else {
			return "I'm a speedy fly with " + df.format(speed) + "speed and " + df.format(mass) + " mass.";
		}
	}
	
	//behaviors
	public void grow(double added_mass) {
		if (mass < 20) {
			while (mass < 20) {
				speed++;
				added_mass--;
				mass++;
			}
			mass += added_mass;
		}
		else {
			speed += (double)(added_mass * 0.5);
			mass += added_mass;
		}
	}
	
	public boolean isDead() {
		return (mass == 0 ? true : false);
	}
	
}