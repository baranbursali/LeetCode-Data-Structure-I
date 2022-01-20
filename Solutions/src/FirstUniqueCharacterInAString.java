
public class FirstUniqueCharacterInAString {

	// https://leetcode.com/problems/first-unique-character-in-a-string/
	public static int firstUniqChar(String s) {
		int[] alph = new int['z' + 1];

		for (int i = 0; i < s.length(); i++) {
			alph[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (alph[s.charAt(i)] == 1)
				return i;
		}

		return -1;
	}

}
