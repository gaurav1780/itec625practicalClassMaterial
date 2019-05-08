package itec625methodsWorkshop;

public class AllInOne {
	/**
	 * Q1
	 * @param a
	 * @param b
	 * @return smaller of the two values
	 */
	public static int smaller(int a, int b) {
		return 0; //to be completed
	}

	/*
	 * Q2
	 * Define a method sameOddity based on following specs.
	 * Once you define the method, uncomment the comment 
	 * block for testSameOddity in AllInOneTest.java 
	 * @param a
	 * @param b
	 * @return true if both a and b are even 
	 * or both a and b are odd, false in all other cases
	 */

	/**
	 * Q3
	 * @param n (assume n > 0)
	 * @return sum of the first n positive integers.
	 * for example,
	 * if n = 4, return 10 (1+2+3+4)
	 * if n = 6, return 21 (1+2+3+4+5+6)
	 * 
	 * you should do this using a loop and NOT use
	 * the gaussian formula sum(n) = n*(n+1)/2
	 */
	public static int sum(int n) {
		return 0; //to be completed
	}

	/**
	 * Q4
	 * @param n (assumed to be non-negative)
	 * @return highest digit in the number. 
	 * for example,
	 * if n = 18293, return 9
	 * if n = 45123, return 5
	 * if n = 10, return 1
	 * if n = 0, return 0
	 */
	public static int maxDigit(int n) {
		return 0; //to be completed
	}
	
	/**
	 * Q5
	 * @param n assumed to be more than 0
	 * @param loc assumed to be between 0 and (number of digits in n - 1)
	 * @return digit at that location
	 * for example, 
	 * if n = 1729, loc = 0, return 9
	 * if n = 1729, loc = 1, return 2
	 * if n = 1729, loc = 2, return 7
	 * if n = 1729, loc = 3, return 1
	 * 
	 * if n = 508832, loc = 4, return 0
	 */
	public static int getDigit(int n, int loc) {
		return 0; //to be completed
	}

	/**
	 * 
	 * DO NOT MODIFY THIS METHOD
	 * It acts as a helper to displayPrimes
	 * @param n
	 * @return true if n is a prime number, false otherwise
	 */
	public static boolean isPrime(int n) {
		return false; //to be completed
	}

	/**
	 * Q6
	 * @param a
	 * @param b
	 * @return product of all primes in range [a, b]
	 * 
	 * for example, if a = 6 and b = 19, return
	 * 7*11*13*17*19 = 323323
	 * 
	 * Tip: call method isPrime
	 */
	public static int primeProduct(int a, int b) {
		return 0; //to be completed
	}

	/**
	 * Q7
	 * CHALLENGING
	 * @param a (assume it's non-negative)
	 * @param b (assume it's non-negative) 
	 * @param start (assume in range [1, 8])
	 * @param end (assume more than or equal to start and in range [1, 8])
	 * @return result of applying a bitwise and 
	 * on a and b in the bit range start to end 
	 * for example,
	 * a = 119 (00000000000000000000000001110111)
	 * b = 95  (00000000000000000000000001011111)
	 * start = 2
	 * end = 5
	 * 
	 * a = 000000000000000000000000 01   1101   11
	 * b = 000000000000000000000000 01   0111   11
	 *                                   &&&&  
	 * c = 000000000000000000000000 00   0101   00
	 * 
	 * return 00000000000000000000000000010100 = 20
	 */
	public static int andSelectedBits(int a, int b, int start, int end) {
		return 0; //to be completed
	}
}
