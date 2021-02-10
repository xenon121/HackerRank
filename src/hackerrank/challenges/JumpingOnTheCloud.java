package hackerrank.challenges;

public class JumpingOnTheCloud {

    static int jumpingOnClouds(int[] c) {
    	
    	int jumps = 0, clouds = 0, n = c.length;
    	
    	while(clouds < n) {
    		
    		if(clouds + 2 < n &&  c[clouds + 2] == 0) {
    			jumps++;
    			clouds = clouds + 2;
    			
    		}else if(clouds + 1 < n && c[clouds + 1] == 0) {
    			jumps++;
    			clouds = clouds + 1;
    			
    		}else {
    			return jumps;
    		}
    	}
    	
		return jumps;


    }
	
	public static void main(String[] args) {
		
		//int[] c = {0, 0, 0, 1, 0, 0};
		
		//int[] c = {0, 0, 1, 0, 0, 1, 0};
		int[] c = {0, 1, 0, 0, 0, 1, 0};
		System.out.println("total steps taken: "+jumpingOnClouds(c));
	}

}
