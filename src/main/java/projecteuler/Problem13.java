import java.math.BigInteger;

public class Problem13{
    public static void main(String args[]){
        boolean done = false;
        int iNum = 7;
        while(!done){
            BigInteger num = BigInteger.ZERO;
            iNum++;
            for(int i=1;i<=iNum;i++){
                num=num.add(new BigInteger(""+i));
            }
            System.out.println();
            System.out.print(num+" "+(iNum));
            done=getDivisorCount(num)>500;
        }

    }

    public static int getDivisorCount(BigInteger count){
        int result = 2;
        System.out.print(" : ");
        BigInteger iSqrt = sqrt(count);
        for(BigInteger i=new BigInteger("2");i.compareTo(iSqrt)<0;i=i.add(BigInteger.ONE)){
            if(count.mod(i).compareTo(BigInteger.ZERO)==0){
                System.out.print(i+",");
                result+=2;
            }
        }
        return result;
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