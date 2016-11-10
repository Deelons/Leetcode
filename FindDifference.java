public class FindDifference {
	public char findTheDifference(String s,String t) {
		char[] a = new char[s.length()];
		char[] b = new char[t.length()];
		a = s.toCharArray();
		b = t.toCharArray();
		char res = 0;
		for (char c : a) res ^= c;
		for (char c : b) res ^= c;
		return res;
	}

/*	public static void main(String[] args) {
		FindDifference findTheDifference = new FindDifference();
		System.out.println(findTheDifference.findTheDifference("abcd","cadbe"));
	}*/
}