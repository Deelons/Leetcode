public class ransomNote {
	public boolean canConstruct(String ransomNote,String magazine) {
		int[] cnt = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			cnt[magazine.charAt(i) - 'a']++;
		}

		for (int i = 0; i < magazine.length(); i++) {
			if (--cnt[ransomNote.length() - 'a'] < 0) {
				return false;
			}
		}

		return true;
	}
}