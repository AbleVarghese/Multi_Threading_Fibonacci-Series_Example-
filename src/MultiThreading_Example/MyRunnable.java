package MultiThreading_Example;

public class MyRunnable implements Runnable {
	// PRIVATE INSTANCE VARIABLE
	private String _name;
	private int number;

	public MyRunnable(String name, int limitNum) {
		this._name = name;
		this.number = limitNum;
	}

	@Override
	public void run() {
		Task1();

	}

	private synchronized void Task1() {
		//printing Fibonacci series upto number
		for (int i = 1; i <= this.number; i++) {
			System.out.print("Runnable "+this._name+"  Fib: "+ fibonacciRecusion(i) + ",      ");

			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
			}

			catch (InterruptedException exception) {
				System.err.println("Runnable Interrupted: " + exception);
			}

		}

	}

	//Fibonacci logic is implemented using Recusion method
	public static int fibonacciRecusion(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}

		return fibonacciRecusion(num - 1) + fibonacciRecusion(num - 2); // tail
																		// recursion
	}

}
