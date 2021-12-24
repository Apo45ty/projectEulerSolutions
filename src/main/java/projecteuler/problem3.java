package projecteuler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class problem3 {

	public static void main(String[] args) {
		BigInteger e = new BigInteger("600851475143");
		List<BigInteger> factors = findFactors(e);
		BigInteger max = factors.get(0);
		System.out.println("Finding largest Prime");
		for(BigInteger i:factors) {
			if(isPrime(i)&&i.compareTo(max)>0) {
				max=i;
			}
		}
		System.out.println(max);
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
	public static List<BigInteger> findFactors(BigInteger e){
		System.out.println("Finding factors for "+e.toString());
		List<BigInteger> factors = new LinkedList<BigInteger>();
		BigInteger temp = new BigInteger("1");
		BigInteger two = sqrt(e);
		System.out.println(two);
		while(temp.compareTo(two) < 0 ) {
			if(e.mod(temp)==BigInteger.ZERO) {
				System.out.println("Factors added : "+temp);
				factors.add(temp);
				factors.add(e.divide(temp));
			}
			temp=temp.add(BigInteger.ONE);
		}
		return factors;
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
}
