package dev.coding.challenges;

public class LargestGapInAnArray {
	/*
	 * Largest gap in an array:
	 * 
	Given an unsorted array of length N, and we have to find the largest gap between any two elements of the array. 
	In simple words, find max(|Ai-Aj|) where 1 ≤ i ≤ N and 1 ≤ j ≤ N.

	Input : arr = {3, 10, 6, 7}
	Output : 7
	Explanation : Here, we can see largest gap can be found between 3 and 10 which is 7

	 */
	public static void main(String[] args) {
		
	int[] arr = {3, 10, 6, 7};
	int[] arr1 = {-3, -1, 6, 7, 0};
	
		System.out.println(largestGap(arr));
		System.out.println(largestGap(arr1));

	}

	static int largestGap(int arr[]) {
		
		if(arr.length ==0) {
			return 0;
		}
		
		int largestGap = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int dif = arr[j] - arr[i];
				if(dif > largestGap) {
					largestGap = dif;
				}
			}
		}
		
		return largestGap;
	}
}
