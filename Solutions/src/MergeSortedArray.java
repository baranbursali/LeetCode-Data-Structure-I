public class MergeSortedArray {

	// https://leetcode.com/problems/merge-sorted-array/
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;

		int[] tmp = new int[m + n];
		int ti = 0;

		if (n != 0) {
			while (i < m && j < n) {
				if (nums1[i] > nums2[j]) {
					tmp[ti++] = nums2[j];
					j++;
				} else {
					tmp[ti++] = nums1[i];
					i++;
				}
			}
			while (i < m) {
				tmp[ti++] = nums1[i++];
			}
			while (j < n) {
				tmp[ti++] = nums2[j++];
			}
			for (int ix = 0; ix < tmp.length; ix++) {
				nums1[ix] = tmp[ix];
			}
		}

		return tmp;
	}

	public static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;

		while (j > -1) {
			if (i > -1 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}

		return nums1;
	}
}
