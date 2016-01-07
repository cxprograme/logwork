package com.ztace.thread;

class MyThread implements Runnable{
	private int tickets=5;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if(tickets>0){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("卖票：ticket= "+tickets--);
			}
		}
	}
	
};

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
	}
	
}
