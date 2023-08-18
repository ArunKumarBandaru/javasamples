package DesignPattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonCheck {
	public static void main(String args[]) throws Exception {
		  ExecutorService exeService = Executors.newFixedThreadPool(5);
		  
		  CreateRunnable createRunnable = new CreateRunnable(); Future<Singleton>
		  feature = exeService.submit(createRunnable); Singleton singleton =
		  feature.get(); System.out.println("Printing hashCode :: " +
		  singleton.hashCode());
		  
		  Future<Singleton> feature1 = exeService.submit(createRunnable); Singleton
		  singleton1 = feature1.get(); System.out.println("Printing hashCode :: " +
		  singleton1.hashCode());
		 
		
		
		  Future<Singleton> feature2 = exeService.submit(createRunnable); Singleton
		  singleton2 = feature2.get(); System.out.println("Printing hashCode :: " +
		  singleton2.hashCode());
		  
		  Future<Singleton> feature3 = exeService.submit(createRunnable); Singleton
		  singleton3 = feature3.get(); System.out.println("Printing hashCode :: " +
		  singleton3.hashCode());
		  
		  Future<Singleton> feature4 = exeService.submit(createRunnable); Singleton
		  singleton4 = feature4.get(); System.out.println("Printing hashCode :: " +
		  singleton4.hashCode());
		  
		  Future<Singleton> feature5 = exeService.submit(createRunnable); Singleton
		  singleton5 = feature5.get(); System.out.println("Printing hashCode :: " +
		  singleton5.hashCode());
		 
	}
}

 class CreateRunnable implements Callable<Singleton> {
	@Override
	public Singleton call() {
		System.out.println("Printing createRunnable Method in callable");
		Singleton singleton = Singleton.getInstance();
		return singleton;
	}
}
 
/*
 * class CreateRunnable1 implements Callable {
 * 
 * @Override public Singleton call() {
 * System.out.println("Printing createRunnable1 Method in callable"); Singleton
 * singleton = Singleton.getInstance(); return singleton; } }
 */

class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized(Singleton.class) {
				//System.out.println("Printing singleton ::" +singleton);
				if (singleton == null) {
					singleton =  new Singleton();
					return singleton;
				}
				else {
					return singleton;
				}
			}
		}
		return singleton;
	}
}
