package com.centennialcollege.comp228_lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// DRIVER CLASS
public class Program {

	public static void main(String[] args) {
		MyRunnable myRunnable1 = new MyRunnable("1");
		MyRunnable myRunnable2 = new MyRunnable("2");
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(myRunnable1);
		executor.execute(myRunnable2);
		
		// START OUR MAIN OPERATION
		for(int index = 0; index < 10; index ++) {
			System.out.println("Main Count: " + index);
			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
				if (index >5) {
				}
			} catch (InterruptedException exception) {
				System.err.println("Thread Interrupted: " + exception);
			}	
		}
		
		executor.shutdown();

	}

}
