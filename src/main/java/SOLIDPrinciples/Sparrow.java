package SOLIDPrinciples;

public class Sparrow  extends Bird implements Flyer {
	String color;

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Printing makeSound values in the Sparrow");
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Printing fly method of sparrow ");
	}

}
