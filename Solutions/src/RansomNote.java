public class RansomNote {

	// https://leetcode.com/problems/ransom-note/
	static boolean canConstruct(String ransomNote, String magazine) {
		int[] alph1 = new int['z' + 1];
		int[] alph2 = new int['z' + 1];

		// may optimize
		if (magazine.length() < ransomNote.length()) {
			return false;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			alph1[ransomNote.charAt(i)]++;
		}

		for (int i = 0; i < magazine.length(); i++) {
			alph2[magazine.charAt(i)]++;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			if (alph1[ransomNote.charAt(i)] > alph2[ransomNote.charAt(i)]) {
				return false;
			}
		}

		return true;
	}
}
