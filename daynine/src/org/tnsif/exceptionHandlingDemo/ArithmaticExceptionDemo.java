package org.tnsif.exceptionHandlingDemo;
import java.util.Scanner;
public class ArithmaticExceptionDemo
{
  public static void main(String[] args)
	  {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the value of X and Y :");
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	 // try block contain exception
	   try {
		      int res= x/y;
		      System.out.println(res);   
	      }
	   // catch block will handle the exception
	   catch(Exception e)
	     {
		   System.out.println("Exeption handling using catch:"+e);
	     }
	   // final block
	   finally
	    {
		   System.out.println("final Block");
	    } 
	}
}
