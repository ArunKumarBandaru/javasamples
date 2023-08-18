package SOLIDPrinciples;

public class Crow extends Bird implements Flyer, Eater {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Crow fly happening");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("makingsound on Crow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Crow eat happening");
	}

}
