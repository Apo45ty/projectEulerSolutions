package projecteuler;

public class Problem4 {

	public static void main(String[] args) {
		int max = 0;
		for(int i=0;i<1000;i++) {
			for (int j=1;j<1000;j++) {
				int num = i*j;
				String numString = ""+num;
				String reverseNum = reverseString(numString);
				if(numString.equals(reverseNum)) {
					System.out.println(numString+"=="+reverseNum);
					if(max<num) {
						max=num;
					}
				}
			}
		}
		System.out.println("Max="+max);
	}
	public static String reverseString(String s) {
		String result = "";
		for(char c : s.toCharArray()) {
			result=c+result;
		}
		return result;
	}
}
