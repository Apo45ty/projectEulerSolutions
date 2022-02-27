import java.math.BigInteger;

public class Problem17{
    public static void main(String[] args){
        BigInteger power = new BigInteger("2");
        power = power.pow(1000);
        String powerString = power.toString();
        BigInteger result = BigInteger.ZERO;
        for(char a : powerString.toCharArray()){
            result = result.add(new BigInteger(""+a));
        }
        System.out.println(result);
    }
}