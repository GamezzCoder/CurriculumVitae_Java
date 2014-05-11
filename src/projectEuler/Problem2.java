package projectEuler;

import java.util.Vector;

public class Problem2 {

	public static void main(String[] args) {
	
		//Problem:
		//Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
		//By starting with 1 and 2, the first 10 terms will be:
		//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		//By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
		//find the sum of the even-valued terms.
		
		//Solution: 4613732
		//Time token: 9.31659778249988E-4 Nanoseconds
		
		double startTime = System.nanoTime();
		double endTime = 0;
		int limit = 4000000;
		int index = 2;
		Vector<Integer> fibonaccis = new Vector<Integer>();
		int solution = 2;
		
		fibonaccis.add(0, 1);
		fibonaccis.add(1, 2);
		
		while (fibonaccis.lastElement() < limit) {
			fibonaccis.add(fibonaccis.elementAt(index-2)+fibonaccis.elementAt(index-1));
			if (fibonaccis.elementAt(index) % 2 == 0) {
				solution += fibonaccis.elementAt(index);
			}
			index++;
		}
		
		
		System.out.println(solution);
		endTime = System.nanoTime();
		System.out.println("Time token for execution in Nanoseconds: " + (int) endTime/startTime);
		
	}

}
