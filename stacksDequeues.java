package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stacksDequeues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			//Implementing Stacks Using Dequeues	
				
				Deque<Integer> stack = new ArrayDeque<>();

		        // Pushing elements onto the stack
		        stack.push(1);
		        stack.push(2);
		        stack.push(3);

		        // Popping elements from the stack
		        System.out.println(stack.pop()); // 3
		        System.out.println(stack.pop()); // 2
		        
		       

		        // Peek at the top element without removing it
		        System.out.println(stack.peek()); //1

			}

		

	}


