package projectEuler;

public class Problem1 {

	public static void main(String[] args) {
		
		//Problem:
		//If we list all the natural numbers below 10 that are multiples of 3 or 5,
		//we get 3, 5, 6 and 9. The sum of these multiples is 23.
		//Find the sum of all the multiples of 3 or 5 below 1000.
		
		//Solution: 233168
		//Time token: 0.001804450760548193 Nanoseconds
		
		double startTime = System.nanoTime();
		double endTime = 0;
		int solution = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				solution += i;
			}
		}
		
		System.out.println(solution);
		endTime = System.nanoTime();
		System.out.println("Time token for execution in Nanoseconds: " + (int) endTime/startTime);
		
	}

}
