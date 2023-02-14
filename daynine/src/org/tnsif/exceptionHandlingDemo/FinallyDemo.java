package org.tnsif.exceptionHandlingDemo;
// to demonstrate finally block is not Excute 
public class FinallyDemo{
		public static void main(String[] args) {
			
			try {
				// 
				//System.exit(0); //this will stop program
				int arr[] = new int[] {1,2,3};
				System.out.println(arr[3]);
			}
			catch (Exception e) {
				System.out.println("Exception hendled :"+ e);
				
			}
			finally {
				//if exception caused here then finally block cannot run
				int z = 10/0; //this gives exception
				System.out.println("Finally block");
			}

		}

	}

