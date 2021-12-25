package projecteuler;

import java.math.BigInteger;

public class Problem5 {

	public static void main(String[] args) {
		BigInteger num = new BigInteger(""+2520);
		do loop:{
//			System.out.println();
//			System.out.print(num+":");
			for(int i=20;i>=11;i--) {
//				System.out.print(i+"x");
				if(num.mod(new BigInteger(""+i))!=BigInteger.ZERO)
					break;
				if(i==11) {
					System.out.println(num);
					break loop;
				}
			}
			num=num.add(BigInteger.ONE);
		}while(true);
	}

}
