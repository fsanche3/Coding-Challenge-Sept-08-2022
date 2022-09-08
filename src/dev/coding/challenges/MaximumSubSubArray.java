package dev.coding.challenges;

public class MaximumSubSubArray {
	/*	Maximum Sum SubArray using Divide and Conquer:
	 * 
	 * Given an array arr[] of integers, the task is to find the maximum sum sub-array among all the possible sub-arrays.
	 * 
	 * Input: arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4} 
		Output: 6 
		{4, -1, 2, 1} is the required sub-array.
		Input: arr[] = {2, 2, -2} 
		Output: 4 
	 */
	
	
	public static void main(String[] args) {

	int	arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	int arr1[] = {2, 2, -2};
	
		System.out.println(MaxSubArray(arr));
		System.out.println(MaxSubArray(arr1));

	}
	
	static int MaxSubArray(int[] arr) {
		int mid, sum1 = 0;
		int sum2 = 0;

		
		 mid = arr.length / 2;
		
		for(int i = 0; i < arr.length - 1; i ++) {
			for(int j = i; j < arr.length; j ++) {
				sum2 = sum2+ arr[j];
				if(sum1 < sum2) {
					sum1 = sum2;
				}
			}
		}
		return sum1;
		
	}

}
