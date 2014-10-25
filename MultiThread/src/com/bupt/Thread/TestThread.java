package com.bupt.Thread;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 thread1 = new Thread2 ("ANDY");
		Thread2 thread2 = new Thread2("ALEX");
		thread1.setPriority(10);
		thread2.setPriority(1);
		thread1.start();
		thread2.start();
	}

}
