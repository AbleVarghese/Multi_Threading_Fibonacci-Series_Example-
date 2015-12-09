package com.centennialcollege.comp228_lesson13;

public class MyRunnable implements Runnable {
	// PRIVATE INSTANCE VARIABLE
	private String _name;

	public MyRunnable(String name) {
		this._name = name;
	}

	@Override
	public void run() {
		Task1();

	}

	private synchronized void Task1() {
		// TASK
		for (int index = 0; index < 10; index++) {
			System.out.println("Runnable " + this._name + " Count: " + index);
			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
			} catch (InterruptedException exception) {
				System.err.println("Runnable Interrupted: " + exception);
			}
		}
	}

}
