package projecteuler;

public class Problem2 {
	public static void main(String[] args) {
		int fib = 1;
		int fib2 = 1;
		int fib3 = fib+fib2;
		int sum = 0;
		while(fib3<4000000) {
			if(fib3%2==0) {
				sum+=fib3;
			}
			fib=fib2;
			fib2=fib3;
			fib3=fib+fib2;
		}
		System.out.println(sum);
	}
}
