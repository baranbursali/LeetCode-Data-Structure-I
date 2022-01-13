public class MaximumSubarray {

	// https://leetcode.com/problems/maximum-subarray/
	private static int maxSubArrSum(int[] arr) {
		int max = arr[0];
		int tillNow = arr[0];

		if (arr.length != 1) {
			for (int i = 1; i < arr.length; i++) {
				if (tillNow >= 0) {
					max = Math.max(max, arr[i] + tillNow);
					tillNow = arr[i] + tillNow;
				} else {
					max = Math.max(max, arr[i]);
					tillNow = arr[i];
				}
			}
		}

		return max;
	}
}
