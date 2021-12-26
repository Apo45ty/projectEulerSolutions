package projecteuler;

import java.math.BigInteger;

public class Problem10 {
	public static void main(String[] args) {
		int num = 2;
		BigInteger sum = new BigInteger("0");
		for(;num<2000000;num++) {
			if(isPrime(num)) {
				sum=sum.add(new BigInteger(""+num));
			}
		}
		System.out.println(sum);

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
