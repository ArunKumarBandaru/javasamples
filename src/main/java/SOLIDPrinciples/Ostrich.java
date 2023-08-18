package SOLIDPrinciples;

public class Ostrich extends Bird implements Eater, Walker {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Printing Ostrich walk");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Printing Ostrich eat");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Printing Ostrich makesound");
	}

}
