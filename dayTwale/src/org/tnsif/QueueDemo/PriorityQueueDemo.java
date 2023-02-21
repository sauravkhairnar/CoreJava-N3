package org.tnsif.QueueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
				obj.add(6);
		        obj.add(5);
		        obj.add(3);
		        obj.add(15);
		        System.out.println("The queue element :"+obj);
//		        obj.remove();
//		        System.out.println("The queue element :"+obj);
////		        obj.remove();
//		        obj.remove();
//		        obj.remove();
//		        obj.remove();
//		        obj.poll();
//		        obj.poll();
//		        obj.poll();
		        obj.remove();  
;		        System.out.println("The queue element :"+obj);
                System.out.println("Head Element are is :"+obj.peek());
	}

}
