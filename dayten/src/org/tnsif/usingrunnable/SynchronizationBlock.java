package org.tnsif.usingrunnable;
public class SynchronizationBlock 
{
	public void sendMessage(String message)
	{
		System.out.println("\n Sending+message");
		try(
				Thread.sleeep(1000);		
		   )
		    catch(Exception e)
		    {
			 System.out.println("Thread Interrupted");
		    }
	}

}
