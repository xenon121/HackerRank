package hackerrank.challenges;

import java.io.IOException;
import java.util.Arrays;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        
    	Arrays.sort(ar);
    	int totalPairs = 0;
    	long sockCount = 0;
    	int[] i = {0};
    	
    	for(i[0] = 0; i[0] < n; i[0]++) {
    		
    		sockCount = Arrays.stream(ar).filter(a -> a == ar[i[0]]).count();
    		
    		if(sockCount > 1) {
    			totalPairs = (int) (totalPairs + (sockCount/2));
    		}
    		
    		i[0] = (int) (i[0] + sockCount - 1);
    	}
    
    	return totalPairs;
    }
	
	public static void main(String[] args) throws IOException {
    
		//int[] ar = {10, 20, 20, 10, 10, 30, 50, 10};
		int[] ar = {1,2,1,2,1,3,2,1,3};
		int n = ar.length;
		
		System.out.println("total possible pairs: "+sockMerchant(n, ar));
	}

}
