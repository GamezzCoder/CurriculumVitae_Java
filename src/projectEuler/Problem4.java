package projectEuler;

import java.util.Vector;

public class Problem4 {

	public static void main(String[] args) {
	
		//Problem:
		//A palindromic number reads the same both ways. 
		//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		//Find the largest palindrome made from the product of two 3-digit numbers.
		
		//Solution: 906609
		//Time token: 1.0000745086980973 Nanoseconds
		
		double startTime = System.nanoTime();
		double endTime = 0;
		Vector<Integer> palindromes = new Vector<Integer>();
		int solution = 0;
		
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				if (Problem4.isPalindrome(i*j)) {
					palindromes.add(i*j);
				}
			}
		}
		
		for (int i = 0; i < palindromes.size(); i++) {
			if (i == 0) {
				solution = palindromes.elementAt(i);
			} else {
				if (solution < palindromes.elementAt(i)) {
					solution = palindromes.elementAt(i);
				}
			}
		}
		
		System.out.println(solution);
		endTime = System.nanoTime();
		System.out.println("Time token for execution in Nanoseconds: " + (float) endTime/startTime);
		
	}
	
	public static boolean isPalindrome(int number) {
		boolean palindrome = false;
		
		char[] c = String.valueOf(number).toCharArray();
		char[] c2 = new char[c.length];
		int counter = c2.length-1;
		
		for (int i = 0; i < c2.length; i++) {
			c2[i] = c[counter];
			counter--;
		}
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == c2[i]) {
				palindrome = true;
			} else {
				palindrome = false;
				break;
			}
		}
		
		return palindrome;
	}

}
