package Java;

public class FibonacciNumbers {
	
	public static void main(String args[]) {
		System.out.println(fibonacciNumbers(5));
	}
	
	public static int fibonacciNumbers(int n) {
		if(n <= 1) return n;
		return fibonacciNumbers(n-1) + fibonacciNumbers(n-2);
	}

}
