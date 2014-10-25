package com.bupt.Thread;

class Thread1 implements Runnable {

	
	public Thread1(String name) {
		super();
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	private String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; ++i){
			System.out.println(this.name + ':' + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
