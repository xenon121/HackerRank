package hackerrank.challenges;

public class CountingValley {

    public static int countingValleys(int steps, String path) {

    	int hicker = 0;
    	int valley = 0;
    	
    	for(int i = 0; i < path.length(); i++) {
    		
    		if(path.charAt(i) == 'D') {
    			
    			if(hicker == 0) valley++;
    			hicker--;
    			
    		}else {
    			hicker++;
    		}
    	}
    	
        return valley;
    }
	
	public static void main(String[] args) {
		
		String path = "DDUUUDDUUD";
		int steps = path.length();

		System.out.println("Total valley visited: "+countingValleys(steps, path));
	}

}
