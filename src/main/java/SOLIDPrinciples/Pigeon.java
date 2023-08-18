package SOLIDPrinciples;

public class Pigeon extends Bird implements Flyer, Eater   {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Printing eat method Pigeon");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Printing fly method Pigeon");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Printing makesound method Pigeon");
	}

}
