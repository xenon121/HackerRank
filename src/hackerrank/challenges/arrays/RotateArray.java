package hackerrank.challenges.arrays;

import java.util.Arrays;

public class RotateArray {

	public static int[] performRotation(int[] a, int d) {
		
		int temp = 0;
		int newIndex = 0;
		int[] newArr = new int[a.length];
		
		// using two loop but single array
		/*for(int i=0; i < d; i++) {
			
			for(int j=0; j < a.length; j++) {
				
				newIndex = (j + 1) % a.length;
				
				if(j == 0) temp = a[j];
				a[j] = a[newIndex];
			}
			
			a[a.length-1] = temp;	
		}*/
		
		// using second array but single loop
		for(int i=0; i < a.length; i++) {
			
			newIndex = (i+d) % a.length;
			
			newArr[i] = a[newIndex];
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5}; 

		int d = 4;
		
		a = performRotation(a,d);
		
		Arrays.stream(a).forEach(System.out::println);
	}

}
