package org.tnsif.ThreadDemo;
public class ThreadExcutor {

	public static void main(String[]args)
	{
		SimpleThradProgramme p =new SimpleThradProgramme();
		p.setName("java thread ");// change thread name
		p.setPriority(8);//
		// when thread call to start method 
		p.start();
		// once we call start method again we can not restart
//		p.start();
		p.run();
		System.out.println("Currunt Thread :"+p);
		
	}

}
