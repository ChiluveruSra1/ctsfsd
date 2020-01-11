package syncrohized;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;



public class ProducerConsumerSynchro {


	/*
	 * 
	 * for(int i = 0; i < 5; i++) { stack.push(i); }
	 */	 
	/*
	 * // Popping element from the top of the stack static void
	 * stack_pop(Stack<Consumer> stack) { System.out.println("Pop :");
	 * 
	 * for(int i = 0; i < 5; i++) { Integer y = (Integer) stack.pop();
	 * System.out.println(y); } }
	 * 
	 * // Displaying element on the top of the stack static void
	 * stack_peek(Stack<Integer> stack) { Integer element = (Integer) stack.peek();
	 * System.out.println("Element on stack top : " + element); }
	 * 
	 * // Searching element in the stack static void stack_search(Stack<Integer>
	 * stack, int element) { Integer pos = (Integer) stack.search(element);
	 * 
	 * if(pos == -1) System.out.println("Element not found"); else
	 * System.out.println("Element is found at position " + pos); }
	 * 
	 * 
	 */
	    public static void main(String[] args) {
	        
	        CubbyHole c = new CubbyHole();
	        
	        Producer p1 = new Producer(c, 1);
	        Consumer c1 = new Consumer(c, 1);

	        Producer p2 = new Producer(c, 2);
	        Consumer c2 = new Consumer(c, 2);
	        
	        p1.start();
	        c1.start();
	        p2.start();
	        c2.start();
	        
		/*
		 * Set<Producer> set=new HashSet<Producer>(); set.add(p1); set.add(p2);
		 * Iterator<Producer> itr=set.iterator(); while (itr.hasNext())
		 * System.out.print("Producer set: "+itr.next() + "\n");
		 */
			

	    }
}

