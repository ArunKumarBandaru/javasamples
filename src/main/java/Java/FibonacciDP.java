package Java;

public class FibonacciDP {
	static int n = 1;
	static int[] fibArray = new int[n+1];
	public static void main(String args[]) {
		FibonacciDP fibonacciDP = new FibonacciDP();
		for(int i=0;i<fibArray.length;i++) {
			fibArray[i] = -1;
		}
		fibonacciDP.fibonacci(n);
		for(int i=0;i<fibArray.length;i++) {
			System.out.println(fibArray[i]+ " ");
		}
	}
	
	public static int fibonacci(int value) {
		if(value == 0) {
			fibArray[value] = 0;
			return 0;
		}
		
		if(value == 1) {
			fibArray[value] = 1;
			return 1;
		}
			
		
		if(fibArray[value] == -1) {
			fibArray[value] = fibonacci(value - 1) + fibonacci(value - 2);
		}
		return fibArray[value];
	}
}
