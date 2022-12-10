package hackerrank.challenges;

public class RepeatedStringAlgo {

	static long findOccurance(String s, long limit) {
		
    	long count = 0;
    	
    	for(int i = 0; i < limit; i++) {	
    		if(s.charAt(i) == 'a') count++;
    	}
    	
		return count;
	}
	
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	if(s.length() == 1) {
    		
    		if(s.charAt(0) == 'a') {
    			return n;
    			
    		}else {
    			return 0;
    		}
    	}
    	
    	long ratioOfGivenStringLen = findOccurance(s, s.length());
    	
    	if(ratioOfGivenStringLen == 0) return ratioOfGivenStringLen;
    	
    	long lenByRatio = (n / s.length()) * s.length();
    	
    	long partialRepeatedCount = ((ratioOfGivenStringLen * lenByRatio) / s.length());
    	
    	long missingLen = n - lenByRatio;
    	
    	return partialRepeatedCount + findOccurance(s, missingLen);
    	
    }
	
	public static void main(String[] args) {
		
		String s = "xtx";
		long n = 970770;
		
		System.out.println("total repeated String: "+repeatedString(s, n));
		
	}

}
