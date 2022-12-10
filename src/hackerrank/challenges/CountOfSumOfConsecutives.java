package hackerrank.challenges;

public class CountOfSumOfConsecutives {

	/*
	 * problem statement: Given a number N, the task is find the number of ways to represent 
	 * this number as a sum of 2 or more consecutive natural numbers.
	 * 
	 * link: https://practice.geeksforgeeks.org/problems/count-of-sum-of-consecutives3741/1
	 */
	
	public static int sumOfConsecutives(int N) {
		
		if(N == 1) return 0;
		
		int len, sum, cosecutiveWays = 0;
		
		if((N | 1) == N) {
			len = (N/2) + 1;
		}else {
			len = N/2;
		}
		
		for(int i = len; i > 0; i--) {
			
			sum = 0;
			
			for(int j = i; j > 0; j--) {
				
				sum = sum + j;
				
				if(sum > N) {
					break;
					
				}else if(sum == N) {
					++cosecutiveWays;
					break;
				}
			}
			
		}
		
		return cosecutiveWays;
	}
	
	public static void main(String[] args) {
		
		int N = 5;
		
		System.out.println(sumOfConsecutives(N));

	}

}
