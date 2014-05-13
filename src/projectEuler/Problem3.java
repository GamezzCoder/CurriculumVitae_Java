package projectEuler;

public class Problem3 {

	public static void main(String[] args) {
		
		//Problem:
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
		
		//Solution: 6857
		//Time token:  1.0007166040752602 Nanoseconds
		
		double startTime = System.nanoTime();
		double endTime = 0;
		double number = 600851475143.0;
		int range = 200000;
		double solution = 0;
		
		if (Problem3.isPrime(number)) {
			solution = number;
		} else {
			
			while (number != 1) {
				for (int i = 0; i < range; i++) {
					if (Problem3.isPrime(i)) {
						if (number % i == 0) {
							number /= i;
							solution = i;
						}
					}
				}
			}
			
		}
		
		System.out.println((long)solution);
		endTime = System.nanoTime();
		System.out.println("Time token for execution in Nanoseconds: " + (float) endTime/startTime);
		
	}
	
	
	//I wrote a algorithm to see if a number is a prime
	//but the computation took too long...
	//This algorithm is from http://java.soeinding.de/content.php/primzahl
	//Thanks to you guys!
    public static boolean isPrime(double value) { 
        if (value <= 16) { 
            return (value == 2 || value == 3 || value == 5 || value == 7 || value == 11 || value == 13); 
        } 
        if (value % 2 == 0 || value % 3 == 0 || value % 5 == 0 || value % 7 == 0) { 
            return false; 
        } 
        for (long i = 10; i * i <= value; i += 10) { 
            if (value % (i+1) == 0) {  // 11, 21, 31, 41, 51, ... 
                return false; 
            } 
            if (value % (i+3) == 0) {  // 13, 23, 33, 43, 53, ... 
                return false; 
            } 
            if (value % (i+7) == 0) {  // 17, 27, 37, 47, 57, ... 
                return false; 
            } 
            if (value % (i+9) == 0) {  // 19, 29, 39, 49, 59, ... 
                return false; 
            } 
        } 
        return true; 
    }

}
