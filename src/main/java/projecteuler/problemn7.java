package projecteuler;

import java.math.BigInteger;

public class problemn7 {

	public static void main(String[] args) {
		int primecount = 10001;
		int currPrime = 1;
		BigInteger i = new BigInteger("1");
		while(currPrime <= currPrime) {
			BigInteger currNumber=(i.multiply(BigInteger.TWO).add(BigInteger.ONE));
			i.add(BigInteger.ONE);
			if(isPrime(currNumber)) {
				currPrime++;
				System.out.println("Found a prime "+currPrime+" value="+currNumber);
			}
			
		}
	}
	public static boolean isPrime(BigInteger e) {
		BigInteger temp = new BigInteger("2");
		BigInteger two = sqrt(e);
		while(temp.compareTo(two) < 0 ) {
			if(e.mod(temp)==BigInteger.ZERO) {
				return false;
			}
			temp=temp.add(BigInteger.ONE);
		}
		return true;
	}
	public static BigInteger sqrt(BigInteger x) {
	    BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
	    BigInteger div2 = div;
	    // Loop until we hit the same value twice in a row, or wind
	    // up alternating.
	    for(;;) {
	        BigInteger y = div.add(x.divide(div)).shiftRight(1);
	        if (y.equals(div) || y.equals(div2))
	            return y;
	        div2 = div;
	        div = y;
	    }
	}
}
