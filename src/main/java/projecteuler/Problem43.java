package projecteuler;

public class Problem43 {

	public static void main(String[] args) {
		String number = "0123456789";
		permute(number,0,number.length()-1);
		System.out.println(sum);
	}
	private static long sum = 0;
	private static void permute(String str, int l, int r) 
    { 
        if (l == r) {
        	if(str.equals("4130952867")) {
        		System.out.println("");
        	}
    		int n234 = Integer.parseInt(str.substring(1, 4));
    		int n345 = Integer.parseInt(str.substring(2, 5));
			int n456 = Integer.parseInt(str.substring(3, 6));
			int n567 = Integer.parseInt(str.substring(4, 7));
			int n678 = Integer.parseInt(str.substring(5, 8));
			int n789 = Integer.parseInt(str.substring(6, 9));
			int n8910 = Integer.parseInt(str.substring(7));
    		
			
    		if(n234%2==0) {
    			if(n345%3==0) {
        			if(n456%5==0) {
            			if(n567%7==0) {
                			if(n678%11==0) {
                    			if(n789%13==0) {
                        			if(n8910%17==0) {
                            			sum+=Long.parseLong(str);
                            		}
                        		}
                    		}
                		}
            		}
        		}
    		}
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}
