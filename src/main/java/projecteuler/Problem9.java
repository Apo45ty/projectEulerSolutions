package projecteuler;

public class Problem9 {

	public static void main(String[] args) {
		for(int i=1;i<998;i++) Loop: {
			for(int j=1;j<998;j++) {
				for(int k=0;k<998;k++) {
					if(i+j+k!=1000) {
						continue;
					}
					if(i<j&&j<k&&Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2)) {
						System.out.println("a="+i+" b="+j+" c="+k);
						break Loop; 
					}
				}
			}
		}
	}

}
