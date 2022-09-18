package part22;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		StackSample sample = new StackSample();
		sample.checkPop();

	}
	public void checkPeek() {
		Stack<Integer> intStack = new Stack<Integer>();
	
		for(int loop=0; loop<5; loop++) {
			intStack.push(loop); //1
			
			System.out.println(intStack.peek()); //2
		}
		System.out.println("size="+intStack.size());
	}
	public void checkPop() {
		Stack<Integer> intStack = new Stack<Integer>();
		for(int loop=0; loop<5; loop++) {
			intStack.push(loop); //1
			
			System.out.println(intStack.pop()); //2
		}
		System.out.println("size="+intStack.size());
	
	}

}
