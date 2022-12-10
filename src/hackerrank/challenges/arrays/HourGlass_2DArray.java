package hackerrank.challenges.arrays;

public class HourGlass_2DArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

		int greatestHourGlass = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length-2; i++) {
			
			for(int j = 0; j < arr.length-2; j++) {
				
				for(int k = i; k < i+3; k++) {
					
					sum = 0;
					for(int l = j; l < j+3; l++) {
						
						if(k + 2 >= arr.length) return greatestHourGlass;
						if(l + 2 >= arr.length) {
							l = l + 2; 
							continue;
						}
						
						sum = sum + arr[k][l];
						sum = sum + arr[k][l+1];
						sum = sum + arr[k][l+2];
						sum = sum + arr[k+1][l+1];
						sum = sum + arr[k+2][l];
						sum = sum + arr[k+2][l+1];
						sum = sum + arr[k+2][l+2];
						
						System.out.println("sum: "+sum);
						
						if(greatestHourGlass < sum) greatestHourGlass = sum;
					}	
				}
			}
		}
		
		return greatestHourGlass;
    }
	
	public static void main(String[] args) {
		
		int[][] arr = {{1, 1, 1, 0, 0, 0},
						{0, 1, 0, 0, 0, 0},
						{1, 1, 1, 0, 0, 0},
						{0, 0, 2, 4, 4, 0},
						{0, 0, 0, 2, 0, 0},
						{0, 0, 1, 2, 4, 0}};
		
		System.out.println("greatest hour glass: "+hourglassSum(arr));

	}

}
