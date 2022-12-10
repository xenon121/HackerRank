package hackerrank.challenges.arrays;

import java.util.Arrays;

public class MinimumSwaps2 {

	public static int peformSwapForSorting(int[] arr) {
		
		int swaps = 0, temp;
		int holdJ = 0;
		//boolean holdI = false, holdJ = false;;
		
		for(int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] > arr[i+1]) {
				
				for(int j = arr.length-1; j>i; j--) {
					
					if(arr[j] < arr[j-1]) {
						holdJ = j;
						break;
						
					}
				}
				
				temp = arr[i];
				arr[i] = arr[holdJ];
				arr[holdJ] = temp;
				
				++swaps;
				
				i = 0;
				
				Arrays.stream(arr).forEach(System.out::println);
				System.out.println("-----"+swaps);
			}
		}
		
		System.out.println("final-------");
		Arrays.stream(arr).forEach(System.out::println);
		
		return swaps;
	}
	
	public static void main(String[] args) {
		
		//int[] arr = {4,3,1,2};
		int[] arr = {7, 1, 3, 2, 4, 5, 6}; 
		
		System.out.println("total swaps: "+peformSwapForSorting(arr));

	}

}
