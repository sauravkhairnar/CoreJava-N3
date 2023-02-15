package org.tnsif.ThreadDemo;
public class ThreadOne extends Thread{
	SynchronizationDemo d;
	public ThreadOne(SynchronizationDemo d) {
	super();
	this.d=d;
}
	public void run()
	{
		try {
			d.print(10);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public void run()
	{
		try {
			d.print(15);
		}catch(InterruptedException e) 
		{
			System.out.println(e);
		}
	}