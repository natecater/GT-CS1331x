public class Pond {

	public static void Main(String[] args) {
	
		Frog peepo = new Frog(name = "Peepo");
		Frog pepe = new Frog(name = "Pepe", age = 10, tongueSpeed = 15);
		Frog peepaw = new Frog(name = "Peepaw", ageInYears = 4.6, tongueSpeed = 5);
		Frog frognaw = new Frog(name = "frognaw", age = 1);
		
		Fly fly1 = new Fly(mass = 1, speed = 3);
		Fly fly2 = new Fly(mass = 6);
		Fly fly3 = new Fly(mass = 69, speed = 420);
		
		peepo.setSpecies("1331 Frogs");
		System.out.println(peepo.toString());
		peepo.eat(fly2);
		System.out.println(fly2.toString());
		peepo.grow(8);
		peepo.eat(fly2);
		System.out.println(fly2.toString());
		System.out.println(peepo.toString());
		System.out.println(frognaw.toString());
		peepaw.grow(4);
		System.out.println(peepaw.toString());
		System.out.println(pepe.toString());
	}
	

	
}