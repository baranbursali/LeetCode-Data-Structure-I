import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

	// https://leetcode.com/problems/intersection-of-two-arrays-ii/
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < nums2.length; i++) {
			map.putIfAbsent(nums2[i], 0);
			map.put(nums2[i], map.get(nums2[i]) + 1);
		}
		for (int i = 0; i < nums1.length; i++) {
			if (map.get(nums1[i]) != null && map.get(nums1[i]) > 0) {
				map.put(nums1[i], map.get(nums1[i]) - 1);
				arrList.add(nums1[i]);
			}
		}

		int[] arr = new int[arrList.size()];
		for (int i = 0; i < arrList.size(); i++)
			arr[i] = arrList.get(i);
		return arr;
	}

}
