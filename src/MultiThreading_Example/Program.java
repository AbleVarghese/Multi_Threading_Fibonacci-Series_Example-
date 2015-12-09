package MultiThreading_Example;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// DRIVER CLASS
public class Program {


	public static void main(String[] args) {
		
		//input to print Fibonacci series upto how many numbers
        System.out.print("Enter number upto which Fibonacci series to print: ");
        @SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();
        System.out.println("\nFibonacci series upto " + number + " numbers: \n");
		
		MyRunnable myRunnable1 = new MyRunnable("1",number);
		MyRunnable myRunnable2 = new MyRunnable("2", number);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(myRunnable1);
		executor.execute(myRunnable2);
			
        
		// START OUR MAIN OPERATION
		for(int index = 1; index <= number; index ++) {
			System.out.println("Main Count: " + index+"     ");
			
			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
				if (index >5) {
				}
			} 
			catch (InterruptedException exception) {
				System.err.println("Thread Interrupted: " + exception);
			}	
			System.out.println("\n*****************************************************************************\n\n");
		}
		
		executor.shutdown();

	}

}
