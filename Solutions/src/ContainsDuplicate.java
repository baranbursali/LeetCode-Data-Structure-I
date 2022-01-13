import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class ContainsDuplicate {

	// https://leetcode.com/problems/contains-duplicate/
	private static boolean containsDuplicate(int[] num) {
		HashSet<Integer> set = new HashSet<>();

		IntStream is = Arrays.stream(num).parallel();
		is.takeWhile(i -> !set.contains(i)).forEach(i -> set.add(i));

		return set.size() != num.length;
	}
}
