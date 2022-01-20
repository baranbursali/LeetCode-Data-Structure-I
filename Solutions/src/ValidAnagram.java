
public class ValidAnagram {

	// https://leetcode.com/problems/valid-anagram/
	boolean isAnagram(String s, String t) {
		int[] alph1 = new int['z' + 1];
		int[] alph2 = new int['z' + 1];

		// may optimize
		if (s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			alph1[s.charAt(i)]++;
		}

		for (int i = 0; i < t.length(); i++) {
			alph2[t.charAt(i)]++;
		}

		String alph = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 26; i++) {
			if (alph1[alph.charAt(i)] != alph2[alph.charAt(i)]) {
				return false;
			}
		}

		return true;
	}

}
