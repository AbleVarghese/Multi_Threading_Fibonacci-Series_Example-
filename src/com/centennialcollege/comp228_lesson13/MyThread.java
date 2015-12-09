package com.centennialcollege.comp228_lesson13;

public class MyThread extends Thread {
	//PRIVATE INSTANCE VARIABLE
	private String _name;
	

	MyThread(String name) {
		this._name = name;
	}
	
	@Override
	public void run() {
		
		// TASK
		for(int index = 0; index < 10; index++) {
			System.out.println("Thread " + this._name + " Count: " + index);
			try {
				sleep(1000); // wait for 1000 ms = 1 sec
			} catch (InterruptedException exception) {
				System.err.println("Thread Interrupted: " + exception);
			}
		}
		
		super.run();
	}

	
	
}
