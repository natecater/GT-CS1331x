public class Frog {

	//instance variables
	private String name;
	private int age;
	private double tongueSpeed;
	private boolean isFroglet;
	protected String species = "Rare Pepe";
	private int num_months;
	
	//static constants/variables
	public static final int default_age = 5;
	public static final double default_tongueSpeed = 5.0;
	
	//constructors
	public Frog(String name, int age, double tongueSpeed) {
		this.name = name;
		this.age = age;
		this.tongueSpeed = tongueSpeed;
	}
	
	public Frog(String name, double ageInYears) {
		this.name = name;
		this.ageInYears = (double)((int)(age / 12));
	}
	
	public Frog(String name) {
		this(name, default_age, default_tongueSpeed);
	}
	
	//behavior methods
	
	public void grow(int num_months) {
		if (age < 12) {
			while (age < 12) {
				age++;
				num_months--;
				tongueSpeed++;
			}
			tongueSpeed += num_months;
		}
		else if (age > 30) {
			while (num_months > 0) {
				age++;
				num_months--;
				if (tongueSpeed > 5) {
					tongueSpeed--;
				}
			}
		}
		
		if ((age > 1) && (age < 7)) {
			isFroglet = true;
		}
		else {
			isFroglet = false;
		}
	}
	
	public void grow() {
		if (age < 12) {
			tongueSpeed++;
		}
		else if (age > 30) {
			if (tongueSpeed > 5) {
				tongueSpeed--;
			}
		}
		
		age++;
		
	}
	
	public void eat(Fly fly) {
		if(fly.isDead() == true) {
			break;
		} 
		else {
			if (tongueSpeed > fly.speed) {
				if ((double)fly.mass >= ((double)age* 0.5)){
					grow(1);
				}
				fly.setMass(0);
				
			}
			else {
				fly.grow(1.0);
			}
		}
	}
}