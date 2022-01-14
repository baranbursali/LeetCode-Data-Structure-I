import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoSum {

	// https://leetcode.com/problems/two-sum/
	private static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

		int first = IntStream.range(0, arr.length).filter(i -> map.containsKey(target - arr[i]))
				.filter(i -> i != map.get(target - arr[i])).findFirst().getAsInt();

		return new int[] { first, map.get(target - arr[first]) };
	}
}
