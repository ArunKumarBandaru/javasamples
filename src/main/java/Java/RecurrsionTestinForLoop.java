package Java;

public class RecurrsionTestinForLoop {
	
	public static void main(String args[]) {
		testinanothermethod(0);
	}
	
	static int count = 0;
	public static void testinanothermethod(int start) {
		for(int i=start;i<4;i++) {
			count++;
			System.out.println("Displaying the content in between "+ i + " "+start + "count::" + count);
			testinanothermethod(i+1);
			
			System.out.println("Arun");
		}
	}
}
