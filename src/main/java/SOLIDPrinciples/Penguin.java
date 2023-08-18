package SOLIDPrinciples;

public class Penguin extends Bird implements Eater, Walker {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Printing Penguin makesound method");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Printing Penguin eat method");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Printing Penguin walk method");
	}

}
