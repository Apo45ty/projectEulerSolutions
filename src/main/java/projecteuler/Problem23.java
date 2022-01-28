
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem23 {

	public static void main(String[] args) {
		List<Integer> abundantNumbers =new LinkedList<Integer>();
		findAllAbundantNumbers(abundantNumbers);
	}

	private static void findAllAbundantNumbers(List<Integer> abundantNumbers) {
		for(int i=0;i<28123 ;i++) {
			if(isAbundantNumber(i)) {
				abundantNumbers.add(i);
			}
		}
	}

	private static boolean isAbundantNumber(int number) {
		Integer[] factors = getFactors(number);
		int sum = 0;
		for(int i : factors)
			sum+=i;
		return sum>number;
	}

	private static Integer[] getFactors(int number) {
		List<Integer> result = new ArrayList<Integer>();
		int currvalue = number;
		for(int i=number-1;currvalue>1;i--)
		{
			if(currvalue%i==0) {
				currvalue = currvalue / i;
				result.add(i);
			}
		}
		return result.toArray(new Integer[0]);
	}
}
