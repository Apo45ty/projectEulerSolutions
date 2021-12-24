package projecteuler;

import java.math.BigInteger;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum1 = new BigInteger("0");
		int sum2 = 0;
		for(int i = 1;i<=100;i++) {			
			BigInteger num = new BigInteger(""+i);
			sum1 = sum1.add(num.pow(2));
			sum2+=i;
		}
		BigInteger sum3 = new BigInteger(""+sum2).pow(2);
		System.out.println(sum1.subtract(sum3));

	}

}
