package SOLIDPrinciples;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String args[]) {
		//List<Integer> listofInts = {1,2,3,4,5,6};
		List<Bird> listofBirds = new ArrayList<Bird>();
		listofBirds.add(new Crow());
		listofBirds.add(new Ostrich());
		listofBirds.add(new Penguin());
		listofBirds.add(new Pigeon());
		listofBirds.add(new Sparrow());
		
		
		for(Bird bird: listofBirds) {
			//bird.makeSound();
		}
			
		List<Eater> listofBirdsCanEat = new ArrayList<Eater>();
		listofBirdsCanEat.add(new Crow());
		listofBirdsCanEat.add(new Ostrich());
		listofBirdsCanEat.add(new Penguin());
		listofBirdsCanEat.add(new Pigeon());
//		listofBirdsCanEat.add(new Sparrow());
		
		for(Eater eater: listofBirdsCanEat) {
			eater.eat();
		}
	}
}
