import java.math.BigInteger;

public class Problem15{
    public static void main(String[] args){
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        int maxCount = 1;
        int maxNum = 1;
        for(int i=2;i<1_000_000;i++){
            boolean done = false;
            BigInteger bi = new BigInteger(""+i);
            // System.out.print("\n"+i+" : "+bi);
            int count = 1;
            while(!done){
                count++;
                if(bi.mod(two).compareTo(BigInteger.ZERO)==0){
                    bi=bi.divide(two);
                } else {
                    bi=bi.multiply(three).add(BigInteger.ONE);
                }
                // System.out.print("->"+bi);
                done = bi.compareTo(BigInteger.ONE)<=0;
            }
            // System.out.print(" count:"+count+" num:"+i);
            if(count>maxCount){
                maxCount=count;
                maxNum=i;
                System.out.print("\n Max:"+maxCount+" num:"+i);
            }
        }
        System.out.println(maxNum);
    }
}