package com.bupt.Thread;

class Thread2 extends Thread {

	/**
	 * @param args
	 */
	private String title;
	private static int count = 0;
	private static int level = 100;
	public Thread2(String str){
		this.title = str;
	}
	
	public synchronized void changeLevel(){
		for(int i = 0; i < 10; ++i){
			if (this.title == "ANDY"){
				level += 1;
				count++;
				System.out.println(this.title+"  "+level+"   "+count);
			}else if(this.title == "ALEX"){
				level -= 1;
				count++;
				System.out.println(this.title+ "  "+level+"   "+count);
			}
			
	
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
	public void run(){
		synchronized(this){
			for(int i = 0; i < 10; ++i){
				if (this.title == "ANDY"){
					level += 1;
					count++;
					System.out.println(this.title+"  "+level+"   "+count);
				}else if(this.title == "ALEX"){
					level -= 1;
					count++;
					System.out.println(this.title+ "  "+level+"   "+count);
				}
				
		
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		}
			}

}
