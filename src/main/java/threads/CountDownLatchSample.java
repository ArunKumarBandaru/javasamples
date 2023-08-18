package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;


public class CountDownLatchSample {
	
	public static void main(String args[]) throws Exception {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		CallableSample callableSample = new CallableSample(latch);
		CallableSampleOne callableSampleOne = new CallableSampleOne(latch);
		CallableSampleTwo callableSampleTwo = new CallableSampleTwo(latch);
		CallableSampleThree callableSampleThree = new CallableSampleThree(latch);
		
        

        int value = callableSample.call();
        int value1 = callableSampleOne.call();
        int value2 = callableSampleTwo.call();
        int value3 = callableSampleThree.call();
        int value4 = callableSampleThree.call();
        
        System.out.println("displaying the value :: " +value);
        System.out.println("displaying the value :: " +value1);
        System.out.println("displaying the value :: " +value2);
        System.out.println("displaying the value :: " +value3);
        System.out.println("displaying the value :: " +value4);
        
        
        
        
        
        System.out.println("Main class had been called");
	}

}


class CallableSample implements Callable {
	
	CountDownLatch latch = null;
	
	public CallableSample(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		latch.countDown();
		System.out.println("displaying the count :: CallableSample" + latch.getCount());
		return 40;
	}
	
}

class CallableSampleOne implements Callable {
	
	CountDownLatch latch = null;
	
	public CallableSampleOne(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		latch.countDown();
		System.out.println("displaying the count :: CallableSampleOne" + latch.getCount());
		return 10;
	}
	
}

//Hsbccareer$1208
class CallableSampleTwo implements Callable {
	
	CountDownLatch latch = null;
	
	public CallableSampleTwo(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		latch.countDown();
		System.out.println("displaying the count :: CallableSampleTwo" + latch.getCount());
		return 20;
	}
	
}

class CallableSampleThree implements Callable {
	
	CountDownLatch latch = null;
	
	public CallableSampleThree(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		latch.countDown();
		System.out.println("displaying the count :: CallableSampleThree" + latch.getCount());
		return 30;
	}
	
}