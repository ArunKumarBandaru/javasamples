package DesignPatterns;

enum penType {
	GelPen, FountainPen, ClickPen
}

public class FactoryWithEnum {
	Pen pen;
	FactoryWithEnum(Pen pen) {
		this.pen = pen;
	}
	
	public static void main(String args[]) {
		Pen pen = new GelPen();
		FactoryWithEnum sample = new FactoryWithEnum(pen);
		sample.callWritable();
	}
	
	public void callWritable() {
		pen.writableInNature();
	}
}

class PenFactory {
	public static Pen getPenFactory(String typeOfPen) {
		if(penType.GelPen.toString().equals(typeOfPen)) {
			return new GelPen();
		} else if(penType.FountainPen.toString().equals(typeOfPen)) {
			return new FountainPen();
		} else {
			return new ClickPen();
		}
	}
}


interface Pen {
	public void writableInNature();
	public void refillablee();
}

class GelPen implements Pen {

	@Override
	public void writableInNature() {
		// TODO Auto-generated method stub
		System.out.println("yes it is writable in Gelpen");
	}

	@Override
	public void refillablee() {
		// TODO Auto-generated method stub
		System.out.println("yes it is writable in refillable pen");
	}
	
}

class FountainPen implements Pen {

	@Override
	public void writableInNature() {
		// TODO Auto-generated method stub
		System.out.println("yes it is writable in Fountain pen");
	}

	@Override
	public void refillablee() {
		// TODO Auto-generated method stub
		System.out.println("yes it is writable in refillable Fountain pen");
	}
	
}

class ClickPen implements Pen {

	@Override
	public void writableInNature() {
		// TODO Auto-generated method stub
		System.out.println("yes it is writable in Click pen");
	}

	@Override
	public void refillablee() {
		// TODO Auto-generated method stub
		System.out.println("yes it is writable in refillable Click pen");
	}
	
}