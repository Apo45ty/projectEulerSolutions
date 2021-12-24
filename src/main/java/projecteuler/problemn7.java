package projecteuler;

import java.math.BigInteger;

public class problemn7 {

	public static void main(String[] args) {
		int primecount = 10001;
		int currPrime = 1;
		for(int i=2;currPrime <= primecount;i++) {
			if(isPrime(i)) {
				System.out.println("Found a prime "+currPrime+" value="+i);
				currPrime++;
			}
		}
	}
	public static boolean isPrime(int e) {
		int two = (int)Math.sqrt(e);
		for(int temp=2;temp<=two;temp++) {
			if(e%temp==0) {
				return false;
			}
		}
		return true;
	}
	
}
